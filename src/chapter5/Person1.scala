package chapter5

/**
  * @author dimon
  * @since 01/06/16.
  */
class Person1(private val fullName: String) {
  val firstName: String = fullName.split(" ")(0)
  val lastName: String = fullName.split(" ")(1)
}

object Test7 extends App {
  val p = new Person1("John Dou")
  println(p.firstName + " " + p.lastName)
}