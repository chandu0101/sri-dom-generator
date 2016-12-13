package sri.playground.web

object SVGRawData extends BaseRawData {


  /**
    * https://www.w3.org/TR/2003/REC-SVG11-20030114/eltindex.html
    * https://www.w3.org/TR/2016/CR-SVG2-20160915/eltindex.html
    */
  val elements =
    """
      |a
      |animate
      |animateMotion
      |animateTransform
      |circle
      |clipPath
      |cursor
      |defs
      |desc
      |discard
      |ellipse
      |feBlend
      |feColorMatrix
      |feComponentTransfer
      |feComposite
      |feConvolveMatrix
      |feDiffuseLighting
      |feDisplacementMap
      |feDistantLight
      |feDropShadow
      |feFlood
      |feFuncA
      |feFuncB
      |feFuncG
      |feFuncR
      |feGaussianBlur
      |feImage
      |feMerge
      |feMergeNode
      |feMorphology
      |feOffset
      |fePointLight
      |feSpecularLighting
      |feSpotLight
      |feTile
      |feTurbulence
      |filter
      |foreignObject
      |g
      |hatch
      |hatchpath
      |image
      |line
      |linearGradient
      |marker
      |mask
      |mesh
      |meshgradient
      |meshpatch
      |meshrow
      |metadata
      |mpath
      |path
      |pattern
      |polygon
      |polyline
      |radialGradient
      |rect
      |set
      |solidcolor
      |stop
      |svg
      |switch
      |symbol
      |text
      |textPath
      |tspan
      |unknown
      |use
      |view
    """.stripMargin.replaceAll("\\n", " ").split(" ").map(_.trim).filter(_.nonEmpty).toSet

  val attributes =
    """
      |accentHeight accumulate additive alignmentBaseline allowReorder alphabetic
      |amplitude arabicForm ascent attributeName attributeType autoReverse azimuth
      |baseFrequency baseProfile baselineShift bbox begin bias by calcMode capHeight
      |clip clipPath clipPathUnits clipRule colorInterpolation
      |colorInterpolationFilters colorProfile colorRendering contentScriptType
      |contentStyleType cursor cx cy d decelerate descent diffuseConstant direction
      |display divisor dominantBaseline dur dx dy edgeMode elevation enableBackground
      |end exponent externalResourcesRequired fill fillOpacity fillRule filter
      |filterRes filterUnits floodColor floodOpacity focusable fontFamily fontSize
      |fontSizeAdjust fontStretch fontStyle fontVariant fontWeight format from fx fy
      |g1 g2 glyphName glyphOrientationHorizontal glyphOrientationVertical glyphRef
      |gradientTransform gradientUnits hanging horizAdvX horizOriginX ideographic
      |imageRendering in in2 intercept k k1 k2 k3 k4 kernelMatrix kernelUnitLength
      |kerning keyPoints keySplines keyTimes lengthAdjust letterSpacing lightingColor
      |limitingConeAngle local markerEnd markerHeight markerMid markerStart
      |markerUnits markerWidth mask maskContentUnits maskUnits mathematical mode
      |numOctaves offset opacity operator order orient orientation origin overflow
      |overlinePosition overlineThickness paintOrder panose1 pathLength
      |patternContentUnits patternTransform patternUnits pointerEvents points
      |pointsAtX pointsAtY pointsAtZ preserveAlpha preserveAspectRatio primitiveUnits
      |r radius refX refY renderingIntent repeatCount repeatDur requiredExtensions
      |requiredFeatures restart result rotate rx ry scale seed shapeRendering slope
      |spacing specularConstant specularExponent speed spreadMethod startOffset
      |stdDeviation stemh stemv stitchTiles stopColor stopOpacity
      |strikethroughPosition strikethroughThickness string stroke strokeDasharray
      |strokeDashoffset strokeLinecap strokeLinejoin strokeMiterlimit strokeOpacity
      |strokeWidth surfaceScale systemLanguage tableValues targetX targetY textAnchor
      |textDecoration textLength textRendering to transform u1 u2 underlinePosition
      |underlineThickness unicode unicodeBidi unicodeRange unitsPerEm vAlphabetic
      |vHanging vIdeographic vMathematical values vectorEffect version vertAdvY
      |vertOriginX vertOriginY viewBox viewTarget visibility widths wordSpacing
      |writingMode x x1 x2 xChannelSelector xHeight xlinkActuate xlinkArcrole
      |xlinkHref xlinkRole xlinkShow xlinkTitle xlinkType xmlBase xmlLang xmlSpace
      |y y1 y2 yChannelSelector z zoomAndPan
    """.stripMargin.replaceAll("\\n", " ").split(" ").map(_.trim).filter(_.nonEmpty).toSet


