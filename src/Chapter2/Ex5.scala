package Chapter2

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex5 extends App {
  def countdown(n: Int): Unit = {
    for (i <- Range(n, 0, -1)) println(i)
    for (i <- n.to(0, -1)) println(i)
  }
  countdown(5)
}