package chapter4

import scala.io.Source

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex2 extends App {
  val filename = "/Users/Dmytro_Adonin/Downloads/2000010.txt"
  val words = new scala.collection.mutable.HashMap[String, Int]
  for (line <- Source.fromFile(filename).getLines; word <- line.split("\\s+")) {
    words(word) = words.getOrElse(word, 0) + 1
  }
  for ((k, v) <- words) println(k + " : " + v)
}
