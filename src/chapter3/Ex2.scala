package chapter3

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex2 extends App {
  def test(a: Array[Int]): Unit = {
    for (i <- Range(0, a.length, 2) if i < a.length - 1) {
      val temp = a(i); a(i) = a(i + 1); a(i + 1) = temp
    }
    println(a.mkString)
  }
  test(Array(1,2,3,4,5))
}
