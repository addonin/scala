package chapter4

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex1 extends App {
  val shop = Map("thing1" -> 45, "thing2" ->89)
  val discount = for ((k, v) <- shop) yield k -> v * 0.9
  for ((k, v) <- discount) println(k + " : " + v)
}
