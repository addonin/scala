package chapter6

//import Suits._

/**
  * @author dimon
  * @since 01/06/16.
  */
object Suits extends Enumeration with App {

  //type Suits = Value

  val Spades = Value("\u2660")
  val Diamond = Value("\u2666")
  val Club = Value("\u2663")
  val Heart = Value("\u2764")

  def isRed(s: Suits.Value): Boolean = {
    s.equals(Diamond) || s.equals(Heart)
  }

  for (suit <- Suits.values) {
    println(suit + " " + (if (isRed(suit)) "red" else "black"))
  }

}
