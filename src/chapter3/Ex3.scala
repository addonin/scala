package chapter3

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex3 extends App {
  def test(a: Array[Int]): Unit = {
    val result = for (i <- a.indices) yield {
      if (i % 2 == 0)
        if (i < a.length-1)
          a(i+1)
        else
          a(i)
      else a(i-1)
    }
    println(result.mkString)
  }
  test(Array(1,2,3,4,5))
}
