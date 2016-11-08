package sri.playground.web

import sri.core.{React, ReactElement, ReactNode}

import scala.reflect.ClassTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav

package object vdom {


  @inline
  def addJsObjects(in: js.Object, extra: js.Object) = {
    val extraDict = extra.asInstanceOf[js.Dictionary[js.Any]]
    for (key <- extraDict.keys) {
      val v = extraDict(key)
      if (!js.isUndefined(v)) in.asInstanceOf[js.Dynamic].updateDynamic(key)(v)
    }
  }

  @inline
  def inlineReactElement(tag: String, props: js.Object, children: ReactNode*): ReactElement = {
    val ref = props.asInstanceOf[js.Dynamic].ref.asInstanceOf[js.UndefOr[js.Any]]
    if (ref.isDefined)
      React.createElement(tag, props, children: _*)
    else {

      val REACT_ELEMENT_TYPE: js.Any =
        try
          js.Dynamic.global.Symbol.`for`("react.element")
        catch {
          case _: Throwable => 0xeac7
        }
      val key = props.asInstanceOf[js.Dynamic].key.asInstanceOf[js.UndefOr[js.Any]]

      val clen = children.length
      if (clen != 0) {
        val c: js.Any = if (clen == 1) children.head.asInstanceOf[js.Any] else (children.toJSArray)
        props.asInstanceOf[js.Dynamic].updateDynamic("children")(c)
      }

      val output =
        js.Dynamic.literal(
          `$$typeof` = REACT_ELEMENT_TYPE,
          `type` = tag,
          key = key.fold(null: js.Any)("" + _),
          ref = null,
          props = props,
          _owner = null)
          .asInstanceOf[ReactElement]

      //         org.scalajs.dom.console.log("VDOM: ", output)

      output
    }

  }

  /* this works here, but not in the general case!
  * (see https://github.com/scala-js/scala-js/pull/2070 )
  */
//  @deprecated("We need to find a better solution here")
  private[vdom] implicit def UnionEvidence[A: ClassTag, B: ClassTag](ab: A | B)(implicit eva: A => js.Any, evb: B => js.Any): js.Any =
    ab match {
      case a: A => eva(a)
      case b: B => evb(b)
    }
}
