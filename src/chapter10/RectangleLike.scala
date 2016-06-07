package chapter10

import java.awt.geom.Ellipse2D.Double

/**
  * @author dimon
  * @since 07/06/16.
  */
trait RectangleLike extends java.awt.geom.RectangularShape {

  def translate(dx:Int, dy:Int) {
    setFrame(getX + dx, getY + dy, getWidth, getHeight)
  }

  def grow(h:Int, v:Int) {
    setFrame(getX - h, getY - v, getWidth + 2 * h, getHeight + 2 * v)
  }

}

object Ex1 extends App {
  val egg = new Double() with RectangleLike
  egg.translate(10, -10)
  egg.grow(10, 20)
}
