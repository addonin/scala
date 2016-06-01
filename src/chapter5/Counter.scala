package chapter5

/**
  * Created by Dmytro_Adonin on 6/1/16.
  */
class Counter {
  private var value = 0
  def increment() { if (value <= Int.MaxValue) value += 1 }
  def current = value
}

object Test1 extends App {
  var c = new Counter
  while (true) {
    c.increment()
    println(c.current) // shouldn't change after Int.MaxValue
  }
}
