package chapter3

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex6 extends App {
  def test(a: Array[Int]): Unit = {
    val b = a.toBuffer
    println(a.sortWith(_ > _).mkString(" "))
    println(b.sorted.reverse)
  }
  test(Array(3,1,5,2,6,3,8))
}
