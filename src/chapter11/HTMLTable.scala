package chapter11

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Dmytro_Adonin on 6/9/16.
  */
class HTMLTable {

  val contents = new ArrayBuffer[String]

  def |(content: String): HTMLTable = {
    contents += ("<td>" + content + "</td>")
    this
  }

  def ||(content: String): HTMLTable = {
    contents += ("</tr><tr><td>" + content + "</td>")
    this
  }

  override def toString = {
    "<table><tr>" + contents.mkString + "</tr></table>"
  }

}

object Ex5 extends App {
  //TODO: there is a bug in case of using "||" operator right after creation of table, so that "<table><tr></tr><tr>..."
  println(new HTMLTable() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET")
}

