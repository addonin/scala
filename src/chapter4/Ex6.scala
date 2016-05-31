package chapter4

import scala.collection.mutable

/**
  * Created by Dmytro_Adonin on 5/31/16.
  */
object Ex6 extends App {
  val days = mutable.LinkedHashMap(
    "MONDAY" -> java.util.Calendar.MONDAY,
    "TUESDAY" -> java.util.Calendar.TUESDAY,
    "WEDNESDAY" -> java.util.Calendar.WEDNESDAY,
    "THURSDAY" -> java.util.Calendar.THURSDAY,
    "FRIDAY" -> java.util.Calendar.FRIDAY,
    "SATURDAY" -> java.util.Calendar.SATURDAY,
    "SUNDAY" -> java.util.Calendar.SUNDAY
  )
  for ((k, v) <- days) println(k + " : " + v)
}
