//do not change this set up only one working with spark at the moment
name := "ScalaRddPractice"
 
version := "0.0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.4.3")

