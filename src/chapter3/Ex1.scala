package chapter3

object Ex1 extends App {
  def test(n: Int): Unit = {
    val a = new Array[Int](10)
    for (i <- 0 until n) a(i) = i
    println(a.mkString)
  }
  test(10)
}