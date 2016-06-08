package chapter10

/**
  * Created by Dmytro_Adonin on 6/8/16.
  */

trait Logger {
  def log(msg: String)
}

trait CryptoLogger extends Logger {
  val key: Int = 3
  abstract override def log(msg: String) = { // "abstract" is important for abstract "log" method of Logger, ommited in case nnon-abstract
    super.log(msg.map(_ + key).map(_.toChar).mkString)
  }
}

class ConsoleLogger extends Logger {
  def log(msg: String) { println(msg) }
}

object Ex4 extends App {
  (new ConsoleLogger).log("ConsoleLogger")
  (new ConsoleLogger with CryptoLogger).log("ConsoleLogger with encryption and shift 3")
  (new {override val key:Int = -3} with ConsoleLogger with CryptoLogger).log("ConsoleLogger with encryption and shift -3")
}
