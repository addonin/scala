package chapter8

/**
  * Created by Dmytro_Adonin on 6/3/16.
  */
abstract class Point(val x: Double, val y: Double) {
}

class LabeledPoint(x: Double, y: Double, var label: String) extends Point(x, y) {
  override def toString = {
    "(" + x + ", " + y + ") " + label
  }
}

object Ex5 extends App {
  println(new LabeledPoint(1, 2, "some point"))
}


