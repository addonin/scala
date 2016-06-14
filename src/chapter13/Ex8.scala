package chapter13

/**
  * @author Dmytro_Adonin 
  * @since 6/14/16
  */
object Ex8 extends App {

  def transform(a: Array[Double], cols: Int): Array[Array[Double]] = {
    a.grouped(cols).toArray
  }

  println( transform( Array(1,2,3,4,5,6,7,8), 3 ).map(_.mkString(" ")).mkString(", ") )

}
