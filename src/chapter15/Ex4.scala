package chapter15

import scala.annotation.varargs

/**
  * @author Dmytro_Adonin 
  * @since 6/16/16
  */
object Ex4 extends App {

  @varargs // could be called from Java
  def sum(values: Int*): Int = {
    values.sum
  }

}
