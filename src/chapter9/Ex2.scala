package chapter9

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex2 extends App {
  var count = 0
  val column = 8
  val source = scala.io.Source.fromFile("/Users/Dmytro_Adonin/Downloads/2000010.txt")
  for (c <- source) c match {
    case '\t' =>
      print(" " * (column - count % column))
      count = 0
    case '\n' =>
      println()
      count = 0
    case _ =>
      print(c)
      count += 1
  }
}
