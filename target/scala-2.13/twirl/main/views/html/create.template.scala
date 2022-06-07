
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Add Horse")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<section id="create">
 
  <form action="">
    <label for="name">name *&nbsp;</label>
    <input class="specialInput" type="text" id="name" name="name" value=""><br>
    <label for="colour">colour *</label>
    <input class="specialInput" type="text" name="colour" value=""><br>
    <label for="speed">speed *&nbsp;</label>
    <input class="specialInput" type="text" name="speed" value=""><br>
    <label for="breed">breed *&nbsp;</label>
    <input class="specialInput" type="text" name="breed" value=""><br>
    <label for="image">image&nbsp;</label>
    <input type="file" name="image" value=""><br><br>
    <input id="submit" type="submit" value="add horse">
  </form> 
</section>
""")))}),format.raw/*22.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/create.scala.html
                  HASH: ca9f68fe9d4a7c47ba568ad7e3dd165001db4739
                  MATRIX: 723->1|819->3|849->8|874->25|913->27|941->30|988->69|1038->82|1068->86|1801->789
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|47->22
                  -- GENERATED --
              */
          