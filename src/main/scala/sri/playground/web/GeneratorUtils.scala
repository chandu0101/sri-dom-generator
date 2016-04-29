package sri.playground.web

import sri.playground.web.RawData._
import sri.web.SyntheticEvent
import sri.web.all._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}


object GeneratorUtils {


  def getEventAttributes(tag: String) = {
    val events: Set[String] = if (tag == "img") globalEvents.++(imageEvents)
    else if ("auido,video,embed".contains(tag)) globalEvents.++(mediaEvents)
    else globalEvents
    (events.map(e => s"$e: U[(_ <: SyntheticEvent[_]) => _] = undefined").mkString(",\n"),events)
  }

  def getScalaName(name : String) = {
    if(scalaPredefineds.contains(name)) s"`$name`" else name
  }

  def getHtmlAttributes(tag: String) = {
    val x = json()
    val y : js.UndefOr[Int] = js.undefined
    y.foreach(v => x.updateDynamic("y")(v))
    val attrs = htmlAttributesMeta.filter { case (k, v) => v.tags.head == GLOBAL_ELEMENT_ATTRIBUTE || v.tags.contains(tag)}
    (attrs.map { case (k, v) => s"${getScalaName(k)}: U[${v.tpe}] = undefined"}.mkString(",\n"),attrs.keys.toSet)
  }

  def getChildrenText(tag : String) = {
    if(htmlVoidTags.contains(tag)) "" else s"(children: ReactNode*)"
  }

  def addJsObjects(in : js.Object,extra : js.Object) = {
     val extraDict = extra.asInstanceOf[js.Dictionary[js.Any]]
     for(key <- extraDict.keys) {
       val v = extraDict(key)
       if(!js.isUndefined(v)) in.asInstanceOf[js.Dynamic].updateDynamic(key)(v)
     }
  }

  def getHtmlTagMethod(tag: String,inline: Boolean) = {

    val htmlAttrs  = getHtmlAttributes(tag)

    val eventAttrs = getEventAttributes(tag)

    val childrenText = getChildrenText(tag)

    s"""
       | ${if(inline) "@inline" else ""}
       | def ${getScalaName(tag)}(
       |  ${htmlAttrs._1},
       |  ${eventAttrs._1},
       |  extraAttributes: U[js.Object] = undefined)${childrenText}  = {
       |    val props = json()
       |    ${htmlAttrs._2.++(eventAttrs._2).map(s => s"""${getScalaName(s)}.foreach(v => props.updateDynamic("$s")(v))""").mkString("\n")}
       |    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
       |    React.createElement("$tag",props${if (childrenText.isEmpty) "" else ",children :_*"})
       | }
     """.stripMargin
  }

  def generateHtmlTags(inline : Boolean = false) = {
    s"""
       | trait HtmlTags {
       |
       |   ${htmlElements.map(getHtmlTagMethod(_,inline)).mkString("\n \n")}
       |
       | }
       |
     """.stripMargin
  }


  def generateTestsForHtmltags() = {

    def getRenderText(tag : String) = {
      val stag = getScalaName(tag)
      if(htmlVoidTags.contains(tag)) s"""render($stag(id = "sri-web"))""" else s"""render($stag(id = "sri-web")("child"))"""
    }

    def getAssert(tag : String) = if(htmlVoidTags.contains(tag)) s"""<$tag data-reactroot=\\"\\" id=\\"sri-web\\">""" else s"""<$tag data-reactroot=\\"\\" id=\\"sri-web\\">child</$tag>"""

    println(s"elements length : ${htmlElements.size}")
    val tests =  htmlElements.map(tag => {
       s"""
          |  test(\"${tag}\") {
          |    ${getRenderText(tag)}
          |    assert(rootNode.innerHTML == "${getAssert(tag)}")
          |  }
        """.stripMargin
    })
    tests.mkString("\n")
  }


}
