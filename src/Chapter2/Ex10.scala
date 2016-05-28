package Chapter2

/**
  * @author dimon
  * @since 28/05/16.
  */
object Ex10 extends App {
  def pow(x: Double, n: Int): Double = {
    if (n == 0) 1
    else {
      if (n > 0) {
        if (n > 2 && n % 2 == 0) pow(pow(x, n / 2), 2)
        else x * pow(x, n - 1)
      }
      else 1 / pow(x, -n)
    }
  }
  println(pow(3, 7))
}
