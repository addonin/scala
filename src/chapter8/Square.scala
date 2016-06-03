package chapter8

/**
  * Created by Dmytro_Adonin on 6/3/16.
  */
class Square(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
  def this() = this(0, 0, 0)
  def this(width: Int) = this(0, 0, width)
}

object Ex7 extends App {
  println(new Square())
  println(new Square(4))
  println(new Square(1, 1, 1))
}
