
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/home.css")),format.raw/*16.97*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/login.css")),format.raw/*17.98*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*18.50*/routes/*18.56*/.Assets.versioned("stylesheets/create.css")),format.raw/*18.99*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*19.50*/routes/*19.56*/.Assets.versioned("stylesheets/prism.css")),format.raw/*19.98*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*20.55*/routes/*20.61*/.Assets.versioned("images/favicon.png")),format.raw/*20.100*/("""'>
    <script src='"""),_display_(/*21.19*/routes/*21.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*21.66*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*22.66*/("""' type="text/javascript"></script>
</head>

<body>
    <!--<section id="top">
        <div class="wrapper">
            <img class="resize" src="assets/images/play_icon_reverse.svg" alt="logo" />
            <h1>Play Hello World Web Tutorial</h1>
        </div>
    </section> -->
    """),_display_(/*32.6*/content),format.raw/*32.13*/("""
"""),format.raw/*33.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 90f800bb8035698168062467bb7aed3382f87bae
                  MATRIX: 992->266|1117->296|1147->300|1231->357|1257->362|1419->497|1434->503|1496->544|1576->597|1591->603|1653->644|1733->697|1748->703|1811->745|1891->798|1906->804|1970->847|2050->900|2065->906|2128->948|2213->1006|2228->1012|2289->1051|2338->1073|2353->1079|2415->1120|2496->1174|2511->1180|2573->1221|2895->1517|2923->1524|2952->1526
                  LINES: 26->7|31->7|33->9|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|56->32|56->32|57->33
                  -- GENERATED --
              */
          