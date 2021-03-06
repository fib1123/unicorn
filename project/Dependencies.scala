import sbt._

object Dependencies {

  def mainCore(scalaVersion: String) = Seq(
    "com.typesafe.slick" %% "slick" % "2.1.0",
    "joda-time" % "joda-time" % "2.6",
    "org.joda" % "joda-convert" % "1.7"
  )

  val testCore = Seq(
    "org.scalatest" %% "scalatest" % "2.2.3" % "test",
    "com.h2database" % "h2" % "1.4.183" % "test",
    "ch.qos.logback" % "logback-classic" % "1.1.2" % "test"
  )

  def core(scalaVersion: String) = mainCore(scalaVersion) ++ testCore

  val mainPlay = Seq(
    "com.typesafe.play" %% "play-slick" % "0.8.1"
  )

  val testPlay = Seq(
    "com.typesafe.play" %% "play-test" % "2.3.7" % "test"
  )

  val play = mainPlay ++ testPlay

}