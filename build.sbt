ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "DiscretizedStreamTest",
    idePackagePrefix := Some("com.github.oliverdding.dst")
  )
