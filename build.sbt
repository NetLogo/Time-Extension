import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

version := "2.0.0"
isSnapshot := true

scalaVersion := "2.13.16"
Compile / scalaSource := baseDirectory.value / "src" / "main"
Test / scalaSource := baseDirectory.value / "src" / "test"
scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xlint", "-Xfatal-warnings", "-encoding", "UTF8", "-release", "11")

netLogoExtName := "time"
netLogoVersion := "6.3.0"
netLogoClassManager := "org.nlogo.extensions.time.TimeExtension"
netLogoPackageExtras += (baseDirectory.value / "src" / "time-series.nls" -> None)
netLogoTestExtras ++= Seq((baseDirectory.value / "examples"), (baseDirectory.value / "tests"))
