package sri.playground.web

import org.scalajs.dom
import sri.core._
import sri.playground.web.router.AppRouter
import sri.playground.web.vdom._
//import sri.playground.web.vdom.HtmlTags._
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


//  @inline
  @noinline
  def div(
           tabIndex: U[Int] = undefined,
           is: U[String] = undefined,
           classID: U[String] = undefined,
           contentEditable: U[String] = undefined,
           role: U[String] = undefined,
           style: U[js.Any] = undefined,
           hidden: U[Boolean] = undefined,
           dir: U[String] = undefined,
           id: U[String] = undefined,
           draggable: U[Boolean] = undefined,
           accessKey: U[String] = undefined,
           className: U[String] = undefined,
           spellCheck: U[Boolean] = undefined,
           title: U[String] = undefined,
           lang: U[String] = undefined,
           contextMenu: U[String] = undefined,
           onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
           extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
    onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
    onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
    onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
    onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
    onInput.foreach(v => props.updateDynamic("onInput")(v))
    onPaste.foreach(v => props.updateDynamic("onPaste")(v))
    onBlur.foreach(v => props.updateDynamic("onBlur")(v))
    onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
    onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
    onScroll.foreach(v => props.updateDynamic("onScroll")(v))
    title.foreach(v => props.updateDynamic("title")(v))
    onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
    onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
    onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
    onWheel.foreach(v => props.updateDynamic("onWheel")(v))
    contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
    onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
    spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
    draggable.foreach(v => props.updateDynamic("draggable")(v))
    onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
    role.foreach(v => props.updateDynamic("role")(v))
    onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
    is.foreach(v => props.updateDynamic("is")(v))
    onDrag.foreach(v => props.updateDynamic("onDrag")(v))
    lang.foreach(v => props.updateDynamic("lang")(v))
    onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
    onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
    onCopy.foreach(v => props.updateDynamic("onCopy")(v))
    onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
    onSelect.foreach(v => props.updateDynamic("onSelect")(v))
    id.foreach(v => props.updateDynamic("id")(v))
    onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
    onChange.foreach(v => props.updateDynamic("onChange")(v))
    contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
    hidden.foreach(v => props.updateDynamic("hidden")(v))
    onClick.foreach(v => props.updateDynamic("onClick")(v))
    classID.foreach(v => props.updateDynamic("classID")(v))
    style.foreach(v => props.updateDynamic("style")(v))
    tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
    onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
    accessKey.foreach(v => props.updateDynamic("accessKey")(v))
    onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
    onDrop.foreach(v => props.updateDynamic("onDrop")(v))
    onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
    onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
    onFocus.foreach(v => props.updateDynamic("onFocus")(v))
    onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
    dir.foreach(v => props.updateDynamic("dir")(v))
    onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
    className.foreach(v => props.updateDynamic("className")(v))
    onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
    onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
    onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
    onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
    onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
    onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("div",props,children :_*)
  }


  @JSExport
  override def main(): Unit = {
    val other = json("data-man" -> "yo")
    ReactDOM.render(AppRouter.router, dom.document.getElementById("app"))
    dom.window.console.log("See Code2:",div(id = "hello",className = "hello",extraAttributes = undefined)())
    dom.window.console.log("See Code3:",div(id = "hello",tabIndex = 1,extraAttributes = undefined)())

  }

}
