package chapter14

/**
  * @author dimon
  * @since 14/06/16.
  */
object Ex2 extends App {

  def swap(pair: (Int, Int)): (Int, Int) = pair match {
    case (a, b) => (b, a)
  }

  println(swap((1,2)))

}
