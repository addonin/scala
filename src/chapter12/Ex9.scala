package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex9 extends App {

  def corresponds[A, B](a: Seq[A], b: Seq[B], f: (A, B) => Boolean): Boolean = {
    (a zip b).forall(pair => f(pair._1, pair._2))
  }

  println(corresponds(Array("q", "qw", "qwe"), Array(1, 2, 3), (s: String, l: Int) => s.length == l))
  println(corresponds(Array("q", "qw", "qwe"), Array(1, 2, 2), (s: String, l: Int) => s.length == l))

}
