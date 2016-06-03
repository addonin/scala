package chapter8

/**
  * Created by Dmytro_Adonin on 6/3/16.
  */
abstract class Shape {
  def centerPoint: Point
  override def toString = this.centerPoint.toString
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape {
  override def centerPoint: Point =
    new LabeledPoint((bottomRight.x + topLeft.x) / 2, (bottomRight.y + topLeft.y) / 2, "center of rectangle")
}

class Circle(override val centerPoint: Point, val radius: Double) extends Shape

object Ex6 extends App {
  val rect = new Rectangle(new LabeledPoint(1, 1, "topLeft"), new LabeledPoint(2, 2, "rightBottom"))
  val circle = new Circle(new LabeledPoint(1, 1, "center"), 5)
  println(rect)
  println(circle)
}
