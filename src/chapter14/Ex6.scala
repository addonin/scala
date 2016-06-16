package chapter14

/**
  * @author dimon
  * @since 15/06/16.
  */
sealed abstract class BinaryTree
case class Leaf(value: Int) extends BinaryTree
case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

object Ex6 extends App {

  def sumLeafs(node: BinaryTree): Int = node match {
    case l: Leaf => l.value
    case n: Node => sumLeafs(n.left) + sumLeafs(n.right)
  }

  println(
    sumLeafs(
      Node(Node(Leaf(3), Leaf(8)), Leaf(5))
    )
  )

}
