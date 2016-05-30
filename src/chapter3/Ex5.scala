package chapter3

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex5 extends App {
  def test(a: Array[Double]): Unit = {
    println(a.sum / a.length)
  }
  test(Array(1.1,2.2,3.3,4.4,5.5))
}
