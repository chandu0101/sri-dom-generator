package sri.playground.web

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}


object GeneratorUtils {

  var data : BaseRawData = null


  def getEventAttributes(tag: String) = {
    val events: Set[String] = if (tag == "img") data.globalEvents.++(data.imageEvents)
    else if ("auido,video,embed".contains(tag)) data.globalEvents.++(data.mediaEvents)
    else data.globalEvents
    (events.map(e => s"$e: U[(_ <: SyntheticEvent[_]) => _] = undefined").mkString(",\n"),events)
  }

  def getScalaName(name : String) = {
    if(data.scalaPredefineds.contains(name)) s"`$name`" else name
  }

  def getHtmlAttributes(tag: String) = {
    val x = json()
    val y : js.UndefOr[Int] = js.undefined
    y.foreach(v => x.updateDynamic("y")(v))
    val attrs = data.attributesMeta.filter { case (k, v) => v.tags.head == data.GLOBAL_ELEMENT_ATTRIBUTE || v.tags.contains(tag)}
    (attrs.map { case (k, v) => s"${getScalaName(k)}: U[${v.tpe}] = undefined"}.mkString(",\n"),attrs.keys.toSet)
  }

  def getChildrenText(tag : String) = {
    if(data.voidTags.contains(tag)) "" else s"(children: ReactNode*)"
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
       | def ${getElementMethodName(tag)}(
       |  ${htmlAttrs._1},
       |  ${eventAttrs._1},
       |  extraAttributes: U[js.Object] = undefined)${childrenText}  = {
       |    val props = json()
       |    ${htmlAttrs._2.++(eventAttrs._2).map(s => s"""${getScalaName(s)}.foreach(v => props.updateDynamic("$s")(v))""").mkString("\n")}
       |    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
       |    if (developmentMode) React.createElement("$tag",props${if (childrenText.isEmpty) "" else ",children :_*"})
       |    else inlineReactElement("$tag",props${if (childrenText.isEmpty) "" else ",children :_*"})
       | }
     """.stripMargin
  }

  /**
    *  some elements defined both in html and svg , so we suffixing svg method names to avoid conflicts when htmltags and svgtags imported
    * @param tag
    */
  def getElementMethodName(tag:String) = {
    if(data.isSvg && tag == "a") "aSvg"
    else getScalaName(tag)
  }

  def getHtmlTagMethodWithMacro(tag: String,inline: Boolean) = {

    val htmlAttrs  = getHtmlAttributes(tag)

    val eventAttrs = getEventAttributes(tag)

    val childrenText = getChildrenText(tag)

    s"""
       | ${if(inline) "@inline" else ""}
        | def ${getScalaName(tag)}(
        |  ${htmlAttrs._1},
        |  ${eventAttrs._1},
        |  @exclude extraAttributes: U[js.Object] = undefined)${childrenText} : ReactElement  = {
        |      val props = FunctionMacro()
        |    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
        |    if (developmentMode) React.createElement("$tag",props${if (childrenText.isEmpty) "" else ",children :_*"})
        |    else inlineReactElement("$tag",props${if (childrenText.isEmpty) "" else ",children :_*"})
        | }
     """.stripMargin
  }

  def generateHtmlTags(inline : Boolean = false) = {
    s"""
       |
       |  @js.native
       |  sealed trait InputValue extends js.Any
       |
       |  object InputValue {
       |   implicit def strToIV(str : String) = str.asInstanceOf[js.UndefOr[InputValue]]
       |
       |   implicit def intToIV(in : Int) = in.asInstanceOf[js.UndefOr[InputValue]]
       |
       |   implicit def doubleToIV(in : Double) = in.asInstanceOf[js.UndefOr[InputValue]]
       |
       |  }
       |
       | trait ${if(data.isHtml) "Html" else "Svg"}Tags${if(inline) "Inline" else ""} {
       |
       |   ${data.elements.map(getHtmlTagMethod(_,inline)).mkString("")}
       |
       | }
       |
     """.stripMargin
  }

  def generateHtmlTagsWithMacro(inline : Boolean = false) = {
    s"""
        | trait ${if(data.isHtml) "Html" else "Svg"}Tags${if(inline) "Inline" else ""} {
        |
        |   ${data.elements.map(getHtmlTagMethodWithMacro(_,inline)).mkString("")}
        |
        | }
        |
     """.stripMargin
  }

  def generateTestsForHtmltags() = {

    def getRenderText(tag : String) = {
      val stag = getElementMethodName(tag)
      if(data.voidTags.contains(tag)) s"""render($stag(id = "sri-web"))""" else s"""render($stag(id = "sri-web")("child"))"""
    }

    def getAssert(tag : String) = if(data.voidTags.contains(tag)) s"""<$tag data-reactroot=\\"\\" id=\\"sri-web\\">""" else s"""<$tag data-reactroot=\\"\\" id=\\"sri-web\\">child</$tag>"""

    println(s"data.elements length : ${data.elements.size}")
    val tests =  data.elements.map(tag => {
       s"""
          |  test(\"${tag}\") {
          |    ${getRenderText(tag)}
          |    assert(rootNode.innerHTML == "${getAssert(tag.toLowerCase())}")
          |  }
        """.stripMargin
    })
    tests.mkString("\n")
  }


}
