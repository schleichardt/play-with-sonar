import info.schleichardt.sbt.sonar.SbtSonarPlugin._

name := """play-sonar-playground"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).settings(sonarSettings:_*)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)
