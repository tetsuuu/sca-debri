ThisBuild / scalaVersion := "2.12.10"
ThisBuild / organization := "asobi.io"

lazy val sample = (project in file("."))
  .settings(
    name := "Sample"
  )
