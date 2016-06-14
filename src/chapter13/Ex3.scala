package chapter13

/**
  * @author Dmytro_Adonin 
  * @since 6/14/16
  */
object Ex3 extends App {

  def removeZeros(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case x :: xs => if (x != 0) x :: removeZeros(xs) else removeZeros(xs)
    }
  }

  println(removeZeros(List(1,2,3,0,4,5,6,0,7,8,9)))

}
