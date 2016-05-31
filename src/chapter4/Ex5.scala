package chapter4

import scala.io.Source
import scala.collection.JavaConversions.mapAsScalaMap

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex5 extends App {
  val filename = "/Users/Dmytro_Adonin/Downloads/2000010.txt"
  val tokens = Source.fromFile(filename).mkString.split("\\s+")
  var words = new java.util.TreeMap[String, Int]
  tokens foreach { token =>
    words(token) = words.getOrElse(token, 0) + 1
  }
  for ((k, v) <- words) println(k + " : " + v)
}
