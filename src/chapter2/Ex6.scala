package chapter2

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex6 extends App {
  def unicodeProduct(s: String): Unit = {
    var product = 1L //var product: Long = 1
    for (c <- s) product *= c.toLong
    println(product)
  }
  unicodeProduct("Hello")
}
