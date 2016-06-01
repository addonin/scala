package chapter6

/**
  * @author dimon
  * @since 01/06/16.
  */
class Point(val x: Int, val y: Int) {
  override def toString: String = x + " : " + y
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}

object Test4 extends App {
  println(Point(1, 2))
}