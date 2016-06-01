package chapter5

/**
  * @author dimon
  * @since 01/06/16.
  */
class Person(var age: Int) {
  if (age < 0) age = 0
}

object Test6 extends App {
  println(new Person(-1).age)
}