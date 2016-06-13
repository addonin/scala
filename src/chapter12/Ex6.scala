package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex6 extends App {

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.map(fun).zip(inputs).max._2
  }

  println(largest(x => 10 * x - x * x, 1 to 10)) // 5

}
