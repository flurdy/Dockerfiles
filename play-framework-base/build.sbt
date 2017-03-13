name := """play-docker"""

version := "0.5-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= {
   val enumeratumVersion = "1.5.8"
   Seq(
      jdbc,
      evolutions,
      cache,
      filters,
      "com.h2database"         %  "h2" % "1.4.193",
      "org.postgresql"         %  "postgresql" % "42.0.0.jre7",
      "mysql"                  %  "mysql-connector-java" % "6.0.5",
      "com.typesafe.play"      %% "anorm" % "2.5.0",
      "joda-time"              %  "joda-time" % "2.9.7",
      "com.github.t3hnar"      %% "scala-bcrypt" % "3.0",
      "com.beachape"           %% "enumeratum" % enumeratumVersion,
      "com.beachape"           %% "enumeratum-play" % enumeratumVersion,
      "com.beachape"           %% "enumeratum-play-json" % enumeratumVersion,
      "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
      "org.mockito"            %  "mockito-all" % "1.10.19" % Test
   )
}
