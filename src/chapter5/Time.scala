package chapter5

/**
  * Created by Dmytro_Adonin on 6/1/16.
  */
class Time {

  private var minutes: Int = 0
  private var hours: Int = 0

  def this(minutes: Int, hours: Int) {
    this()
    if (minutes < 0 && minutes > 60) throw new RuntimeException("Minutes should be between 0 and 60")
    if (hours < 0 && hours > 24) throw new RuntimeException("Minutes should be between 0 and 60")
    this.minutes = minutes
    this.hours = hours
  }

  def before(other: Time): Unit = {
    if (this.hours < other.hours) println("This time before other")
    else if (this.hours == other.hours && this.minutes == other.minutes) {
      println("This time equals other")
    } else println("This time after other")
  }

}

object Test3 extends App {
  val firstTime = new Time(14, 13)
  val secondTime = new Time(13, 13)
  firstTime.before(secondTime)
}
