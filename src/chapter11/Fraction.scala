package chapter11

import scala._
import scala.math.abs

/**
  * @author dimon
  * @since 08/06/16.
  */
class Fraction(var n: Int, var d: Int) {

  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

  def +(that: Fraction): Fraction = {
    Fraction(this.n * that.d + this.d * that.n, this.d * that.d)
  }

  def -(that: Fraction): Fraction = {
    Fraction(this.n * that.d - this.d * that.n, this.d * that.d)
  }

  def *(that: Fraction): Fraction = {
    Fraction(this.n * that.n, this.d * that.d)
  }

  def /(that: Fraction): Fraction = {
    Fraction(this.n * that.d, this.d * that.n)
  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) abs(a) else gcd(b, a % b)
  }

  override def toString: String = {
    num + "/" + den
  }

}

object Fraction {
  def apply(n: Int, d: Int) = new Fraction(n, d)
}

object Ex3 extends App {
  println(Fraction(1, 2) + Fraction(2, 3))
  println(Fraction(1, 2) - Fraction(2, 3))
  println(Fraction(1, 2) * Fraction(2, 3))
  println(Fraction(1, 2) / Fraction(2, 3))
}
