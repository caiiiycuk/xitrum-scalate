organization := "tv.cntt"

name := "xitrum-scalate"

version := "1.2-SNAPSHOT"

scalaVersion := "2.10.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked"
)

// Most Scala projects are published to Sonatype, but Sonatype is not default
// and it takes several hours to sync from Sonatype to Maven Central
resolvers += "SonatypeReleases" at "http://oss.sonatype.org/content/repositories/releases/"

libraryDependencies += "tv.cntt" %% "xitrum" % "3.0-SNAPSHOT" % "provided"

libraryDependencies += "org.fusesource.scalate" %% "scalate-core" % "1.6.1"

// For Markdown
libraryDependencies += "org.fusesource.scalamd" %% "scalamd" % "1.6"

// Skip API doc generation to speedup "publish-local" while developing.
// Comment out this line when publishing to Sonatype.
publishArtifact in (Compile, packageDoc) := false
