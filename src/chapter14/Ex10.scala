package chapter14

/**
  * @author dimon
  * @since 16/06/16.
  */
object Ex10 extends App {

  def f(x: Double) = if (x >= 0) Some(math.sqrt(x)) else None
  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
  def compose(f: Double => Option[Double], g: Double => Option[Double]): (Double) => Option[Double] = {
    (x: Double) => f(x) match {
      case Some(gx) => g(gx)
      case None => None

    }
  }

  val h = compose(f, g)
  println(h(2))
  println(h(1))
  println(h(0))

}
