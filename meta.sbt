name := "learn-zio"
description := "Sandbox for learning ZIO."

ThisBuild / homepage := None
ThisBuild / startYear := Some(2021)

ThisBuild / developers ++=
  Developer("michaelahlers", "Michael Ahlers", "michael@ahlers.consulting", url("https://github.com/michaelahlers")) ::
    Nil

ThisBuild / scmInfo :=
  Some(
    ScmInfo(
      browseUrl = url("https://github.com/michaelahlers/learn-zio"),
      connection = "https://github.com/michaelahlers/learn-zio.git",
      devConnection = Some("git@github.com:michaelahlers/learn-zio.git")
    ))

ThisBuild / licenses := Nil
