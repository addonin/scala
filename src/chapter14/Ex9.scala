package chapter14

/**
  * @author dimon
  * @since 15/06/16.
  */
object Ex9 extends App {

  def sum(list: List[Option[Int]]): Int = (for (e <- list) yield e.getOrElse(0)).sum

  println(sum(List(Option(1), None, Option(2))))

}
