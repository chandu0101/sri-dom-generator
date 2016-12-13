package sri.playground.web.components

import sri.core.{ReactComponent, ReactElement}
import sri.playground.web.{Dom, GeneratorUtils, HTMLRawData, SVGRawData}
import sri.web.all._
import sri.web.vdom.htmltags._
import sri.extra.web.components.materialui.components._
import sri.web.styles.WebStyleSheet

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object GeneratorScreen {

  case class State(inputText: String = "", outputText: String = "", inline: Boolean = true, html: Boolean = true)

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())


    def render() = {
      View(style = styles.container)(
        MuiCheckbox(checked = state.inline, label = "Inline", onCheck = onInlineCheck _),
        MuiCheckbox(checked = state.html, label = "Html(If unchecked svg data will be generated)", onCheck = onHtmlCheck _),
        MuiRaisedButton(label = "Generate", onTouchTap = onButtonTap _)(),
        TextArea(
          value = state.outputText,
          style = styles.input)()
      )
    }

    def onInlineCheck(e: ReactEventH, value: Boolean) = {
      setState(state.copy(inline = value))
    }

    def onHtmlCheck(e: ReactEventH, value: Boolean) = {
      setState(state.copy(html = value))
    }

    def onButtonTap(e: ReactTouchEventH) = {
      GeneratorUtils.data = if (state.html) HTMLRawData else SVGRawData
      val out = GeneratorUtils.generateHtmlTags(state.inline)
      //     val out = GeneratorUtils.generateHtmlTagsWithMacro(false)
      setState(state.copy(outputText = out))
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

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)
}