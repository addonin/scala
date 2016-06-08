package chapter10

import java.io.{FileInputStream, InputStream}

/**
  * @author dimon
  * @since 08/06/16.
  */
class IterableInputStream(val is: InputStream) extends java.io.InputStream with Iterable[Byte] {
  def read(): Int = is.read
  def iterator: Iterator[Byte] = new Iterator[Byte] {
    def hasNext: Boolean = is.available() > 0
    def next(): Byte = is.read().toByte
  }
}

object Ex10 extends App {
  var iis = new IterableInputStream(new FileInputStream("/home/dimon/.profile"))
  for (b <- iis) print(b.toChar)
  iis.close()
}
