import cbt._

class Build(val context: Context) extends MetaBuild{
  override def dependencies = super.dependencies ++ Seq(
    plugins.scalaTest,
    plugins.sbtLayout
  )
}