 //http://www.zvon.org/comp/r/ref-SVG_1_1_Full.html#Attributes~baseline-shift

  val attributesMeta: Map[String, AttributeMeta] = Map(
    "accumulate" -> AttributeMeta(Set("animate","animateMotion","animateTransform")),
    "additive" -> AttributeMeta(Set("animate","animateMotion","animateTransform")),
    "alignmentBaseline" -> AttributeMeta(Set("tspan","textPath")),
    "allowReorder" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE),BOOLEAN),
    "amplitude" -> AttributeMeta(Set("feFuncA", "feFuncB", "feFuncG", "feFuncR"),DOUBLE),
    "arabicForm" -> AttributeMeta(Set("glyph")),
    "attributeName" -> AttributeMeta(Set("animate","animateTransform","set")),
    "attributeType" -> AttributeMeta(Set("animate","animateTransform","set")),
    "azimuth" -> AttributeMeta(Set("feDistantLight"),DOUBLE),
    "baseFrequency" -> AttributeMeta(Set("feTurbulence"),DOUBLE),
    "baseProfile" -> AttributeMeta(Set("svg")),
    "baselineShift" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "begin" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","set")),
    "bias" -> AttributeMeta(Set("feConvolveMatrix"),DOUBLE),
    "by" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform"),DOUBLE),
    "calcMode" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform")),
    "className" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "clip" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "clipPath" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "clipPathUnits" -> AttributeMeta(Set("clipPath")),
    "clipRule" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "colorInterpolation" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "colorInterpolationFilters" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "colorProfile" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "colorRendering" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "contentScriptType" -> AttributeMeta(Set("svg")),
    "contentStyleType" -> AttributeMeta(Set("svg")),
    "cursor" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "cx" -> AttributeMeta(Set("circle","ellipse","radialGradient"),STRING_OR_DOUBLE),
    "cy" -> AttributeMeta(Set("circle","ellipse","radialGradient"),STRING_OR_DOUBLE),
    "d" -> AttributeMeta(Set("glyph","missing-glyph","path")),
    "diffuseConstant" -> AttributeMeta(Set("feDiffuseLighting"),DOUBLE),
    "direction" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "display" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "divisor" -> AttributeMeta(Set("feConvolveMatrix"),DOUBLE),
    "dominantBaseline" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "dur" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","set"),STRING_OR_DOUBLE),
    "dx" -> AttributeMeta(Set("altGlyph","feOffset","glyphRef","text","tref","tspan"),DOUBLE),
    "dy" -> AttributeMeta(Set("altGlyph","feOffset","glyphRef","text","tref","tspan"),DOUBLE),
    "edgeMode" -> AttributeMeta(Set("feConvolveMatrix")),
    "elevation" -> AttributeMeta(Set("feDistantLight"),DOUBLE),
    "enableBackground" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "end" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","set"),DOUBLE),
    "exponent" -> AttributeMeta(Set( "feFuncA","feFuncB","feFuncG","feFuncR"),DOUBLE),
    "externalResourcesRequired" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","cursor","defs","ellipse","feImage","filter","font","foreignObject","g","image","line","linearGradient","marker","mask","mpath","path","pattern","polygon","polyline","radialGradient","rect","script","set","svg","switch","symbol","text","textPath","tref","tspan","use","view"),DOUBLE),
    "fill" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","set","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "fillOpacity" -> AttributeMeta(Set( "a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","set","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "fillRule" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","set","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "filter" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","set","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "filterUnits" -> AttributeMeta(Set("filter")),
    "floodColor" -> AttributeMeta(Set( "a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","set","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "floodOpacity" -> AttributeMeta(Set( "a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","set","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "fontFamily" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "fontSize" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "fontSizeAdjust" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "fontStretch" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "fontStyle" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "fontVariant" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "fontWeight" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "format" -> AttributeMeta(Set("altGlyph","glyphRef")),
    "from" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform"),DOUBLE),
    "fx" -> AttributeMeta(Set("radialGradient"),DOUBLE),
    "fy" -> AttributeMeta(Set("radialGradient"),DOUBLE),
    "g1" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "g2" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "glyphOrientationHorizontal" -> AttributeMeta(Set( "a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "glyphOrientationVertical" -> AttributeMeta(Set( "a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","font-face","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "glyphRef" -> AttributeMeta(Set( "altGlyph","glyphRef")),
    "gradientTransform" -> AttributeMeta(Set("linearGradient", "radialGradient")),
    "gradientUnits" -> AttributeMeta(Set("linearGradient", "radialGradient")),
    "height" -> AttributeMeta(Set( "feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","foreignObject","image","mask","pattern","rect","svg","use"),DOUBLE),
    "horizAdvX" -> AttributeMeta(Set("font","glyph","missing-glyph"),DOUBLE),
    "horizOriginX" -> AttributeMeta(Set("font"),DOUBLE),
    "horizOriginY" -> AttributeMeta(Set("font"),DOUBLE),
    "id" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "imageRendering" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "in" -> AttributeMeta(Set("feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feGaussianBlur","feMergeNode","feMorphology","feOffset","feSpecularLighting","feTile")),
    "in2" -> AttributeMeta(Set("feBlend","feComposite","feDisplacementMap")),
    "intercept" -> AttributeMeta(Set( "feFuncA","feFuncB","feFuncG","feFuncR")),
    "k1" -> AttributeMeta(Set("feComposite"),DOUBLE),
    "k2" -> AttributeMeta(Set("feComposite"),DOUBLE),
    "k3" -> AttributeMeta(Set("feComposite"),DOUBLE),
    "k4" -> AttributeMeta(Set("feComposite"),DOUBLE),
    "kernelMatrix" -> AttributeMeta(Set("feConvolveMatrix"),DOUBLE_ARRAY),
    "kernelUnitLength" -> AttributeMeta(Set("feConvolveMatrix","feDiffuseLighting","feSpecularLighting"),DOUBLE),
    "kerning" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "key" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), STRING_OR_INT),
    "keyPoints" -> AttributeMeta(Set("animateMotion")),
    "keySplines" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform")),
    "keyTimes" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform")),
    "lengthAdjust" -> AttributeMeta(Set("text","textPath","tref","tspan")),
    "letterSpacing" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "lightingColor" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "limitingConeAngle" -> AttributeMeta(Set("feSpotLight"),DOUBLE),
    "local" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "markerEnd" -> AttributeMeta(Set("path","line","polyline","polygon")),
    "markerHeight" -> AttributeMeta(Set("marker")),
    "markerMid" -> AttributeMeta(Set("path","line","polyline","polygon")),
    "markerStart" -> AttributeMeta(Set("path","line","polyline","polygon")),
    "markerUnits" -> AttributeMeta(Set("marker")),
    "markerWidth" -> AttributeMeta(Set("marker")),
    "mask" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "maskContentUnits" -> AttributeMeta(Set("mask")),
    "maskUnits" -> AttributeMeta(Set("mask")),
    "mode" -> AttributeMeta(Set("feBlend")),
    "numOctaves" -> AttributeMeta(Set("feTurbulence"),INT),
    "offset" -> AttributeMeta(Set("feFuncA","feFuncB","feFuncG","feFuncR","stop"),STRING_OR_DOUBLE),
    "opacity" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "operator" -> AttributeMeta(Set("feComposite","feMorphology")),
    "order" -> AttributeMeta(Set("feConvolveMatrix"),INT),
    "origin" -> AttributeMeta(Set("animateMotion")),
    "overflow" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "paintOrder" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "pathLength" -> AttributeMeta(Set("path"),DOUBLE),
    "patternContentUnits" -> AttributeMeta(Set("pattern")),
    "patternTransform" -> AttributeMeta(Set("pattern")),
    "patternUnits" -> AttributeMeta(Set("pattern")),
    "pointerEvents" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "points" -> AttributeMeta(Set("polygon", "polyline")),
    "pointsAtX" -> AttributeMeta(Set("feSpotLight"),DOUBLE),
    "pointsAtY" -> AttributeMeta(Set("feSpotLight"),DOUBLE),
    "pointsAtZ" -> AttributeMeta(Set("feSpotLight"),DOUBLE),
    "preserveAlpha" -> AttributeMeta(Set("feConvolveMatrix"),BOOLEAN),
    "preserveAspectRatio" -> AttributeMeta(Set( "feImage","image","marker","pattern","svg","symbol","view"),BOOLEAN),
    "primitiveUnits" -> AttributeMeta(Set("filter")),
    "r" -> AttributeMeta(Set("circle", "radialGradient"),STRING_OR_DOUBLE),
    "radius" -> AttributeMeta(Set("feMorphology"),STRING_OR_DOUBLE),
    "ref" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE), REF_FUNCTION_SVG),
    "refX" -> AttributeMeta(Set("marker"),DOUBLE),
    "refY" -> AttributeMeta(Set("marker"),DOUBLE),
    "repeatCount" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","set"),STRING_OR_INT),
    "repeatDur" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","set")),
    "requiredExtensions" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","cursor","defs","ellipse","foreignObject","g","image","line","mask","path","pattern","polygon","polyline","rect","set","svg","switch","text","textPath","tref","tspan","use")),
    "requiredFeatures" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","cursor","defs","ellipse","foreignObject","g","image","line","mask","path","pattern","polygon","polyline","rect","set","svg","switch","text","textPath","tref","tspan","use")),
    "restart" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","set")),
    "result" -> AttributeMeta(Set("feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence")),
    "rotate" -> AttributeMeta(Set("altGlyph","animateMotion","text","tref","tspan"),STRING_OR_DOUBLE),
    "rx" -> AttributeMeta(Set("ellipse", "rect"),STRING_OR_DOUBLE),
    "ry" -> AttributeMeta(Set("ellipse", "rect"),STRING_OR_DOUBLE),
    "scale" -> AttributeMeta(Set("feDisplacementMap"),DOUBLE),
    "seed" -> AttributeMeta(Set("feTurbulence"),INT),
    "shapeRendering" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "slope" -> AttributeMeta(Set("feFuncA","feFuncB","feFuncG","feFuncR","font-face"),STRING_OR_DOUBLE),
    "spacing" -> AttributeMeta(Set("textPath")),
    "specularConstant" -> AttributeMeta(Set("feSpecularLighting"),INT),
    "specularExponent" -> AttributeMeta(Set("feSpecularLighting", "feSpotLight"),DOUBLE),
    "spreadMethod" -> AttributeMeta(Set("linearGradient", "radialGradient")),
    "startOffset" -> AttributeMeta(Set("textPath")),
    "stdDeviation" -> AttributeMeta(Set("feGaussianBlur"),STRING_OR_DOUBLE),
    "stitchTiles" -> AttributeMeta(Set("feTurbulence")),
    "stopColor" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "stopOpacity" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "stroke" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "strokeDasharray" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "strokeDashoffset" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "strokeLinecap" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "strokeLinejoin" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "strokeMiterlimit" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "strokeOpacity" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "strokeWidth" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "style" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE),JSANY),
    "surfaceScale" -> AttributeMeta(Set("feDiffuseLighting", "feSpecularLighting"),DOUBLE),
    "systemLanguage" -> AttributeMeta(Set( "a","altGlyph","animate","animateColor","animateMotion","animateTransform","circle","clipPath","cursor","defs","ellipse","foreignObject","g","image","line","mask","path","pattern","polygon","polyline","rect","set","svg","switch","text","textPath","tref","tspan","use"),BOOLEAN),
    "tableValues" -> AttributeMeta(Set("feFuncA","feFuncB","feFuncG","feFuncR")),
    "target" -> AttributeMeta(Set("a")),
    "targetX" -> AttributeMeta(Set("feConvolveMatrix"),DOUBLE),
    "targetY" -> AttributeMeta(Set("feConvolveMatrix"),DOUBLE),
    "textAnchor" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "textDecoration" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "textLength" -> AttributeMeta(Set("text","textPath","tref","tspan"),STRING_OR_DOUBLE),
    "textRendering" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "to" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","set"),STRING_OR_DOUBLE),
    "transform" -> AttributeMeta(Set( "a","circle","clipPath","defs","ellipse","foreignObject","g","image","line","path","polygon","polyline","rect","switch","text","use")),
    "type" -> AttributeMeta(Set("animateTransform","feColorMatrix","feFuncA","feFuncB","feFuncG","feFuncR","feTurbulence","script","style")),
    "unicodeBidi" -> AttributeMeta(Set( "a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "values" -> AttributeMeta(Set("animate","animateColor","animateMotion","animateTransform","feColorMatrix")),
    "version" -> AttributeMeta(Set("svg")),
    "viewBox" -> AttributeMeta(Set("marker","pattern","svg","symbol","view")),
    "viewTarget" -> AttributeMeta(Set("view")),
    "visibility" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use")),
    "width" -> AttributeMeta(Set( "feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","foreignObject","image","mask","pattern","rect","svg","use"),DOUBLE),
    "wordSpacing" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "writingMode" -> AttributeMeta(Set("a","altGlyph","circle","clipPath","defs","ellipse","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","feSpecularLighting","feTile","feTurbulence","filter","font","foreignObject","g","glyph","glyphRef","image","line","linearGradient","marker","mask","missing-glyph","path","pattern","polygon","polyline","radialGradient","rect","stop","svg","switch","symbol","text","textPath","tref","tspan","use"),STRING_OR_DOUBLE),
    "x" -> AttributeMeta(Set("altGlyph","cursor","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","fePointLight","feSpecularLighting","feSpotLight","feTile","feTurbulence","filter","foreignObject","glyphRef","image","mask","pattern","rect","svg","text","tref","tspan","use"),STRING_OR_DOUBLE),
    "x1" -> AttributeMeta(Set("line", "linearGradient"),STRING_OR_DOUBLE),
    "x2" -> AttributeMeta(Set("line", "linearGradient"),STRING_OR_DOUBLE),
    "xChannelSelector" -> AttributeMeta(Set("feDisplacementMap")),
    "xlinkActuate" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","color-profile","cursor","feImage","filter","font-face-uri","glyphRef","image","linearGradient","mpath","pattern","radialGradient","script","set","textPath","tref","use")),
    "xlinkArcrole" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","color-profile","cursor","feImage","filter","font-face-uri","glyphRef","image","linearGradient","mpath","pattern","radialGradient","script","set","textPath","tref","use")),
    "xlinkHref" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","color-profile","cursor","feImage","filter","font-face-uri","glyphRef","image","linearGradient","mpath","pattern","radialGradient","script","set","textPath","tref","use")),
    "xlinkRole" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","color-profile","cursor","feImage","filter","font-face-uri","glyphRef","image","linearGradient","mpath","pattern","radialGradient","script","set","textPath","tref","use")),
    "xlinkShow" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","color-profile","cursor","feImage","filter","font-face-uri","glyphRef","image","linearGradient","mpath","pattern","radialGradient","script","set","textPath","tref","use")),
    "xlinkTitle" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","color-profile","cursor","feImage","filter","font-face-uri","glyphRef","image","linearGradient","mpath","pattern","radialGradient","script","set","textPath","tref","use")),
    "xlinkType" -> AttributeMeta(Set("a","altGlyph","animate","animateColor","animateMotion","animateTransform","color-profile","cursor","feImage","filter","font-face-uri","glyphRef","image","linearGradient","mpath","pattern","radialGradient","script","set","textPath","tref","use")),
    "xmlBase" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "xmlLang" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "xmlSpace" -> AttributeMeta(Set(GLOBAL_ELEMENT_ATTRIBUTE)),
    "y" -> AttributeMeta(Set("altGlyph","cursor","feBlend","feColorMatrix","feComponentTransfer","feComposite","feConvolveMatrix","feDiffuseLighting","feDisplacementMap","feFlood","feGaussianBlur","feImage","feMerge","feMorphology","feOffset","fePointLight","feSpecularLighting","feSpotLight","feTile","feTurbulence","filter","foreignObject","glyphRef","image","mask","pattern","rect","svg","text","tref","tspan","use"),STRING_OR_DOUBLE),
    "y1" -> AttributeMeta(Set("line", "linearGradient"),STRING_OR_DOUBLE),
    "y2" -> AttributeMeta(Set("line", "linearGradient"),STRING_OR_DOUBLE),
    "yChannelSelector" -> AttributeMeta(Set("feDisplacementMap")),
    "z" -> AttributeMeta(Set("fePointLight", "feSpotLight"),STRING_OR_DOUBLE),
    "zoomAndPan" -> AttributeMeta(Set("svg", "view"))
  )

 val voidTags: Set[String] = Set("image")

  val isHtml = false

  val isSvg = true
}
