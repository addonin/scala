package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex2 extends App {

  def max(array: Array[Int]): Int = {
    array.reduceLeft((a, b) => if (a < b) b else a)
  }

  println(max(Array(5,2,8,6)))

}
