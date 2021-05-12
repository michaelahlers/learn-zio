ThisBuild / scalaVersion := "3.0.0-RC3"

ThisBuild / libraryDependencies ++=
  "dev.zio" %% "zio" % "1.0.7" ::
    Nil

ThisBuild / libraryDependencies ++=
  "org.scalacheck" %% "scalacheck" % "1.15.4" % Test ::
    Nil

//ThisBuild / libraryDependencies ++=
//  "org.scalatest" %% "scalatest" % "3.2.7" % Test ::
//    "org.scalatestplus" %% "scalacheck-1-15" % "3.2.7.0" % Test ::
//    Nil

ThisBuild / libraryDependencies ++=
  "dev.zio" %% "zio-test" % "1.0.7" % Test ::
    "dev.zio" %% "zio-test-sbt" % "1.0.7" % Test ::
    "dev.zio" %% "zio-test-magnolia" % "1.0.7" % Test ::
    Nil
