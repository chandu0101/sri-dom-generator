package sri.playground.web.router

import sri.core.ReactElement
import sri.playground.web.components.{GeneratorScreen, View, TopNav, HomeScreen}
import sri.web.extra.components.materialui.MuiAppCanvas
import sri.web.router._

object AppRouter {

  object HomePage extends WebStaticPage

  object GeneratorPage extends WebStaticPage

  object config extends WebRouterConfig {

    override val history: History = HistoryFactory.browserHistory()

    override val initialRoute: (WebStaticPage, WebRoute) = defineInitialRoute(HomePage, (route: WebRoute) => HomeScreen())
    staticRoute(GeneratorPage, "gen", (route: WebRoute) => GeneratorScreen())

    override def renderScene(route: WebRoute): ReactElement = {
      MuiAppCanvas()(
        TopNav(),
        super.renderScene(route)
      )
    }

    override val notFound = WebRouteNotFound(initialRoute._1)
  }

  val router = WebRouter(config)
}
