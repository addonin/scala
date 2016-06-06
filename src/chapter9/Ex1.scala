package chapter9

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex1 extends App {
  val source = scala.io.Source.fromFile("/Users/Dmytro_Adonin/Downloads/2000010.txt")
  source.getLines().toArray[String].reverse.foreach(println)
}
