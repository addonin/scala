package chapter5

import javax.print.attribute.standard.PrinterMoreInfoManufacturer

/**
  * @author dimon
  * @since 01/06/16.
  */
class Car(val manufacturer: String,
          val model: String,
          val year: Int = -1,
          var number: String = "") {
}

object Test8 extends App {
  val c = new Car("BMW", "X5", number = "9809832")
  println(c.manufacturer + " " + c.model + " " + c.year + " " + c.number)
}