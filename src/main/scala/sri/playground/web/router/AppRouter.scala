package sri.playground.web.router

import org.scalajs.dom
import sri.core.ReactElement
import sri.playground.web.components.{GeneratorScreen, View, TopNav, HomeScreen}
import sri.extra.web.components.materialui.components._
import sri.web.router._
import sri.web.vdom.htmltags._
import scala.scalajs.js

object AppRouter {

  object HomePage extends WebStaticPage

  object GeneratorPage extends WebStaticPage

  object config extends WebRouterConfig {

    override val history: History = HistoryFactory.browserHistory(if (dom.window.location.host.contains("localhost")) js.undefined else new HistoryOptions(basename = "/sri-dom-gen"))

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, (route: WebRoute) => HomeScreen())
    staticRoute(GeneratorPage, "gen", (route: WebRoute) => GeneratorScreen())

    override def renderScene(route: WebRoute): ReactElement = {
      div()(
        TopNav(),
        super.renderScene(route)
      )
    }

    override val notFound = WebRouteNotFound(initialRoute._1)
  }

  val router = WebRouter(config)
}
