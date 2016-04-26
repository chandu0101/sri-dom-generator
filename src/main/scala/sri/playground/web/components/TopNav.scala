package sri.playground.web.components

import sri.core._
import sri.playground.web.router.AppRouter.{GeneratorPage, HomePage}
import sri.universal.components._
import sri.web
import sri.web.all._
import sri.web.extra.components.materialui.MuiFlatButton
import sri.web.router.WebRouterComponent
import sri.web.styles.WebStyleSheet
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}

object TopNav {


  @ScalaJSDefined
  class Component extends WebRouterComponent[Unit, Unit] {
    def render() = {
      View(style = styles.container)(
       MuiFlatButton(label = "Home",onTouchTap = (e:ReactTouchEventH) => navigateTo(HomePage))(),
       MuiFlatButton(label = "Generator",onTouchTap = (e:ReactTouchEventH) => navigateTo(GeneratorPage))()
      )
    }


  }

  object styles extends WebStyleSheet {

    val container = style(display.flex, flexDirection.row,
      height := 70)
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])
  ctor.contextTypes = web.router.routerContextTypes

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)

}
