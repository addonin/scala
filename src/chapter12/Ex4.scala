package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex4 extends App {

  def factorial(n: Int): Int = {
    (1 to n).foldLeft(1)(_ * _)
  }

  println(factorial(5))
  println(factorial(-3))

}
