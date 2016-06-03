package chapter8

/**
  * Created by Dmytro_Adonin on 6/3/16.
  */
abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(override val price: Double, override val description: String) extends Item {}

class Bundle extends Item {

  var items: List[Item] = List()

  def add(item: Item) { items = item :: items }

  override def price: Double = items.map(_.price).sum

  override def description: String = items.map(_.description).mkString("\n")

}

object Ex4 extends App {
  val i1 = new SimpleItem(13, "Item1")
  val i2 = new SimpleItem(3, "Item2")
  val bundle = new Bundle
  bundle.add(i1)
  bundle.add(i2)
  println(bundle.price)
  println(bundle.description)
}
