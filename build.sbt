ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.0"
val sparkVersion = "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "sparkGrd",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-sql" % sparkVersion,
      "mysql" % "mysql-connector-java" % "5.1.44"
    )
  )
