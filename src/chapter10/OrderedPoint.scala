package chapter10
import java.awt.Point

/**
  * Created by Dmytro_Adonin on 6/8/16.
  */
class OrderedPoint(sx: Int, sy: Int) extends Point(sx, sy) with scala.math.Ordered[Point] {
  override def compare(that: Point): Int = {
    if (this.x  < that.x || (this.x == that.x && this.y < that.y)) 1
    else if (this.x == that.x && this.y == that.y) 0
    else -1
  }
}

object Ex2 extends App {
  println(new OrderedPoint(1, 2) < new OrderedPoint(1, 3))
  println(new OrderedPoint(1, 2) == new OrderedPoint(1, 2))
  println(new OrderedPoint(2, 2) < new OrderedPoint(1, 1))
}
