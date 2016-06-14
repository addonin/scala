package chapter13

import scala.collection.immutable

/**
  * @author Dmytro_Adonin 
  * @since 6/14/16
  */
object Ex2 extends App {

  def indexes(s: String) = {
    s.zipWithIndex.groupBy(_._1).map(x => (x._1, x._2.map(_._2).toList))
  }

  println(indexes("Mississippi"))

}
