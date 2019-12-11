enablePlugins(ScalaJSPlugin)

organization := "com.payalabs"
name := "scalajs-react-bridge-example"
version := "0.8.2-SNAPSHOT"

crossScalaVersions := Seq("2.13.1", "2.12.10", "2.11.12")
scalaVersion := crossScalaVersions.value.head

libraryDependencies ++= {
  val scalaJsDom = "0.9.8"
  val scalaJsReact = "1.5.0-RC2"

  Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.scala-js" %%% "scalajs-dom" % scalaJsDom,
    "com.github.japgolly.scalajs-react" %%% "core" % scalaJsReact,
    "com.github.japgolly.scalajs-react" %%% "extra" % scalaJsReact
  )
}

resolvers += Resolver.sonatypeRepo("snapshots")
