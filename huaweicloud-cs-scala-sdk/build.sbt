version := "1.0-SNAPSHOT"
name := "huaweicloud-cs-scala.sdk"
organization := "com.huaweicloud.cs"
scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-core" % "1.5.15",
  "com.typesafe" % "config" % "1.3.2",
  "com.typesafe.akka" %% "akka-actor" % "2.5.8",
  "io.spray" % "spray-client" % "1.3.1",
  "joda-time" % "joda-time" % "2.9.9",
  "org.joda" % "joda-convert" % "1.9.2",
  "org.json4s" %% "json4s-jackson" % "3.5.3",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "junit" % "junit" % "4.12" % "test"
)

resolvers ++= Seq(Resolver.mavenLocal)

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)

publishArtifact in (Compile, packageDoc) := false
