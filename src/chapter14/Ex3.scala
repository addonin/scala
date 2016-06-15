package chapter14

/**
  * @author Dmytro_Adonin 
  * @since 6/15/16
  */
object Ex3 extends App {

  def swap(a: Array[Int]): Array[Int] = a match {
    case _ if a.length >= 2 => val temp = a(0); a(0) = a(1); a(1) = temp; a
    case _ => a
  }

  println(swap(Array(1,2,3)).mkString(", "))
  println(swap(Array(1)).mkString(", "))

}
