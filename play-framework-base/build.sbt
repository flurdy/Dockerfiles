name := """play-docker"""

version := "0.3-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  jdbc,
  evolutions,
  cache,
  filters,
  "com.h2database"    %  "h2" % "1.4.192",
  "org.postgresql"    %  "postgresql" % "9.4.1211.jre7",
  "mysql"             %  "mysql-connector-java" % "5.1.39",
  "com.typesafe.play" %% "anorm" % "2.5.0",
  "joda-time"         %  "joda-time" % "2.9.4",
  "com.github.t3hnar"      %% "scala-bcrypt" % "2.6",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "org.mockito"       %  "mockito-all" % "1.10.19" % Test
)
