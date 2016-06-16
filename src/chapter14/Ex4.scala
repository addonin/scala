package chapter14

/**
  * @author Dmytro_Adonin 
  * @since 6/15/16
  */
abstract class Item
case class Article(desc: String, price: Double) extends Item
case class Bundle(desc: String, discount: Double, items: Item *) extends Item
case class Multiple(count:Int, item:Item) extends Item

object Ex4 extends App {

  def price(item: Item): Double = item match {
    case Article(_, price) => price
    case Bundle(_, discount, items @ _ *)  => items.map(price).sum - discount
    case Multiple(count, i) => price(i) * count
  }

  val all =
    Bundle("b1", 5,
      Article("a1", 14),
      Multiple(2,
        Bundle("b2", 4,
          Article("a2", 32), Article("a3", 11))))
  println(price(all))
}
