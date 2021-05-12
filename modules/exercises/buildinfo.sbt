import com.typesafe.sbt.SbtGit.GitKeys.{ gitBranch, gitHeadCommit, gitHeadCommitDate }

enablePlugins(BuildInfoPlugin)

buildInfoObject := "ExercisesBuildInfo"
buildInfoPackage := "ahlers.zio.exercises"

buildInfoKeys ++=
  Seq[BuildInfoKey](
    name,
    version,
    scalaVersion,
    sbtVersion,
    gitBranch,
    gitHeadCommit,
    gitHeadCommitDate)
