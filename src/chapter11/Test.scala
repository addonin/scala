package chapter11

/**
  * @author Dmytro_Adonin 
  * @since 6/10/16
  */
object Test extends App {
  val matrix = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
  for (row <- matrix.indices; col <- matrix.indices) println(matrix(row)(col))
}
