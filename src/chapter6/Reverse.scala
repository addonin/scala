package chapter6

/**
  * @author dimon
  * @since 01/06/16.
  */
object Reverse extends App {
  override def main(args: Array[String]) {
    for (e <- args.reverse) print(e + " ")
  }
}
