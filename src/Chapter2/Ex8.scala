package Chapter2

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex8 extends App {
  def product(s: String) = {
    var res: Long = 1
    for (c <- s) res *= c.toLong
    res
  }
  println(product("Hello"))
}
