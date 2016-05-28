package chapter2

import scala.annotation.tailrec

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex9 extends App {
  def product(s: String): Long = {
    //if (s.equals("")) 1 else s.head.toLong * product(s.tail)
    @tailrec
    def loop(s1: String, acc: Long): Long = {
      if (s1.equals("")) acc else loop(s1.tail, acc * s1.head.toLong)
    }
    loop(s, 1)
  }
  println(product("Hello"))
}
