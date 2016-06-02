/**
  * Created by Dmytro_Adonin on 6/2/16.
  */
package object random {

  private var seed: Int = 0

  def setSeed(value: Int): Unit = { seed = value }

  def nextInt(): Int = {
    seed = seed * 1664525 + 1013904223 % (2 ^ 32)
    seed
  }

  def nextDouble(): Double = nextInt().toDouble

}

object Ex3 extends App {

  import random._

  setSeed(31)
  (1 to 5).foreach(x => println(nextInt()))
  (1 to 5).foreach(x => println(nextDouble()))
}
