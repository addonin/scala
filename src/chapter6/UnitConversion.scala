package chapter6

/**
  * @author dimon
  * @since 01/06/16.
  */
abstract class UnitConversion {
  def convert(measure: Int): Double
}

object InchesToCentimeters extends UnitConversion {
  def convert(inches: Int): Double = {
    inches / 2.54
  }
}

object GallonsToLiters extends UnitConversion {
  def convert(gallons: Int): Double = {
    gallons / 3.78541
  }
}

object MilesToKilometers extends UnitConversion {
  def convert(miles: Int): Double = {
    miles / 1.60934
  }
}