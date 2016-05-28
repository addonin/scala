package chapter2

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex1 extends App {
  def signum(i: Int) = {
    if (i < 0) -1
    else if (i > 0) 1
    else 0
  }
  println(signum(-5))
  println(signum(0))
  println(signum(5))
}