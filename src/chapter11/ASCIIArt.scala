package chapter11

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Dmytro_Adonin on 6/9/16.
  */
class ASCIIArt(val shape: String) {

  def >(that: ASCIIArt): String = {
    shape.split("\n").zip(that.shape.split("\n")).map(x => x._1 + x._2).mkString("\n")
  }

  def ^(that: ASCIIArt): String = {
    shape + "\n" + that
  }

  override def toString = shape

}

object Ex6 extends App {

  val a = new ASCIIArt(""" /\_/\
( ' ' )
(  -  )
 | | |
(__|__)""")

  val b = new ASCIIArt(
    """   -----
 / Hello \
<  Scala |
 \ Coder /
   -----""")

  println(a)
  println(b)
  println(a > b)
  println(a ^ b)

}
