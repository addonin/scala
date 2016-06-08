package chapter10

import java.io.{BufferedInputStream, FileInputStream, InputStream}


/**
  * Created by Dmytro_Adonin on 6/8/16.
  */
trait Buffering {
  this: InputStream =>
  private val is = new BufferedInputStream(this)
  override def read = is.read
}

object Ex6 extends App {
  val f = new FileInputStream("/Users/Dmytro_Adonin/Downloads/2000010.txt") with Buffering
  for(i <- 1 to 10) println(f.read.toChar)
}


