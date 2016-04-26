package sri.playground.web.components

import org.scalajs.dom
import org.scalajs.dom.ext.PimpedNodeList
import org.scalajs.dom.raw.DOMParser
import sri.core.{ReactComponent, ReactElement}
import sri.playground.web.Dom
import sri.playground.web.vdom.VDOM2
import sri.web.all._
import sri.web.extra.components.materialui._
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object HomeScreen {

  case class State(theme: MuiRawTheme = Mui.Styles.LightRawTheme, tabValue: String = "light", inputText: String = "", outputText: String = "")

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())


    def render() = {

      View(style = styles.container)(
        TextArea(
          value = state.inputText,
          style = styles.input, onChange = onTextChange _)(),
        MuiRaisedButton(label = "Convert", onTouchTap = onButtonTap _)(),
        TextArea(
          value = state.outputText,
          style = styles.input)(),
        VDOM2.div(id = "man")("Hello babes"),
        VDOM2.span(id = "man",tabIndex = 1)("Hello babes"),
        VDOM2.span(id = "man",tabIndex = 1)(null),
        VDOM2.input(id = "man",tabIndex = 1)
      )
    }

    def onButtonTap(e: ReactTouchEventH) = {
      val parsedNode = new DOMParser().parseFromString(state.inputText, "text/html")
      dom.window.console.log(s"node ", parsedNode.getElementsByTagName("tbody"))
      val out = parsedNode.getElementsByTagName("tbody").toList.head.childNodes.toList.filter(node => node.nodeName == "TR").map(tr => {
        val tds = tr.childNodes.toList.filter(node => node.nodeName == "TD")
        val th = tr.childNodes.toList.filter(node => node.nodeName == "TH").head
        var elements = tds.head.childNodes.toList.filter(node => node.nodeName == "A").map(a => s""""${a.asInstanceOf[js.Dynamic].innerText.toString.replaceAll("<", "").replaceAll(">", "").trim}"""").toSet
        if (elements.isEmpty) elements = tds.head.childNodes.toList.filter(node => node.nodeName == "CODE").map(node => {
          node.firstChild
        }).map(a => s""""${a.asInstanceOf[js.Dynamic].innerText.toString.replaceAll("<", "").replaceAll(">", "").trim}"""").toSet
        s""""${th.asInstanceOf[js.Dynamic].innerText.toString.replaceAll("-", "").trim}" -> ${elements}"""
      }).mkString(",")
      setState(state.copy(outputText = out))
    }

    def onTextChange(e: ReactEventI) = {
      setState(state.copy(inputText = e.target.value))
    }

    def handleTabChange(value: String, event: ReactEventH, tab: ReactElement) = {
      val theme = if (value == "dark") Mui.Styles.DarkRawTheme else Mui.Styles.LightRawTheme
      setState(state.copy(theme = theme, tabValue = value))
    }

  }

  object styles extends WebStyleSheet {

    val container = style(
      display.flex,
      flexDirection.column,
      flex := 1,
      padding := 70,
      paddingTop := 120)

    val vertical = style(display.flex,
      flexDirection.column)

    val horizontal = style(display.flex,
      flexDirection.row)

    val content = styleE(vertical)(margin := 30, flex := 1)

    val item = style(marginTop := 15)

    val itemsGroup = styleE(vertical)(alignItems.center, marginRight := 70)

    val paper = style(width := 100, height := 100, textAlign.center, display.`inline-block`)

    val slider = style(width := "100%", marginTop := 20)

    val input = style(height := 400, width := 500)

  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])


  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)
}