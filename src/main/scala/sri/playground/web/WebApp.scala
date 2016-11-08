package sri.playground.web

import org.scalajs.dom
import sri.core._
import sri.playground.web.router.AppRouter
import sri.playground.web.styles.AppStyles
import sri.playground.web.vdom._
import sri.web.vdom.htmltags._
import sri.core._
import sri.universal.components._
import sri.web.SyntheticEvent
import sri.web.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scala.scalajs.js.Dynamic.{literal => json}
import sri.web.{SyntheticEvent, ReactDOM}

import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js._
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {




  @JSExport
  override def main(): Unit = {
    val other = json("data-man" -> "yo")
    AppStyles.load()
    ReactDOM.render(AppRouter.router, dom.document.getElementById("app"))
    dom.window.console.log("See Code2:",div(id = "hello",className = "hello",extraAttributes = undefined)())
    dom.window.console.log("See Code3:",div(id = "hello",tabIndex = 1,extraAttributes = undefined)())

  }

}
