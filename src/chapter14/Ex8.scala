package chapter14

/**
  * @author dimon
  * @since 15/06/16.
  */
sealed abstract class BinaryTree2
case class Leaf2(value: Int) extends BinaryTree2
case class Node2(op: Char, nodes: BinaryTree2*) extends BinaryTree2

object Ex8 extends App {

  def eval(node: BinaryTree2): Int = node match {
    case Leaf2(v) => v
    case Node2('+', nodes @ _*) => nodes.map(eval).sum
    case Node2('-', nodes @ _*) => -nodes.map(eval).sum
    case Node2('*', nodes @ _*) => nodes.map(eval).product
  }

  println(eval(Node2('+', Node2('*', Leaf2(3), Leaf2(8)), Leaf2(2),  Node2('-', Leaf2(5)))))

}
