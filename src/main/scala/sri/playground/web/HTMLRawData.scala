package sri.playground.web

object HTMLRawData extends  BaseRawData{



  val elements =
    s"""
       |a abbr address area article aside audio b base bdi bdo big blockquote body br
       |button canvas caption cite code col colgroup data datalist dd del details dfn
       |dialog div dl dt em embed fieldset figcaption figure footer form h1 h2 h3 h4 h5
       |h6 head header hgroup hr html i iframe img input ins kbd keygen label legend li
       |link main map mark menu menuitem meta meter nav noscript object ol optgroup
       |option output p param picture pre progress q rp rt ruby s samp script section
       |select small source span strong style sub summary sup table tbody td textarea
       |tfoot th thead time title tr track u ul var video wbr
     """.stripMargin.replaceAll("\\n", " ").split(" ").map(_.trim).filter(_.nonEmpty).toSet


  val attributes =
    s"""
       |accept acceptCharset accessKey action allowFullScreen allowTransparency alt
       |async autoComplete autoFocus autoPlay capture cellPadding cellSpacing challenge
       |charSet checked cite classID className colSpan cols content contentEditable
       |contextMenu controls coords crossOrigin data dateTime default defer dir
       |disabled download draggable encType form formAction formEncType formMethod
       |formNoValidate formTarget frameBorder headers height hidden high href hrefLang
       |htmlFor httpEquiv icon id inputMode integrity is keyParams keyType kind label
       |lang list loop low manifest marginHeight marginWidth max maxLength media
       |mediaGroup method min minLength multiple muted name noValidate nonce open
       |optimum pattern placeholder poster preload profile radioGroup readOnly rel
       |required reversed role rowSpan rows sandbox scope scoped scrolling seamless
       |selected shape size sizes span spellCheck src srcDoc srcLang srcSet start step
       |style summary tabIndex target title type useMap value width wrap
     """.stripMargin.replaceAll("\\n", " ").split(" ").map(_.trim).filter(_.nonEmpty).toSet


