package chapter14

/**
  * @author Dmytro_Adonin 
  * @since 6/15/16
  */
abstract class Item

case class Article(desc: String, price: Double) extends Item

case class Bundle(desc: String, discount: Double, items: Item *) extends Item

case class Multiple(multiplier: Int, item: Item) extends Item

object Ex4 extends App {

}
