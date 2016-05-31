package chapter4

import scala.io.Source

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex3 extends App {
  val filename = "/Users/Dmytro_Adonin/Downloads/2000010.txt"
  val tokens = Source.fromFile(filename).mkString.split("\\s+")
  var words = new scala.collection.immutable.HashMap[String, Int]
  tokens foreach { token =>
    words = words + (token -> (words.getOrElse(token, 0) + 1) )
  }
  for ((k, v) <- words) println(k + " : " + v)
}
