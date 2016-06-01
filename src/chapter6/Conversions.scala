package chapter6

/**
  * @author dimon
  * @since 01/06/16.
  */
object Conversions extends App {

  def inchesToCentimeters(inches: Int): Double = {
    inches / 2.54
  }

  def gallonsToLiters(gallons: Int): Double = {
    gallons / 3.78541
  }

  def milesToKilometers(miles: Int): Double = {
    miles / 1.60934
  }

}
