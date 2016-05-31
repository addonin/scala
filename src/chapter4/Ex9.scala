package chapter4

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex9 extends App {
  def lteqgt(a: Array[Int], v: Int) = (
    a.count(_ < v), a.count(_ == v), a.count(_ > v)
  )
  print(lteqgt(Array(1,2,3,3,3,4,4,4,4), 3))
}
