package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex1 extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = {
    for (i <- low to high) yield (i, fun(i))
  }

  println(values(x => x * x, -5, 5))

}
