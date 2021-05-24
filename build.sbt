enablePlugins(org.nlogo.build.NetLogoExtension, org.nlogo.build.ExtensionDocumentationPlugin)
resolvers      += "netlogo" at "https://dl.cloudsmith.io/public/netlogo/netlogo/maven/"
netLogoVersion := "6.2.0-d27b502"
netLogoClassManager := "org.nlogo.extensions.time.TimeExtension"
scalaVersion := "2.12.12"
netLogoExtName := "time"
netLogoZipSources := false

netLogoTarget := org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value)

version := "2.0.0"

publishMavenStyle in ThisBuild := false
lazy val src = (project in file("."))
  .settings(
    scalaSource in Compile := baseDirectory.value / "src",
    scalacOptions ++= "-deprecation -unchecked -Xfatal-warnings".split(" ").toSeq
  )
isSnapshot := true
