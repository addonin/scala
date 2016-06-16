package chapter15

import scala.reflect.io.File

/**
  * @author Dmytro_Adonin 
  * @since 6/16/16
  */
object Ex5 extends App {

  def content(path: String): String = {
    io.Source.fromFile(path).mkString
  }

}
