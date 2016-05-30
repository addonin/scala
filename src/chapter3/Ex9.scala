package chapter3

/**
  * Created by Dmytro_Adonin on 5/30/16.
  */
object Ex9 extends App {
  def test(): Unit = {
    val ids = java.util.TimeZone.getAvailableIDs()
    ids.filter(_.startsWith("America/")).foreach(x => println(x.replaceFirst("America/", "")))
  }
  test()
}