  /**
    * https://www.w3.org/TR/html5/index.html#attributes-1
    */
  val attributesMeta: Map[String, AttributeMeta] = Map(
    "accept" -> AttributeMeta(Set("input")),
    "acceptCharset" -> AttributeMeta(Set("form")),
    "accessKey" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "action" -> AttributeMeta(Set("form")),
    "allowFullScreen" -> AttributeMeta(Set("iframe"), BOOLEAN),
    "allowTransparency" -> AttributeMeta(Set("iframe"), BOOLEAN),
    "alt" -> AttributeMeta(Set("area", "img", "input")),
    "async" -> AttributeMeta(Set("script"), BOOLEAN),
    "autoComplete" -> AttributeMeta(Set("form", "input", "select", "textarea")),
    "autoFocus" -> AttributeMeta(Set("keygen", "button", "textarea", "select", "input"), BOOLEAN),
    "autoPlay" -> AttributeMeta(Set("audio", "video"), BOOLEAN),
    "capture" -> AttributeMeta(Set("input"), BOOLEAN),
    "cellPadding" -> AttributeMeta(Set("table")),
    "cellSpacing" -> AttributeMeta(Set("table")),
    "challenge" -> AttributeMeta(Set("keygen")),
    "charSet" -> AttributeMeta(Set("meta", "script")),
    "checked" -> AttributeMeta(Set("input", "command")),
    "cite" -> AttributeMeta(Set("blockquote", "del", "ins", "q")),
    "classID" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "className" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "cols" -> AttributeMeta(Set("textarea"), INT),
    "colSpan" -> AttributeMeta(Set("td", "th"), INT),
    "content" -> AttributeMeta(Set("meta")),
    "contentEditable" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "contextMenu" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "controls" -> AttributeMeta(Set("audio", "video"), BOOLEAN),
    "coords" -> AttributeMeta(Set("area")),
    "crossOrigin" -> AttributeMeta(Set("link", "audio", "video", "img", "script")),
    "data" -> AttributeMeta(Set("object")),
    "dateTime" -> AttributeMeta(Set("del", "ins", "time")),
    "default" -> AttributeMeta(Set("track"), BOOLEAN),
    "defer" -> AttributeMeta(Set("script"), BOOLEAN),
    "dir" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "disabled" -> AttributeMeta(Set("optgroup", "keygen", "fieldset", "option", "button", "textarea", "select", "input"), BOOLEAN),
    "download" -> AttributeMeta(Set("a", "area")),
    "draggable" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), BOOLEAN),
    "encType" -> AttributeMeta(Set("form")),
    "form" -> AttributeMeta(Set("label", "object", "keygen", "fieldset", "output", "button", "textarea", "select", "input")),
    "formAction" -> AttributeMeta(Set("button", "input")),
    "formEncType" -> AttributeMeta(Set("button", "input")),
    "formMethod" -> AttributeMeta(Set("button", "input")),
    "formNoValidate" -> AttributeMeta(Set("button", "input"), BOOLEAN),
    "formTarget" -> AttributeMeta(Set("button", "input")),
    "frameBorder" -> AttributeMeta(Set("frame")),
    "headers" -> AttributeMeta(Set("td", "th")),
    "height" -> AttributeMeta(Set("iframe", "object", "embed", "video", "img", "canvas", "input"), INT),
    "hidden" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), BOOLEAN),
    "high" -> AttributeMeta(Set("meter"), DOUBLE),
    "href" -> AttributeMeta(Set("a", "area", "link", "base")),
    "hrefLang" -> AttributeMeta(Set("a", "area", "link")),
    "htmlFor" -> AttributeMeta(Set("label", "input")),
    "httpEquiv" -> AttributeMeta(Set("meta")),
    "icon" -> AttributeMeta(Set("command")),
    "id" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "inputMode" -> AttributeMeta(Set("input")),
    "integrity" -> AttributeMeta(Set("link", "script")),
    "is" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "key" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), STRING_OR_INT),
    "keyParams" -> AttributeMeta(Set("keygen")),
    "keyType" -> AttributeMeta(Set("keygen")),
    "kind" -> AttributeMeta(Set("track")),
    "label" -> AttributeMeta(Set("optgroup", "option", "track")),
    "lang" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "list" -> AttributeMeta(Set("input")),
    "loop" -> AttributeMeta(Set("audio", "video"), BOOLEAN),
    "low" -> AttributeMeta(Set("meter"), DOUBLE),
    "manifest" -> AttributeMeta(Set("html")),
    "marginHeight" -> AttributeMeta(Set("frame")),
    "marginWidth" -> AttributeMeta(Set("frame")),
    "max" -> AttributeMeta(Set("input", "meter", "progress"), DOUBLE),
    "maxLength" -> AttributeMeta(Set("input", "textarea"), INT),
    "media" -> AttributeMeta(Set("link", "source", "style")),
    "mediaGroup" -> AttributeMeta(Set("audio", "video")),
    "method" -> AttributeMeta(Set("form")),
    "min" -> AttributeMeta(Set("input", "meter"), DOUBLE),
    "minLength" -> AttributeMeta(Set("input", "textarea"), INT),
    "multiple" -> AttributeMeta(Set("input", "select"), BOOLEAN),
    "muted" -> AttributeMeta(Set("audio", "video"), BOOLEAN),
    "name" -> AttributeMeta(Set("keygen", "fieldset", "output", "button", "textarea", "select", "input", "form", "iframe", "object", "map", "meta", "param")),
    "noValidate" -> AttributeMeta(Set("form"), BOOLEAN),
    "nonce" -> AttributeMeta(Set("script")),
    "open" -> AttributeMeta(Set("open"), BOOLEAN),
    "optimum" -> AttributeMeta(Set("meter"), DOUBLE),
    "pattern" -> AttributeMeta(Set("input")),
    "placeholder" -> AttributeMeta(Set("input", "textarea")),
    "poster" -> AttributeMeta(Set("video")),
    "preload" -> AttributeMeta(Set("audio", "video")),
    "profile" -> AttributeMeta(Set("head")),
    "radioGroup" -> AttributeMeta(Set("command")),
    "readOnly" -> AttributeMeta(Set("input", "textarea"), BOOLEAN),
    "ref" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), REF_FUNCTION_HTML),
    "rel" -> AttributeMeta(Set("a", "area", "link")),
    "required" -> AttributeMeta(Set("input", "select", "textarea"), BOOLEAN),
    "reversed" -> AttributeMeta(Set("ol"), BOOLEAN),
    "role" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "rowSpan" -> AttributeMeta(Set("td", "th"), INT),
    "rows" -> AttributeMeta(Set("textarea"), INT),
    "sandbox" -> AttributeMeta(Set("iframe")),
    "scope" -> AttributeMeta(Set("th")),
    "scoped" -> AttributeMeta(Set("style")),
    "scrolling" -> AttributeMeta(Set("frame")),
    "seamless" -> AttributeMeta(Set("iframe")),
    "selected" -> AttributeMeta(Set("option"), BOOLEAN),
    "shape" -> AttributeMeta(Set("area")),
    "size" -> AttributeMeta(Set("input", "select"), INT),
    "sizes" -> AttributeMeta(Set("link")),
    "span" -> AttributeMeta(Set("col", "colgroup"), INT),
    "spellCheck" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), BOOLEAN),
    "src" -> AttributeMeta(Set("iframe", "audio", "embed", "source", "video", "img", "track", "script", "input")),
    "srcDoc" -> AttributeMeta(Set("iframe")),
    "srcLang" -> AttributeMeta(Set("track")),
    "srcSet" -> AttributeMeta(Set("img")),
    "start" -> AttributeMeta(Set("ol"), INT),
    "step" -> AttributeMeta(Set("input")),
    "style" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), JSANY),
    "summary" -> AttributeMeta(Set("table")),
    "tabIndex" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), INT),
    "target" -> AttributeMeta(Set("a", "area", "base", "form")),
    "title" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "type" -> AttributeMeta(Set("a", "area", "link", "button", "object", "embed", "source", "style", "script", "input", "ol")),
    "useMap" -> AttributeMeta(Set("img", "object")),
    "value" -> AttributeMeta(Set("button", "option", "data", "input", "li", "meter", "progress", "param", "select"), INPUT_VALUE),
    "width" -> AttributeMeta(Set("iframe", "object", "embed", "video", "img", "canvas", "input"), INT),
    "wrap" -> AttributeMeta(Set("textarea"))
  )


  val voidTags = Set("area",
    "base",
    "br",
    "col",
    "embed",
    "hr",
    "img",
    "input",
    "keygen",
    "link",
    "meta",
    "param",
    "source",
    "track",
    "menuitem",
    "wbr")

 val isHtml = true

  val isSvg = false

}
