import cbt._
import scalariform.formatter.preferences._

class Build(val context: Context) extends BuildBuild with Scalariform {
  override def compile = {
    scalariformReformat
    super.compile
  }

  override def scalariformPreferences =
    FormattingPreferences()
      .setPreference(SpacesAroundMultiImports, true)
      .setPreference(DoubleIndentClassDeclaration, true)

  override def dependencies = super.dependencies ++ Seq(plugins.scalariform)
}