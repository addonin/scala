package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex10 extends App {

  def unless(condition: => Boolean)(block: => Unit): Unit = {
    if (!condition) block
  }

  unless(false) {
    println("It works!")
  }

}
