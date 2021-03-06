ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"
val sparkVersion = "3.1.2"
resolvers += "jitpack" at "https://jitpack.io"

lazy val root = (project in file("."))
  .settings(
    name := "sparkGrd",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-sql" % sparkVersion,
      "mysql" % "mysql-connector-java" % "5.1.44",
      "com.github.shin285" % "KOMORAN" % "3.3.4",
    )
  )
