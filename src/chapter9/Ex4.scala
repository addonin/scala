package chapter9

import scala.io.Source

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex4 extends App {
  var numbers = for (line <- Source.fromFile("/Users/Dmytro_Adonin/Downloads/2000010.txt").getLines) yield line.toDouble
  private val sum: Double = numbers.sum
  println(sum)
  println(sum / numbers.length)
  println(numbers.max)
  println(numbers.min)
}
