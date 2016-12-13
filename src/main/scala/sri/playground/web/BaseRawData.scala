package sri.playground.web

trait BaseRawData {

  case class AttributeMeta(tags: Set[String], tpe: String = "String")

  val GLOBAL_ELEMENT_ATTRIBUTE: String = "HTML elements"


  val BOOLEAN = "Boolean"
  val INT = "Int"
  val DOUBLE = "Double"
  val DOUBLE_ARRAY = "js.Array[Double]"
  val INT_ARRAY = "js.Array[Int]"
  val JSANY = "js.Any"
  val STRING_OR_INT = "String | Int"
  val STRING_OR_DOUBLE = "String | Double"
  val INPUT_VALUE = "InputValue"
  val REF_FUNCTION_HTML = "(_ <: dom.html.Element) => _"
  val REF_FUNCTION_SVG = "(_ <: dom.svg.Element) => _"


  val globalEvents = Set("onCopy",
    "onCut",
    "onPaste",
    "onCompositionEnd",
    "onCompositionStart",
    "onCompositionUpdate",
    "onKeyDown",
    "onKeyPress",
    "onKeyUp",
    "onFocus",
    "onBlur",
    "onChange",
    "onInput",
    "onSubmit",
    "onClick",
    "onContextMenu",
    "onDoubleClick",
    "onDrag",
    "onDragEnd",
    "onDragEnter",
    "onDragExit",
    "onDragLeave",
    "onDragOver",
    "onDragStart",
    "onDrop",
    "onMouseDown",
    "onMouseEnter",
    "onMouseLeave",
    "onMouseMove",
    "onMouseUp",
    "onSelect",
    "onTouchCancel",
    "onTouchEnd",
    "onTouchMove",
    "onTouchStart",
    "onScroll",
    "onWheel",
    "onAnimationStart",
    "onAnimationEnd",
    "onAnimationIteration",
    "onTransitionEnd"
  )

  val imageEvents = Set("onLoad",
    "onError")

  val mediaEvents = Set("onAbort",
    "onCanPlay",
    "onCanPlayThrough",
    "onDurationChange",
    "onEmptied",
    "onEncrypted",
    "onEnded",
    "onError",
    "onLoadedData",
    "onLoadedMetadata",
    "onLoadStart",
    "onPause",
    "onPlay",
    "onPlaying",
    "onProgress",
    "onRateChange",
    "onSeeked",
    "onSeeking",
    "onStalled",
    "onSuspend",
    "onTimeUpdate",
    "onVolumeChange",
    "onWaiting")

  val scalaPredefineds = Set("type", "var", "object")

  val elements: Set[String]
  val attributes: Set[String]
  val attributesMeta: Map[String, AttributeMeta]
  val voidTags: Set[String]
  val isHtml:Boolean
  val isSvg:Boolean
}
