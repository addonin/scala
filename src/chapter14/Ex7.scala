package chapter14

/**
  * @author dimon
  * @since 15/06/16.
  */
sealed abstract class BinaryTree1
case class Leaf1(value: Int) extends BinaryTree1
case class Node1(nodes: BinaryTree1*) extends BinaryTree1

object Ex7 extends App {

  def leafSum(node: BinaryTree1): Int = node match {
    case l: Leaf1 => l.value
    case Node1(nodes @ _*) => nodes.map(leafSum).sum
  }

  println(
    leafSum(
      Node1(Node1(Leaf1(3), Leaf1(8)), Leaf1(5), Node1(Leaf1(4), Leaf1(4), Leaf1(1)))
    )
  )

}
