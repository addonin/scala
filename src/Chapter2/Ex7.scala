package Chapter2

import scala.collection.immutable.StringOps

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex7 extends App {
  def unicodeProduct(s: String): Unit = {
    println(s.foldLeft(1L)((a, b) => a * b))
  }
  unicodeProduct("Hello")
}
