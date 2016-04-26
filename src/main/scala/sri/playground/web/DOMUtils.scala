package sri.playground.web

import sri.playground.web.RawData._
import sri.web.SyntheticEvent
import sri.web.all._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}


object DOMUtils {


  def getEventAttributes(tag: String) = {
    val events: Set[String] = if (tag == "img") globalEvents.++(imageEvents)
    else if ("auido,video,embed".contains(tag)) globalEvents.++(mediaEvents)
    else globalEvents
    (events.map(e => s"$e: U[(_ <: SyntheticEvent[_]) => _] = undefined").mkString(",\n"),events)
  }

  def getScalaName(name : String) = {
    val scalaPredefineds = Set("type","var","object")
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
    val voidTags = Set("input","img")
    if(voidTags.contains(tag)) "" else s"(children: ReactNode*)"
  }
  def getHtmlTagMethod(tag: String) = {

    val htmlAttrs  = getHtmlAttributes(tag)

    val eventAttrs = getEventAttributes(tag)

    val childrenText = getChildrenText(tag)

    s"""
       | def ${getScalaName(tag)}(
       |  ${htmlAttrs._1},
       |  ${eventAttrs._1})${childrenText}  = {
       |    val props = json()
       |    ${htmlAttrs._2.++(eventAttrs._2).map(s => s"""${getScalaName(s)}.foreach(v => props.updateDynamic("$s")(v))""").mkString("\n")}
       |    React.createElement("$tag",props${if (childrenText.isEmpty) "" else ",children :_*"})
       | }
     """.stripMargin
  }

  def generateHtmlTags() = {
    s"""
       | ${htmlElements.map(getHtmlTagMethod).mkString("\n \n")}
     """.stripMargin
  }

}
