package chapter13

import scala.collection.mutable

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex1 extends App {

  def indexes(s: String): mutable.Map[Char, mutable.Set[Int]] = {
    val result = new mutable.HashMap[Char, mutable.Set[Int]]
    for (i <- s.indices) {
      val current = s(i)
      result.get(current) match {
        case None => result.put(current, mutable.LinkedHashSet(i))
        case _ => result.get(current).get += i
      }
    }
    result
  }

  println(indexes("Mississippi"))

}
