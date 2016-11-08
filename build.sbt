enablePlugins(ScalaJSPlugin)

name := "sri-dom-generator"

scalaVersion := "2.11.8"

val sriVersion = "0.6.0-SNAPSHOT"

libraryDependencies ++= Seq("com.github.chandu0101" %%% "sri-extra-web" % sriVersion,
  "com.github.chandu0101.sri" %%% "scalacss" % "2016.5.0-SNAPSHOT")

val assetsDir = "assets/"

// copy fastOptJS/fullOptJS  fiels to assets directory
crossTarget in(Compile, fullOptJS) := file(assetsDir)
crossTarget in(Compile, fastOptJS) := file(assetsDir)
crossTarget in(Compile, packageScalaJSLauncher) := file(assetsDir)
artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature",
  "-language:postfixOps", "-language:implicitConversions",
  "-language:higherKinds", "-language:existentials")

