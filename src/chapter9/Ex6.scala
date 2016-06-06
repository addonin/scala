package chapter9

import scala.io.Source

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex6 extends App {
 val source = Source.fromFile("/Users/Dmytro_Adonin/Downloads/2000010.txt")
 val pattern = """"(.*?)[^\\]"""".r
 for (key <- pattern.findAllIn(source.mkString)) println(key)
}
