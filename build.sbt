import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

name       := "time"
version    := "3.1.0"
isSnapshot := true

scalaVersion := "3.7.0"
Compile / scalaSource := baseDirectory.value / "src" / "main"
Test / scalaSource := baseDirectory.value / "src" / "test"
scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-encoding", "UTF8", "-release", "11")

netLogoVersion      := "7.0.0-beta2-8cd3e65"
netLogoClassManager := "org.nlogo.extensions.time.TimeExtension"
netLogoPackageExtras += (baseDirectory.value / "src" / "time-series.nls" -> None)
netLogoTestExtras ++= Seq((baseDirectory.value / "examples"), (baseDirectory.value / "tests"))
