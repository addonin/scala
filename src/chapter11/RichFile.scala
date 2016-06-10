package chapter11

/**
  * @author Dmytro_Adonin 
  * @since 6/10/16
  */
class RichFile {
  def unapply(pathname: String): Unit = {

  }
}

object Ex9 extends App {
  val richFile = new RichFile

}
