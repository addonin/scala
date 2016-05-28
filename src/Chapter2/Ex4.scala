package Chapter2

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex4 extends App {
  def countdown() {
    var i = 10
    while(i >= 0) {
      println(i)
      i -= 1
    }
  }
  countdown()
}