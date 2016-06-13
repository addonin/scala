package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex7 extends App {

  def adjustToPair(f: (Int, Int) => Int)(pair: (Int, Int)) = f(pair._1, pair._2)

  println(adjustToPair(_ * _)((6, 7))) // 42
  ((1 to 10) zip (11 to 20)).map(adjustToPair(_ + _)).foreach(println)

}
