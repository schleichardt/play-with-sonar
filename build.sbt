import info.schleichardt.sbt.sonar.SbtSonarPlugin._

name := """play-sonar-playground"""

version := "1.2.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

sonarSettings

sonarProperties := sonarProperties.value ++ Map(
    "sonar.jacoco.reportPath" -> "target/scala-2.11/jacoco/jacoco.exec",
    "sonar.java.coveragePlugin" -> "jacoco",
    "sonar.java.binaries" -> "target/scala-2.11/classes"
  )

jacoco.settings

parallelExecution in jacoco.Config := false