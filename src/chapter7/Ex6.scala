package chapter7

/*import java.util.{HashMap => JavaHashMap}
import scala.collection.mutable.{HashMap => ScalaHashMap}*/

/**
  * Created by Dmytro_Adonin on 6/2/16.
  */
object Ex6 extends App {

  import java.util.{HashMap => JavaHashMap}
  import scala.collection.mutable.{HashMap => ScalaHashMap}

  val source = new JavaHashMap[Int, String]()
  val dest = new ScalaHashMap[Int, String]()

  for (i <- 1 to 5) source.put(i , "" + i)
  for (key <- source.keySet.toArray(new Array[Integer](0))) dest(key) = source.get(key)
  println(dest)

}
