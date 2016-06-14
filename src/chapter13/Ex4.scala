package chapter13

/**
  * @author Dmytro_Adonin 
  * @since 6/14/16
  */
object Ex4 extends App {

  def transform(strings: Array[String], stringsToNumbers: Map[String, Int]): Array[Int] = {
    strings.flatMap(stringsToNumbers.get)
  }

  println(transform(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)).mkString(","))

}
