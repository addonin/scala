package chapter4

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex8  extends App {
  def minmax(a: Array[Int]): Unit = {
    scala.util.Sorting.quickSort(a)
    println((a.head, a.last))
  }
  minmax(Array(45,23,67,11,222,111))
}
