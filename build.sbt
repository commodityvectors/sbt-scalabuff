sbtPlugin := true

name := "sbt-scalabuff"

version := "1.4.0-SNAPSHOT"

organization := "com.github.sbt"

crossBuildingSettings

CrossBuilding.crossSbtVersions := Seq("0.12", "0.13")
