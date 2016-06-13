package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex3 extends App {

  def factorial(a: Int): Int = {
    if (a == 1) 1 else (1 to a).reduceLeft(_ * _)
  }

  println(factorial(5))

}
