package sri.playground.web.components

import chandu0101.macros.tojs.JSMacro
import sri.core.{React, ReactNode}
import sri.web.all._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}

case class TextArea(style: js.UndefOr[js.Any]= js.undefined,
                    key: js.UndefOr[String] = js.undefined,
                     value : js.UndefOr[String] = js.undefined,
                     onChange :js.UndefOr[ReactEventI => _] = js.undefined ) {

  def apply(children: ReactNode*) = {
    val props = JSMacro[TextArea](this)
    React.createElement("textarea", props, children: _*)
  }
}
