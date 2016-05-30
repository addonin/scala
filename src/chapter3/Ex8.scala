package chapter3

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex8 extends App {
  def test(a: Array[Int]): Unit = {
    val b = a.toBuffer
    var negativeIndexes = for (i <- a.indices if a(i) < 0) yield i
    negativeIndexes.reverse.dropRight(1).foreach(b.remove)
    println(b)
  }
  test(Array(-3,-5,1,5,-2,6))
}
