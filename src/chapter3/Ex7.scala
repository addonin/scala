package chapter3

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex7 extends App {
  def test(a: Array[Int]): Unit = {
    println(a.distinct.mkString(" "))
  }
  test(Array(5,3,4,5,1,2,3,4,5))
}
