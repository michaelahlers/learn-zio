ThisBuild / scalaVersion := "3.0.0-RC3"

ThisBuild / libraryDependencies ++=
  "dev.zio" %% "zio" % "1.0.7" ::
    Nil

ThisBuild / libraryDependencies ++=
  "org.scalacheck" %% "scalacheck" % "1.15.4" % Test ::
    //"org.scalatest" %% "scalatest" % "3.2.7" % Test ::
    //"org.scalatestplus" %% "scalacheck-1-15" % "3.2.7.0" % Test ::
    Nil
