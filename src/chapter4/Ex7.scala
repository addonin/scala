package chapter4

import scala.collection.JavaConversions.propertiesAsScalaMap

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex7 extends App {
  val props = propertiesAsScalaMap(System.getProperties)
  props.keySet.map(_.length).max
  for ((k, v) <- props) println(k + " : " + v)
}
