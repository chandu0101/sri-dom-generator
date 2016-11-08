package sri.playground.web.components

import org.scalajs.dom
import org.scalajs.dom.ext.PimpedNodeList
import org.scalajs.dom.raw.DOMParser
import sri.core.{React, ReactNode, ReactComponent, ReactElement}
import sri.web.all._
import scala.reflect.ClassTag
import scala.scalajs.js.`|`

import sri.extra.web.components.materialui._
import sri.web.styles.WebStyleSheet
import sri.extra.web.components.materialui.components._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import sri.scalacss.Defaults._
import scalacss.Defaults._
import sri.web.vdom.htmltags._
import scala.scalajs.js.Dynamic.{literal => json}

object HomeScreen {

  implicit def UnionEvidence[A: ClassTag, B: ClassTag](ab: A | B)(implicit eva: A => js.Any, evb: B => js.Any): js.Any =
    ab match {
      case a: A => eva(a)
      case b: B => evb(b)
    }


  case class State(tabValue: String = "light", inputText: String = "", outputText: String = "")

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, State] {

    initialState(State())


    def render() = {

      View(style = styles.container)(
        TextArea(
          value = state.inputText,
          style = styles.input, onChange = onTextChange _)(),
        MuiRaisedButton(label = "Convert", onTouchTap = onButtonTap _)(),
        TextArea(
          value = state.outputText,
          style = styles.input)()
      )
    }

    //    def onButtonTap(e: ReactTouchEventH) = {
    //      val parsedNode = new DOMParser().parseFromString(state.inputText, "text/html")
    //      dom.window.console.log(s"node ", parsedNode.getElementsByTagName("tbody"))
    //      val out = parsedNode.getElementsByTagName("tbody").toList.head.childNodes.toList.filter(node => node.nodeName == "TR").map(tr => {
    //        val tds = tr.childNodes.toList.filter(node => node.nodeName == "TD")
    //        val th = tr.childNodes.toList.filter(node => node.nodeName == "TH").head
    //        var elements = tds.head.childNodes.toList.filter(node => node.nodeName == "A").map(a => s""""${a.asInstanceOf[js.Dynamic].innerText.toString.replaceAll("<", "").replaceAll(">", "").trim}"""").toSet
    //        if (elements.isEmpty) elements = tds.head.childNodes.toList.filter(node => node.nodeName == "CODE").map(node => {
    //          node.firstChild
    //        }).map(a => s""""${a.asInstanceOf[js.Dynamic].innerText.toString.replaceAll("<", "").replaceAll(">", "").trim}"""").toSet
    //        s""""${th.asInstanceOf[js.Dynamic].innerText.toString.replaceAll("-", "").trim}" -> ${elements}"""
    //      }).mkString(",")
    //      setState(state.copy(outputText = out))
    //    }

    def getDefault(tpe: String) = tpe match {
      case "Boolean" => "true"
      case "Double" => "1.0"
      case "Int" => "1"
      case _ => "null"
    }

    /**
     * Generate mxGraph Tests
     * @param e
     */
    def onButtonTap(e: ReactTouchEventH) = {

      val input = state.inputText
      var vars = Set[String]()
      var thisDefs: Map[String, String] = Map()
      var defs: Map[String, String] = Map()
      input.split("\n").filter(_.contains("js.native")).foreach(l => {
        if (l.contains("var") && !l.contains("js.ThisFunction")) {
          val noVar = l.replace("var", "").trim
          val name = noVar.substring(0, noVar.indexOf(":"))
          vars += name
        }
        //         else if(l.contains("js.ThisFunction")) {
        //           val withVar = l.substring(l.indexOf("var"))
        //           val noVar = withVar.replace("var","").trim
        //           val name = noVar.substring(0,noVar.indexOf(":"))
        //           if(l.contains("js.ThisFunction0")) {
        //             thisDefs += name.replace("This","") -> s"${name}(instance)"
        //           } else {
        //             thisDefs += name -> s"$name(instance,${defs.get(name).getOrElse("")}})"
        //           }
        //         }
        else if (l.contains("def ")) {
          val noDef = l.replace("def", "").trim
          val name = noDef.substring(0, noDef.indexOf("("))
          var params = ""
          if (!l.contains("()")) {
            val types = noDef.substring(noDef.indexOf("("), noDef.indexOf(")")).split(",").toList.map(s => {
              val t = s.split(":").last.trim
              if(t.contains("=")) t.substring(0,t.indexOf("=")).trim else t
            })
             params = types.map(getDefault).mkString(",")
          }
          defs += name -> params.trim
        }
      })

      def getVaruableTest(name: String) = {
        s"""
           | test("${name}_MustBeDefined") {
                            |   assert(isDefined(instance.$name))
                                                                 | }
         """.stripMargin
      }

      def methodTest(p: (String, String)) = {
        val name = p._1
        val params = p._2
        s"""
           | test("ShouldCall_JS_${name}") {
                                          |  assert(isLegalCall(instance.${name}($params),"${name}"))
                                                                                                    |   assert(isLegalCall(instance.${name}${if (params.isEmpty) "This" else ""}(instance${if (params.isEmpty) "" else s",$params"}),"${name}"))
                                                                                                                                                                                                                                               | }
         """.stripMargin
      }

      val out =
        s"""
           |${vars.map(getVaruableTest).mkString("\n")}
            |${defs.map(methodTest).mkString("\n")}
         """.stripMargin

      setState(state.copy(outputText = out))

    }

    def onTextChange(e: ReactEventI) = {
      setState(state.copy(inputText = e.target.value))
    }


  }

  object styles extends WebStyleSheet {

    val container = style(
      display.flex,
      flexDirection.column,
      flex := 1,
      padding := 70,
      paddingTop := 120)

    val vertical = style(display.flex,
      flexDirection.column)

    val horizontal = style(display.flex,
      flexDirection.row)

    val content = styleE(vertical)(margin := 30, flex := 1)

    val item = style(marginTop := 15)

    val itemsGroup = styleE(vertical)(alignItems.center, marginRight := 70)

    val paper = style(width := 100, height := 100, textAlign.center, display.`inline-block`)

    val slider = style(width := "100%", marginTop := 20)

    val input = style(height := 400, width := 500)

  }

  object styles2 extends StyleSheet.Inline {

    import dsl._

    val s1 = style(fontSize := "40px")

  }


  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)
}