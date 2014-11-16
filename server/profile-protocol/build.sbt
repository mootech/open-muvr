import com.eigengo.lift.build.Dependencies._
import com.eigengo.lift.build._

Build.Settings.project

name := "lift-profile-protocol"

libraryDependencies ++= Seq(
  akka.actor,
  akka.cluster,
  akka.contrib,
  akka.testkit % "test",
  spray.testkit % "test"
)