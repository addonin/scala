package chapter9

/**
  * Created by Dmytro_Adonin on 6/6/16.
  */
object Ex5 extends App {
  for (i <- 1 to 20) {
    val pow: Double = scala.math.pow(2, i)
    println(pow.toInt + "\t" + 1 / pow)
  }
}
