name := "Scrava"

organization := "kiambogo"

version := "1.1.5"

scalaVersion := "2.11.7"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= Seq(
  "io.spray" % "spray-client" % "1.3.1",
  "io.spray" %%  "spray-json" % "1.3.2",
  "org.scalatest" %% "scalatest" % "2.2.2",
  "joda-time" % "joda-time" % "2.6",
  "org.joda" % "joda-convert" % "1.2"
)
