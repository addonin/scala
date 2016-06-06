package chapter9

import scala.io.Source

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex3 extends App {
  Source.fromFile("/Users/Dmytro_Adonin/Downloads/2000010.txt").mkString.split("\\s+").filter(_.length > 12).foreach(println)
}
