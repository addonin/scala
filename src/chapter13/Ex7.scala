package chapter13

/**
  * @author Dmytro_Adonin 
  * @since 6/14/16
  */
object Ex7 extends App {
  val prices = List(5.0, 20.0, 9.95)
  val quantities = List(10, 2, 1)
  println((prices zip quantities) map {Function.tupled(_ * _)} )
}
