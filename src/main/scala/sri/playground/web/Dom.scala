package sri.playground.web

import sri.core.{React, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichGenMap
import scala.scalajs.js.`|`
import scala.scalajs.js.Dynamic.{literal => json}

object Dom {


  def toProps(in: Attr[_, _]*) = {
    val p = js.Dictionary.empty[Any]
    in.foreach(t => if (t != null) p.update(t.key, t.value))
    p
  }

  def div(attrs: Attr[DivAttr, _]*)(children: ReactNode*) = React.createElement("div", toProps(attrs: _*), children: _*)

  def input(attrs: Attr[InputAttr, _]*)(children: ReactNode*) = React.createElement("input", toProps(attrs: _*), children: _*)

  def div2(id: js.UndefOr[String] = js.undefined, className: js.UndefOr[String] = js.undefined) = {
    val obj = json(id = id, className = className,x = js.undefined)

    React.createElement("div", obj)
  }

  sealed trait ElemAttr

  final class DivAttr extends ElemAttr

  final class InputAttr extends ElemAttr

  final class FormAttr extends ElemAttr


  class Attr[-AttrType <: ElemAttr, ValueType](val key: String, val value: ValueType)

  class Key[ValueType, AttrType <: ElemAttr](name: String) {
    def :=(value: ValueType): Attr[AttrType, ValueType] = new Attr[AttrType, ValueType](name, value)
  }


  val id: Key[String, ElemAttr] = new Key("id")
  val className: Key[String, ElemAttr] = new Key("className")
  val value: Key[String, InputAttr] = new Key("value")
  val accept: Key[String, InputAttr with FormAttr] = new Key("value")
  val disabled: Key[String, InputAttr] = new Key("disabled")
  val maxLength: Key[Int, InputAttr] = new Key("maxLength")


  val d = div2(id = "hello")
  val i = input(id := "hello", className := "hello", disabled := "true",maxLength := 10)()

}
