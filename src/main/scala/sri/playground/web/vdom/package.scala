package sri.playground.web

import scala.scalajs.js

package object vdom {


  @inline
  def addJsObjects(in : js.Object,extra : js.Object) = {
    val extraDict = extra.asInstanceOf[js.Dictionary[js.Any]]
    for(key <- extraDict.keys) {
      val v = extraDict(key)
      if(!js.isUndefined(v)) in.asInstanceOf[js.Dynamic].updateDynamic(key)(v)
    }
  }
}
