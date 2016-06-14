package chapter13

import java.util

/**
  * @author Dmytro_Adonin 
  * @since 6/14/16
  */
object Ex5 extends App {

  def mkString(seq: Seq[Any], start: String, separator: String, end: String): String = {
    start + seq.reduceLeft(_.toString + separator + _.toString) + end
  }

  println(mkString(List(1,2,3,4,5), "<", ",", ">"))

}
