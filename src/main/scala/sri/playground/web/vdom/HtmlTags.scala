package sri.playground.web.vdom
import sri.core._
import sri.universal.components._
import sri.web.SyntheticEvent
import sri.web.all._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scala.scalajs.js.Dynamic.{literal => json}

object HtmlTags {

 
 def cite(
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
    React.createElement("cite",props,children :_*)
 }
     
 

 def link(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hrefLang: U[String] = undefined,
hidden: U[Boolean] = undefined,
rel: U[String] = undefined,
crossOrigin: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
media: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
sizes: U[String] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
href: U[String] = undefined,
integrity: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
sizes.foreach(v => props.updateDynamic("sizes")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
href.foreach(v => props.updateDynamic("href")(v))
crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
integrity.foreach(v => props.updateDynamic("integrity")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
hrefLang.foreach(v => props.updateDynamic("hrefLang")(v))
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
rel.foreach(v => props.updateDynamic("rel")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
media.foreach(v => props.updateDynamic("media")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("link",props)
 }
     
 

 def rp(
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
    React.createElement("rp",props,children :_*)
 }
     
 

 def figcaption(
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
    React.createElement("figcaption",props,children :_*)
 }
     
 

 def area(
  coords: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hrefLang: U[String] = undefined,
hidden: U[Boolean] = undefined,
rel: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
alt: U[String] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
target: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
shape: U[String] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
href: U[String] = undefined,
download: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
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
shape.foreach(v => props.updateDynamic("shape")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
download.foreach(v => props.updateDynamic("download")(v))
href.foreach(v => props.updateDynamic("href")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
hrefLang.foreach(v => props.updateDynamic("hrefLang")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
alt.foreach(v => props.updateDynamic("alt")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
is.foreach(v => props.updateDynamic("is")(v))
coords.foreach(v => props.updateDynamic("coords")(v))
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
target.foreach(v => props.updateDynamic("target")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
rel.foreach(v => props.updateDynamic("rel")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("area",props)
 }
     
 

 def menuitem(
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
    React.createElement("menuitem",props,children :_*)
 }
     
 

 def table(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
cellSpacing: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
cellPadding: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
summary: U[String] = undefined,
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
cellSpacing.foreach(v => props.updateDynamic("cellSpacing")(v))
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
cellPadding.foreach(v => props.updateDynamic("cellPadding")(v))
summary.foreach(v => props.updateDynamic("summary")(v))
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
    React.createElement("table",props,children :_*)
 }
     
 

 def noscript(
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
    React.createElement("noscript",props,children :_*)
 }
     
 

 def colgroup(
  span: U[Int] = undefined,
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
span.foreach(v => props.updateDynamic("span")(v))
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
    React.createElement("colgroup",props,children :_*)
 }
     
 

 def legend(
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
    React.createElement("legend",props,children :_*)
 }
     
 

 def dialog(
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
    React.createElement("dialog",props,children :_*)
 }
     
 

 def button(
  name: U[String] = undefined,
formNoValidate: U[Boolean] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
autoFocus: U[Boolean] = undefined,
formTarget: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
formMethod: U[String] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
disabled: U[Boolean] = undefined,
spellCheck: U[Boolean] = undefined,
formEncType: U[String] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
form: U[String] = undefined,
value: U[js.Any] = undefined,
contextMenu: U[String] = undefined,
formAction: U[String] = undefined,
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
formMethod.foreach(v => props.updateDynamic("formMethod")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
formAction.foreach(v => props.updateDynamic("formAction")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
value.foreach(v => props.updateDynamic("value")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
is.foreach(v => props.updateDynamic("is")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
formEncType.foreach(v => props.updateDynamic("formEncType")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
name.foreach(v => props.updateDynamic("name")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
formNoValidate.foreach(v => props.updateDynamic("formNoValidate")(v))
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
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
formTarget.foreach(v => props.updateDynamic("formTarget")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("button",props,children :_*)
 }
     
 

 def progress(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
max: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
value: U[js.Any] = undefined,
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
max.foreach(v => props.updateDynamic("max")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
value.foreach(v => props.updateDynamic("value")(v))
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
    React.createElement("progress",props,children :_*)
 }
     
 

 def br(
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
  extraAttributes: U[js.Object] = undefined)  = {
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
    React.createElement("br",props)
 }
     
 

 def time(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
dateTime: U[String] = undefined,
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
dateTime.foreach(v => props.updateDynamic("dateTime")(v))
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
    React.createElement("time",props,children :_*)
 }
     
 

 def abbr(
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
    React.createElement("abbr",props,children :_*)
 }
     
 

 def param(
  name: U[String] = undefined,
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
value: U[js.Any] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
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
value.foreach(v => props.updateDynamic("value")(v))
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
name.foreach(v => props.updateDynamic("name")(v))
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
    React.createElement("param",props)
 }
     
 

 def em(
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
  onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
  extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onAbort.foreach(v => props.updateDynamic("onAbort")(v))
onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onPlay.foreach(v => props.updateDynamic("onPlay")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
is.foreach(v => props.updateDynamic("is")(v))
onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
onEnded.foreach(v => props.updateDynamic("onEnded")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
onStalled.foreach(v => props.updateDynamic("onStalled")(v))
onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
onPause.foreach(v => props.updateDynamic("onPause")(v))
onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
onProgress.foreach(v => props.updateDynamic("onProgress")(v))
onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("em",props,children :_*)
 }
     
 

 def tbody(
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

    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("tbody",props,children :_*)
 }
     
 

 def dd(
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
    React.createElement("dd",props,children :_*)
 }
     
 

 def img(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
height: U[String] = undefined,
crossOrigin: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
alt: U[String] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
src: U[String] = undefined,
useMap: U[String] = undefined,
srcSet: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
width: U[Int] = undefined,
contextMenu: U[String] = undefined,
  onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoad: U[(_ <: SyntheticEvent[_]) => _] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
useMap.foreach(v => props.updateDynamic("useMap")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
width.foreach(v => props.updateDynamic("width")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
alt.foreach(v => props.updateDynamic("alt")(v))
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
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
onLoad.foreach(v => props.updateDynamic("onLoad")(v))
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
height.foreach(v => props.updateDynamic("height")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
srcSet.foreach(v => props.updateDynamic("srcSet")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("img",props)
 }
     
 

 def head(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
profile: U[String] = undefined,
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
profile.foreach(v => props.updateDynamic("profile")(v))
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
    React.createElement("head",props,children :_*)
 }
     
 

 def footer(
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
    React.createElement("footer",props,children :_*)
 }
     
 

 def form(
  method: U[String] = undefined,
name: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
acceptCharset: U[String] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
autoComplete: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
encType: U[String] = undefined,
target: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
noValidate: U[Boolean] = undefined,
action: U[String] = undefined,
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
action.foreach(v => props.updateDynamic("action")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
encType.foreach(v => props.updateDynamic("encType")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
method.foreach(v => props.updateDynamic("method")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
is.foreach(v => props.updateDynamic("is")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
name.foreach(v => props.updateDynamic("name")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
acceptCharset.foreach(v => props.updateDynamic("acceptCharset")(v))
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
noValidate.foreach(v => props.updateDynamic("noValidate")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
target.foreach(v => props.updateDynamic("target")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("form",props,children :_*)
 }
     
 

 def rt(
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
    React.createElement("rt",props,children :_*)
 }
     
 

 def del(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
dateTime: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
cite: U[String] = undefined,
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
dateTime.foreach(v => props.updateDynamic("dateTime")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
cite.foreach(v => props.updateDynamic("cite")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("del",props,children :_*)
 }
     
 

 def optgroup(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
label: U[String] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
disabled: U[Boolean] = undefined,
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
label.foreach(v => props.updateDynamic("label")(v))
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
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("optgroup",props,children :_*)
 }
     
 

 def wbr(
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
  extraAttributes: U[js.Object] = undefined)  = {
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
    React.createElement("wbr",props)
 }
     
 

 def ins(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
dateTime: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
cite: U[String] = undefined,
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
dateTime.foreach(v => props.updateDynamic("dateTime")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
cite.foreach(v => props.updateDynamic("cite")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("ins",props,children :_*)
 }
     
 

 def embed(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
height: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
src: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
width: U[Int] = undefined,
contextMenu: U[String] = undefined,
  onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
  extraAttributes: U[js.Object] = undefined)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onAbort.foreach(v => props.updateDynamic("onAbort")(v))
onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onPlay.foreach(v => props.updateDynamic("onPlay")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
width.foreach(v => props.updateDynamic("width")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
is.foreach(v => props.updateDynamic("is")(v))
onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
onEnded.foreach(v => props.updateDynamic("onEnded")(v))
id.foreach(v => props.updateDynamic("id")(v))
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
onStalled.foreach(v => props.updateDynamic("onStalled")(v))
onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
onPause.foreach(v => props.updateDynamic("onPause")(v))
onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
height.foreach(v => props.updateDynamic("height")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
onProgress.foreach(v => props.updateDynamic("onProgress")(v))
onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("embed",props)
 }
     
 

 def h6(
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
    React.createElement("h6",props,children :_*)
 }
     
 

 def bdo(
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
    React.createElement("bdo",props,children :_*)
 }
     
 

 def output(
  name: U[String] = undefined,
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
form: U[String] = undefined,
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
name.foreach(v => props.updateDynamic("name")(v))
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
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("output",props,children :_*)
 }
     
 

 def ol(
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
`type`: U[String] = undefined,
start: U[Int] = undefined,
reversed: U[Boolean] = undefined,
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
start.foreach(v => props.updateDynamic("start")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
reversed.foreach(v => props.updateDynamic("reversed")(v))
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
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("ol",props,children :_*)
 }
     
 

 def h1(
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
    React.createElement("h1",props,children :_*)
 }
     
 

 def title(
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
    React.createElement("title",props,children :_*)
 }
     
 

 def blockquote(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
cite: U[String] = undefined,
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
cite.foreach(v => props.updateDynamic("cite")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("blockquote",props,children :_*)
 }
     
 

 def sub(
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
    React.createElement("sub",props,children :_*)
 }
     
 

 def select(
  name: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
size: U[Int] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
autoFocus: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
autoComplete: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
disabled: U[Boolean] = undefined,
spellCheck: U[Boolean] = undefined,
multiple: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
form: U[String] = undefined,
required: U[Boolean] = undefined,
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
autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
size.foreach(v => props.updateDynamic("size")(v))
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
name.foreach(v => props.updateDynamic("name")(v))
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
multiple.foreach(v => props.updateDynamic("multiple")(v))
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
required.foreach(v => props.updateDynamic("required")(v))
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("select",props,children :_*)
 }
     
 

 def a(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hrefLang: U[String] = undefined,
hidden: U[Boolean] = undefined,
rel: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
target: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
href: U[String] = undefined,
download: U[String] = undefined,
contextMenu: U[String] = undefined,
  onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
  extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onAbort.foreach(v => props.updateDynamic("onAbort")(v))
onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onPlay.foreach(v => props.updateDynamic("onPlay")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
download.foreach(v => props.updateDynamic("download")(v))
href.foreach(v => props.updateDynamic("href")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
hrefLang.foreach(v => props.updateDynamic("hrefLang")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
is.foreach(v => props.updateDynamic("is")(v))
onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
onEnded.foreach(v => props.updateDynamic("onEnded")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
onStalled.foreach(v => props.updateDynamic("onStalled")(v))
onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
onPause.foreach(v => props.updateDynamic("onPause")(v))
onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
onProgress.foreach(v => props.updateDynamic("onProgress")(v))
onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
target.foreach(v => props.updateDynamic("target")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
rel.foreach(v => props.updateDynamic("rel")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("a",props,children :_*)
 }
     
 

 def span(
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
    React.createElement("span",props,children :_*)
 }
     
 

 def kbd(
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
    React.createElement("kbd",props,children :_*)
 }
     
 

 def dfn(
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
    React.createElement("dfn",props,children :_*)
 }
     
 

 def body(
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
    React.createElement("body",props,children :_*)
 }
     
 

 def article(
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
    React.createElement("article",props,children :_*)
 }
     
 

 def dl(
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
    React.createElement("dl",props,children :_*)
 }
     
 

 def li(
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
value: U[js.Any] = undefined,
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
value.foreach(v => props.updateDynamic("value")(v))
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
    React.createElement("li",props,children :_*)
 }
     
 

 def menu(
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
    React.createElement("menu",props,children :_*)
 }
     
 

 def s(
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
    React.createElement("s",props,children :_*)
 }
     
 

 def td(
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
colSpan: U[Int] = undefined,
rowSpan: U[Int] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
headers: U[String] = undefined,
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
rowSpan.foreach(v => props.updateDynamic("rowSpan")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
colSpan.foreach(v => props.updateDynamic("colSpan")(v))
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
headers.foreach(v => props.updateDynamic("headers")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("td",props,children :_*)
 }
     
 

 def details(
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
    React.createElement("details",props,children :_*)
 }
     
 

 def i(
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
  onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
  extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onAbort.foreach(v => props.updateDynamic("onAbort")(v))
onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onPlay.foreach(v => props.updateDynamic("onPlay")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
is.foreach(v => props.updateDynamic("is")(v))
onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
onEnded.foreach(v => props.updateDynamic("onEnded")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
onStalled.foreach(v => props.updateDynamic("onStalled")(v))
onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
onPause.foreach(v => props.updateDynamic("onPause")(v))
onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
onProgress.foreach(v => props.updateDynamic("onProgress")(v))
onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("i",props,children :_*)
 }
     
 

 def meter(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
optimum: U[Double] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
min: U[String] = undefined,
dir: U[String] = undefined,
low: U[String] = undefined,
id: U[String] = undefined,
max: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
value: U[js.Any] = undefined,
contextMenu: U[String] = undefined,
high: U[String] = undefined,
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
min.foreach(v => props.updateDynamic("min")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
high.foreach(v => props.updateDynamic("high")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
max.foreach(v => props.updateDynamic("max")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
value.foreach(v => props.updateDynamic("value")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
low.foreach(v => props.updateDynamic("low")(v))
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
optimum.foreach(v => props.updateDynamic("optimum")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("meter",props,children :_*)
 }
     
 

 def hgroup(
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
    React.createElement("hgroup",props,children :_*)
 }
     
 

 def picture(
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
    React.createElement("picture",props,children :_*)
 }
     
 

 def meta(
  name: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
charSet: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
httpEquiv: U[String] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
content: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
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
name.foreach(v => props.updateDynamic("name")(v))
httpEquiv.foreach(v => props.updateDynamic("httpEquiv")(v))
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
charSet.foreach(v => props.updateDynamic("charSet")(v))
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
content.foreach(v => props.updateDynamic("content")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("meta",props)
 }
     
 

 def hr(
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
  extraAttributes: U[js.Object] = undefined)  = {
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
    React.createElement("hr",props)
 }
     
 

 def thead(
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
    React.createElement("thead",props,children :_*)
 }
     
 

 def tr(
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
    React.createElement("tr",props,children :_*)
 }
     
 

 def h2(
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
    React.createElement("h2",props,children :_*)
 }
     
 

 def `var`(
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
    React.createElement("var",props,children :_*)
 }
     
 

 def caption(
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
    React.createElement("caption",props,children :_*)
 }
     
 
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
     
 

 def tfoot(
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
    React.createElement("tfoot",props,children :_*)
 }
     
 

 def th(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
scope: U[String] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
colSpan: U[Int] = undefined,
rowSpan: U[Int] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
headers: U[String] = undefined,
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
scope.foreach(v => props.updateDynamic("scope")(v))
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
rowSpan.foreach(v => props.updateDynamic("rowSpan")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
colSpan.foreach(v => props.updateDynamic("colSpan")(v))
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
headers.foreach(v => props.updateDynamic("headers")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("th",props,children :_*)
 }
     
 

 def `object`(
  name: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
data: U[String] = undefined,
hidden: U[Boolean] = undefined,
height: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
useMap: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
form: U[String] = undefined,
width: U[Int] = undefined,
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
useMap.foreach(v => props.updateDynamic("useMap")(v))
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
data.foreach(v => props.updateDynamic("data")(v))
width.foreach(v => props.updateDynamic("width")(v))
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
name.foreach(v => props.updateDynamic("name")(v))
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
height.foreach(v => props.updateDynamic("height")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("object",props,children :_*)
 }
     
 

 def u(
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
  onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
  extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onAbort.foreach(v => props.updateDynamic("onAbort")(v))
onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onPlay.foreach(v => props.updateDynamic("onPlay")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
is.foreach(v => props.updateDynamic("is")(v))
onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
onEnded.foreach(v => props.updateDynamic("onEnded")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
onStalled.foreach(v => props.updateDynamic("onStalled")(v))
onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
onPause.foreach(v => props.updateDynamic("onPause")(v))
onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
onProgress.foreach(v => props.updateDynamic("onProgress")(v))
onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("u",props,children :_*)
 }
     
 

 def pre(
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
    React.createElement("pre",props,children :_*)
 }
     
 

 def keygen(
  keyType: U[String] = undefined,
challenge: U[String] = undefined,
name: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
autoFocus: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
disabled: U[Boolean] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
form: U[String] = undefined,
contextMenu: U[String] = undefined,
keyParams: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
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
autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
keyType.foreach(v => props.updateDynamic("keyType")(v))
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
name.foreach(v => props.updateDynamic("name")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
challenge.foreach(v => props.updateDynamic("challenge")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
keyParams.foreach(v => props.updateDynamic("keyParams")(v))
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
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("keygen",props)
 }
     
 

 def dt(
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
    React.createElement("dt",props,children :_*)
 }
     
 

 def section(
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
    React.createElement("section",props,children :_*)
 }
     
 

 def html(
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
manifest: U[String] = undefined,
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
manifest.foreach(v => props.updateDynamic("manifest")(v))
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
    React.createElement("html",props,children :_*)
 }
     
 

 def samp(
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
    React.createElement("samp",props,children :_*)
 }
     
 

 def sup(
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
    React.createElement("sup",props,children :_*)
 }
     
 

 def option(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
label: U[String] = undefined,
hidden: U[Boolean] = undefined,
selected: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
disabled: U[Boolean] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
value: U[js.Any] = undefined,
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
value.foreach(v => props.updateDynamic("value")(v))
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
label.foreach(v => props.updateDynamic("label")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
selected.foreach(v => props.updateDynamic("selected")(v))
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
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("option",props,children :_*)
 }
     
 

 def b(
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
  onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
  extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onAbort.foreach(v => props.updateDynamic("onAbort")(v))
onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onPlay.foreach(v => props.updateDynamic("onPlay")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
is.foreach(v => props.updateDynamic("is")(v))
onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
onEnded.foreach(v => props.updateDynamic("onEnded")(v))
id.foreach(v => props.updateDynamic("id")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
onStalled.foreach(v => props.updateDynamic("onStalled")(v))
onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
onPause.foreach(v => props.updateDynamic("onPause")(v))
onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
onProgress.foreach(v => props.updateDynamic("onProgress")(v))
onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("b",props,children :_*)
 }
     
 

 def h3(
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
    React.createElement("h3",props,children :_*)
 }
     
 

 def ruby(
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
    React.createElement("ruby",props,children :_*)
 }
     
 

 def iframe(
  name: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
height: U[String] = undefined,
srcDoc: U[String] = undefined,
seamless: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
allowFullScreen: U[Boolean] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
sandbox: U[String] = undefined,
src: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
allowTransparency: U[Boolean] = undefined,
lang: U[String] = undefined,
width: U[Int] = undefined,
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
allowFullScreen.foreach(v => props.updateDynamic("allowFullScreen")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
width.foreach(v => props.updateDynamic("width")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
role.foreach(v => props.updateDynamic("role")(v))
sandbox.foreach(v => props.updateDynamic("sandbox")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
is.foreach(v => props.updateDynamic("is")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
name.foreach(v => props.updateDynamic("name")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
id.foreach(v => props.updateDynamic("id")(v))
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
seamless.foreach(v => props.updateDynamic("seamless")(v))
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
height.foreach(v => props.updateDynamic("height")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
srcDoc.foreach(v => props.updateDynamic("srcDoc")(v))
allowTransparency.foreach(v => props.updateDynamic("allowTransparency")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("iframe",props,children :_*)
 }
     
 

 def datalist(
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
    React.createElement("datalist",props,children :_*)
 }
     
 

 def address(
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
    React.createElement("address",props,children :_*)
 }
     
 

 def h4(
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
    React.createElement("h4",props,children :_*)
 }
     
 

 def strong(
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
    React.createElement("strong",props,children :_*)
 }
     
 

 def audio(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
loop: U[Boolean] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
crossOrigin: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
src: U[String] = undefined,
mediaGroup: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
preload: U[String] = undefined,
autoPlay: U[Boolean] = undefined,
muted: U[Boolean] = undefined,
contextMenu: U[String] = undefined,
controls: U[Boolean] = undefined,
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
controls.foreach(v => props.updateDynamic("controls")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
loop.foreach(v => props.updateDynamic("loop")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
autoPlay.foreach(v => props.updateDynamic("autoPlay")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
preload.foreach(v => props.updateDynamic("preload")(v))
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
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
mediaGroup.foreach(v => props.updateDynamic("mediaGroup")(v))
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
muted.foreach(v => props.updateDynamic("muted")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("audio",props,children :_*)
 }
     
 

 def q(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
cite: U[String] = undefined,
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
cite.foreach(v => props.updateDynamic("cite")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("q",props,children :_*)
 }
     
 

 def ul(
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
    React.createElement("ul",props,children :_*)
 }
     
 

 def figure(
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
    React.createElement("figure",props,children :_*)
 }
     
 

 def video(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
loop: U[Boolean] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
height: U[String] = undefined,
crossOrigin: U[String] = undefined,
poster: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
src: U[String] = undefined,
mediaGroup: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
preload: U[String] = undefined,
width: U[Int] = undefined,
autoPlay: U[Boolean] = undefined,
muted: U[Boolean] = undefined,
contextMenu: U[String] = undefined,
controls: U[Boolean] = undefined,
  onDurationChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onError: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onStalled: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPaste: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSuspend: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrop: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onContextMenu: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPause: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDoubleClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWaiting: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEnded: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeking: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragOver: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSubmit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onClick: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSelect: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlayThrough: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onInput: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onSeeked: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedMetadata: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onBlur: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragLeave: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragExit: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchMove: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCopy: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseDown: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onRateChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onWheel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTimeUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationIteration: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onFocus: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onVolumeChange: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseEnter: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchCancel: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCompositionUpdate: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAnimationEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onPlaying: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onLoadedData: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onProgress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEncrypted: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCanPlay: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTouchStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onEmptied: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDragStart: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onKeyPress: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onScroll: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onAbort: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onDrag: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onMouseUp: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onTransitionEnd: U[(_ <: SyntheticEvent[_]) => _] = undefined,
onCut: U[(_ <: SyntheticEvent[_]) => _] = undefined,
  extraAttributes: U[js.Object] = undefined)(children: ReactNode*)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onAbort.foreach(v => props.updateDynamic("onAbort")(v))
onDurationChange.foreach(v => props.updateDynamic("onDurationChange")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onCanPlay.foreach(v => props.updateDynamic("onCanPlay")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
onLoadStart.foreach(v => props.updateDynamic("onLoadStart")(v))
controls.foreach(v => props.updateDynamic("controls")(v))
onWaiting.foreach(v => props.updateDynamic("onWaiting")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onError.foreach(v => props.updateDynamic("onError")(v))
loop.foreach(v => props.updateDynamic("loop")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onPlay.foreach(v => props.updateDynamic("onPlay")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
autoPlay.foreach(v => props.updateDynamic("autoPlay")(v))
width.foreach(v => props.updateDynamic("width")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
preload.foreach(v => props.updateDynamic("preload")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
onSeeking.foreach(v => props.updateDynamic("onSeeking")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
onCanPlayThrough.foreach(v => props.updateDynamic("onCanPlayThrough")(v))
is.foreach(v => props.updateDynamic("is")(v))
onEncrypted.foreach(v => props.updateDynamic("onEncrypted")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onLoadedData.foreach(v => props.updateDynamic("onLoadedData")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onSeeked.foreach(v => props.updateDynamic("onSeeked")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
onEnded.foreach(v => props.updateDynamic("onEnded")(v))
id.foreach(v => props.updateDynamic("id")(v))
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
mediaGroup.foreach(v => props.updateDynamic("mediaGroup")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
onStalled.foreach(v => props.updateDynamic("onStalled")(v))
onEmptied.foreach(v => props.updateDynamic("onEmptied")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
onSuspend.foreach(v => props.updateDynamic("onSuspend")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
onPause.foreach(v => props.updateDynamic("onPause")(v))
onVolumeChange.foreach(v => props.updateDynamic("onVolumeChange")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onTimeUpdate.foreach(v => props.updateDynamic("onTimeUpdate")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
height.foreach(v => props.updateDynamic("height")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onLoadedMetadata.foreach(v => props.updateDynamic("onLoadedMetadata")(v))
onProgress.foreach(v => props.updateDynamic("onProgress")(v))
onPlaying.foreach(v => props.updateDynamic("onPlaying")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onRateChange.foreach(v => props.updateDynamic("onRateChange")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
muted.foreach(v => props.updateDynamic("muted")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
poster.foreach(v => props.updateDynamic("poster")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("video",props,children :_*)
 }
     
 

 def small(
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
    React.createElement("small",props,children :_*)
 }
     
 

 def mark(
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
    React.createElement("mark",props,children :_*)
 }
     
 

 def code(
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
    React.createElement("code",props,children :_*)
 }
     
 

 def bdi(
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
    React.createElement("bdi",props,children :_*)
 }
     
 

 def main(
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
    React.createElement("main",props,children :_*)
 }
     
 

 def p(
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
    React.createElement("p",props,children :_*)
 }
     
 

 def label(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
htmlFor: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
form: U[String] = undefined,
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
htmlFor.foreach(v => props.updateDynamic("htmlFor")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("label",props,children :_*)
 }
     
 

 def textarea(
  name: U[String] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
readOnly: U[Boolean] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
placeholder: U[String] = undefined,
autoFocus: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
wrap: U[String] = undefined,
autoComplete: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
disabled: U[Boolean] = undefined,
minLength: U[Int] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
form: U[String] = undefined,
required: U[Boolean] = undefined,
rows: U[Int] = undefined,
maxLength: U[Int] = undefined,
contextMenu: U[String] = undefined,
cols: U[Int] = undefined,
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
minLength.foreach(v => props.updateDynamic("minLength")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
cols.foreach(v => props.updateDynamic("cols")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
maxLength.foreach(v => props.updateDynamic("maxLength")(v))
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
name.foreach(v => props.updateDynamic("name")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
readOnly.foreach(v => props.updateDynamic("readOnly")(v))
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
placeholder.foreach(v => props.updateDynamic("placeholder")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
wrap.foreach(v => props.updateDynamic("wrap")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
required.foreach(v => props.updateDynamic("required")(v))
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
rows.foreach(v => props.updateDynamic("rows")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("textarea",props,children :_*)
 }
     
 

 def input(
  name: U[String] = undefined,
formNoValidate: U[Boolean] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
accept: U[String] = undefined,
step: U[String] = undefined,
classID: U[String] = undefined,
size: U[Int] = undefined,
readOnly: U[Boolean] = undefined,
pattern: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
checked: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
height: U[String] = undefined,
min: U[String] = undefined,
placeholder: U[String] = undefined,
inputMode: U[String] = undefined,
autoFocus: U[Boolean] = undefined,
formTarget: U[String] = undefined,
htmlFor: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
autoComplete: U[String] = undefined,
max: U[String] = undefined,
draggable: U[Boolean] = undefined,
alt: U[String] = undefined,
formMethod: U[String] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
src: U[String] = undefined,
disabled: U[Boolean] = undefined,
minLength: U[Int] = undefined,
spellCheck: U[Boolean] = undefined,
formEncType: U[String] = undefined,
multiple: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
form: U[String] = undefined,
required: U[Boolean] = undefined,
capture: U[Boolean] = undefined,
width: U[Int] = undefined,
value: U[js.Any] = undefined,
maxLength: U[Int] = undefined,
contextMenu: U[String] = undefined,
formAction: U[String] = undefined,
list: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
formMethod.foreach(v => props.updateDynamic("formMethod")(v))
min.foreach(v => props.updateDynamic("min")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
formAction.foreach(v => props.updateDynamic("formAction")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
inputMode.foreach(v => props.updateDynamic("inputMode")(v))
minLength.foreach(v => props.updateDynamic("minLength")(v))
max.foreach(v => props.updateDynamic("max")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
autoFocus.foreach(v => props.updateDynamic("autoFocus")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
autoComplete.foreach(v => props.updateDynamic("autoComplete")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
list.foreach(v => props.updateDynamic("list")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
width.foreach(v => props.updateDynamic("width")(v))
maxLength.foreach(v => props.updateDynamic("maxLength")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
value.foreach(v => props.updateDynamic("value")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
size.foreach(v => props.updateDynamic("size")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
checked.foreach(v => props.updateDynamic("checked")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
alt.foreach(v => props.updateDynamic("alt")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
is.foreach(v => props.updateDynamic("is")(v))
step.foreach(v => props.updateDynamic("step")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
formEncType.foreach(v => props.updateDynamic("formEncType")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
name.foreach(v => props.updateDynamic("name")(v))
pattern.foreach(v => props.updateDynamic("pattern")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
readOnly.foreach(v => props.updateDynamic("readOnly")(v))
id.foreach(v => props.updateDynamic("id")(v))
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
formNoValidate.foreach(v => props.updateDynamic("formNoValidate")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
tabIndex.foreach(v => props.updateDynamic("tabIndex")(v))
multiple.foreach(v => props.updateDynamic("multiple")(v))
onTouchMove.foreach(v => props.updateDynamic("onTouchMove")(v))
placeholder.foreach(v => props.updateDynamic("placeholder")(v))
accessKey.foreach(v => props.updateDynamic("accessKey")(v))
onKeyUp.foreach(v => props.updateDynamic("onKeyUp")(v))
onDrop.foreach(v => props.updateDynamic("onDrop")(v))
htmlFor.foreach(v => props.updateDynamic("htmlFor")(v))
onMouseEnter.foreach(v => props.updateDynamic("onMouseEnter")(v))
onTouchEnd.foreach(v => props.updateDynamic("onTouchEnd")(v))
onFocus.foreach(v => props.updateDynamic("onFocus")(v))
onContextMenu.foreach(v => props.updateDynamic("onContextMenu")(v))
height.foreach(v => props.updateDynamic("height")(v))
dir.foreach(v => props.updateDynamic("dir")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
required.foreach(v => props.updateDynamic("required")(v))
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
capture.foreach(v => props.updateDynamic("capture")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
formTarget.foreach(v => props.updateDynamic("formTarget")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
accept.foreach(v => props.updateDynamic("accept")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("input",props)
 }
     
 

 def base(
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
target: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
href: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
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
href.foreach(v => props.updateDynamic("href")(v))
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
target.foreach(v => props.updateDynamic("target")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("base",props)
 }
     
 

 def nav(
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
    React.createElement("nav",props,children :_*)
 }
     
 

 def fieldset(
  name: U[String] = undefined,
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
disabled: U[Boolean] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
form: U[String] = undefined,
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
name.foreach(v => props.updateDynamic("name")(v))
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
form.foreach(v => props.updateDynamic("form")(v))
className.foreach(v => props.updateDynamic("className")(v))
disabled.foreach(v => props.updateDynamic("disabled")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("fieldset",props,children :_*)
 }
     
 

 def aside(
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
    React.createElement("aside",props,children :_*)
 }
     
 

 def map(
  name: U[String] = undefined,
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
name.foreach(v => props.updateDynamic("name")(v))
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
    React.createElement("map",props,children :_*)
 }
     
 

 def style(
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
media: U[String] = undefined,
scoped: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
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
scoped.foreach(v => props.updateDynamic("scoped")(v))
onTouchStart.foreach(v => props.updateDynamic("onTouchStart")(v))
className.foreach(v => props.updateDynamic("className")(v))
onKeyPress.foreach(v => props.updateDynamic("onKeyPress")(v))
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
media.foreach(v => props.updateDynamic("media")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("style",props,children :_*)
 }
     
 

 def big(
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
    React.createElement("big",props,children :_*)
 }
     
 

 def data(
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
value: U[js.Any] = undefined,
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
value.foreach(v => props.updateDynamic("value")(v))
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
    React.createElement("data",props,children :_*)
 }
     
 

 def header(
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
    React.createElement("header",props,children :_*)
 }
     
 

 def track(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
label: U[String] = undefined,
hidden: U[Boolean] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
default: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
srcLang: U[String] = undefined,
src: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
kind: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
    val props = json()
    onKeyDown.foreach(v => props.updateDynamic("onKeyDown")(v))
onMouseUp.foreach(v => props.updateDynamic("onMouseUp")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
srcLang.foreach(v => props.updateDynamic("srcLang")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
contentEditable.foreach(v => props.updateDynamic("contentEditable")(v))
kind.foreach(v => props.updateDynamic("kind")(v))
onAnimationIteration.foreach(v => props.updateDynamic("onAnimationIteration")(v))
spellCheck.foreach(v => props.updateDynamic("spellCheck")(v))
draggable.foreach(v => props.updateDynamic("draggable")(v))
onTransitionEnd.foreach(v => props.updateDynamic("onTransitionEnd")(v))
role.foreach(v => props.updateDynamic("role")(v))
onAnimationEnd.foreach(v => props.updateDynamic("onAnimationEnd")(v))
is.foreach(v => props.updateDynamic("is")(v))
onDrag.foreach(v => props.updateDynamic("onDrag")(v))
default.foreach(v => props.updateDynamic("default")(v))
lang.foreach(v => props.updateDynamic("lang")(v))
onSubmit.foreach(v => props.updateDynamic("onSubmit")(v))
onDragExit.foreach(v => props.updateDynamic("onDragExit")(v))
onCopy.foreach(v => props.updateDynamic("onCopy")(v))
onDragEnter.foreach(v => props.updateDynamic("onDragEnter")(v))
onSelect.foreach(v => props.updateDynamic("onSelect")(v))
id.foreach(v => props.updateDynamic("id")(v))
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
label.foreach(v => props.updateDynamic("label")(v))
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
    React.createElement("track",props)
 }
     
 

 def script(
  defer: U[Boolean] = undefined,
tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
nonce: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
charSet: U[String] = undefined,
crossOrigin: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
async: U[Boolean] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
src: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
integrity: U[String] = undefined,
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
defer.foreach(v => props.updateDynamic("defer")(v))
onTouchCancel.foreach(v => props.updateDynamic("onTouchCancel")(v))
onCompositionUpdate.foreach(v => props.updateDynamic("onCompositionUpdate")(v))
onDragStart.foreach(v => props.updateDynamic("onDragStart")(v))
onInput.foreach(v => props.updateDynamic("onInput")(v))
onPaste.foreach(v => props.updateDynamic("onPaste")(v))
onBlur.foreach(v => props.updateDynamic("onBlur")(v))
async.foreach(v => props.updateDynamic("async")(v))
onDragOver.foreach(v => props.updateDynamic("onDragOver")(v))
onDragEnd.foreach(v => props.updateDynamic("onDragEnd")(v))
onScroll.foreach(v => props.updateDynamic("onScroll")(v))
title.foreach(v => props.updateDynamic("title")(v))
onMouseDown.foreach(v => props.updateDynamic("onMouseDown")(v))
onAnimationStart.foreach(v => props.updateDynamic("onAnimationStart")(v))
onMouseMove.foreach(v => props.updateDynamic("onMouseMove")(v))
crossOrigin.foreach(v => props.updateDynamic("crossOrigin")(v))
onWheel.foreach(v => props.updateDynamic("onWheel")(v))
integrity.foreach(v => props.updateDynamic("integrity")(v))
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
src.foreach(v => props.updateDynamic("src")(v))
onCompositionEnd.foreach(v => props.updateDynamic("onCompositionEnd")(v))
onChange.foreach(v => props.updateDynamic("onChange")(v))
contextMenu.foreach(v => props.updateDynamic("contextMenu")(v))
hidden.foreach(v => props.updateDynamic("hidden")(v))
onClick.foreach(v => props.updateDynamic("onClick")(v))
nonce.foreach(v => props.updateDynamic("nonce")(v))
classID.foreach(v => props.updateDynamic("classID")(v))
style.foreach(v => props.updateDynamic("style")(v))
charSet.foreach(v => props.updateDynamic("charSet")(v))
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
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("script",props,children :_*)
 }
     
 

 def summary(
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
    React.createElement("summary",props,children :_*)
 }
     
 

 def h5(
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
    React.createElement("h5",props,children :_*)
 }
     
 

 def canvas(
  tabIndex: U[Int] = undefined,
is: U[String] = undefined,
classID: U[String] = undefined,
contentEditable: U[String] = undefined,
role: U[String] = undefined,
style: U[js.Any] = undefined,
hidden: U[Boolean] = undefined,
height: U[String] = undefined,
dir: U[String] = undefined,
id: U[String] = undefined,
draggable: U[Boolean] = undefined,
accessKey: U[String] = undefined,
className: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
width: U[Int] = undefined,
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
width.foreach(v => props.updateDynamic("width")(v))
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
height.foreach(v => props.updateDynamic("height")(v))
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
    React.createElement("canvas",props,children :_*)
 }
     
 

 def col(
  span: U[Int] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
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
span.foreach(v => props.updateDynamic("span")(v))
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
    React.createElement("col",props)
 }
     
 

 def source(
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
src: U[String] = undefined,
media: U[String] = undefined,
spellCheck: U[Boolean] = undefined,
title: U[String] = undefined,
lang: U[String] = undefined,
`type`: U[String] = undefined,
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
  extraAttributes: U[js.Object] = undefined)  = {
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
src.foreach(v => props.updateDynamic("src")(v))
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
`type`.foreach(v => props.updateDynamic("type")(v))
onCompositionStart.foreach(v => props.updateDynamic("onCompositionStart")(v))
onDoubleClick.foreach(v => props.updateDynamic("onDoubleClick")(v))
onMouseLeave.foreach(v => props.updateDynamic("onMouseLeave")(v))
media.foreach(v => props.updateDynamic("media")(v))
onDragLeave.foreach(v => props.updateDynamic("onDragLeave")(v))
onCut.foreach(v => props.updateDynamic("onCut")(v))
    if(extraAttributes.isDefined && extraAttributes != null) addJsObjects(props,extraAttributes.get)
    React.createElement("source",props)
 }
     
     
}
