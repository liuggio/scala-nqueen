
package nqueen

object Nqueen {
  import MetaInfo._
  val userName = util.Properties.userName
  val message = s"Hello ${userName} by ${project} release ${version}."
  def main(args:Array[String]) {
    println(message)
  }
  
  
  def Ntrick(len: Int) = {
	Set()	  
  }
}
