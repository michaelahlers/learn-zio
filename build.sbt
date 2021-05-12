lazy val `learn-zio` =
  project.in(file("."))
    .aggregate(`exercises`)

lazy val `exercises` =
  project.in(file(".") / "modules" / "exercises")

//ThisBuild / Test / testOptions += Tests.Argument("-oD")
//ThisBuild / IntegrationTest / testOptions += Tests.Argument("-oD")
