import AssemblyKeys._

seq(assemblySettings: _*)

name := "Nqueen Solution"

version := "v2013-04-08"

scalaVersion := "2.10.1"

scalacOptions ++= Seq("-unchecked", "-deprecation" )

mainClass in assembly := Some("nqueen.Nqueen")

jarName in assembly := "nqueen.jar"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.+" % "test"

libraryDependencies += "junit" % "junit" % "4.+" % "test"

initialCommands in console := """import nqueen._"""

sourceGenerators in Compile <+= 
 (sourceManaged in Compile, version, name, jarName in assembly) map {
  (dir, version, projectname, jarexe) =>
  val file = dir / "nqueen" / "MetaInfo.scala"
  IO.write(file,
  """package nqueen
    |object MetaInfo { 
    |  val version="%s"
    |  val project="%s"
    |  val jarbasename="%s"
    |}
    |""".stripMargin.format(version, projectname, jarexe.split("[.]").head) )
  Seq(file)
}
