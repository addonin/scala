package chapter3

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex4 extends App {
  def test(a: Array[Int]): Unit = {
    val pos, neg = ArrayBuffer[Int]()
    for (e <- a) {
      if (e > 0) pos += e else neg += e
    }
    println((pos ++= neg).mkString(" "))
  }
  test(Array(-1,1,4,0,-4,3))
}
