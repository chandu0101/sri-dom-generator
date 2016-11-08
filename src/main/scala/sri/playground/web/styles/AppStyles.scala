package sri.playground.web.styles

import sri.playground.web.components.HomeScreen
import sri.scalacss.Defaults._
import scalacss.mutable.GlobalRegistry
import scalacss.Defaults._


object AppStyles {

 def load() = {
   GlobalRegistry.register(GlobalStyles,HomeScreen.styles2)
   GlobalRegistry.onRegistration(_.addToDocument())
 }

}
