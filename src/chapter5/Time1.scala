package chapter5

/**
  * @author dimon
  * @since 01/06/16.
  */
class Time1(private val h: Int, private val m: Int) {

  private val minutesFromMidnight: Int = h * 60 + m

  def before(other: Time1): Unit = {
    if (this.minutesFromMidnight < other.minutesFromMidnight) println("This time before other")
    else if (this.minutesFromMidnight == other.minutesFromMidnight) {
      println("This time equals other")
    } else println("This time after other")
  }

}

object Test4 extends App {
  val firstTime = new Time1(14, 13)
  val secondTime = new Time1(13, 13)
  firstTime.before(secondTime)
}