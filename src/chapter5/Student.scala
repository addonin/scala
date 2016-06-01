package chapter5

import scala.beans.BeanProperty

/**
  * @author dimon
  * @since 01/06/16.
  */
class Student(@BeanProperty var id: Int, @BeanProperty var name: String) {}

object Test5 extends App {
  val s = new Student(1, "Alex")
  println(s.getId + " : " + s.getName)
}