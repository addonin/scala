package chapter12

/**
  * @author Dmytro_Adonin 
  * @since 6/13/16
  */
object Ex8 extends App {

  println(Array("q", "qw", "qwe").corresponds(Array(1, 2, 3))(_.length == _))
  println(Array("q", "qw", "qwe").corresponds(Array(1, 2, 2))(_.length == _))

}
