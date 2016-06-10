package chapter11

/**
  * @author Dmytro_Adonin 
  * @since 6/10/16
  */
class Matrix(val size: Int) {

  if (size < 1) throw new RuntimeException("Size should be > 1")
  val matrix: Array[Array[Int]] = Array.ofDim(size, size)

  def apply(row:Int, col:Int) = matrix(row)(col)
  def update(row:Int, col:Int, value:Int) { matrix(row)(col) = value }
  override def toString: String = (for (row <- matrix) yield row.mkString(" ")).mkString("\n")

  def +(other: Matrix) = {
    require (size == other.size)
    val res = new Matrix(size)
    for(i <- 0 until size; j <- 0 until size) {
      res(i, j) = this(i, j) + other(i, j)
    }
    res
  }

  def *(factor: Int) = {
    val res = new Matrix(size)
    for(i <- 0 until size; j <- 0 until size) {
      res(i, j) = this(i, j) * factor
    }
    res
  }

  private def prod(other: Matrix, i: Int, j: Int) = {
    (for (k <- 0 until size) yield this(i, k) * other(j, k)).sum
  }

  def *(other: Matrix) = {
    require(size == other.size)
    val res = new Matrix(size)
    for(i <- 0 until size; j <- 0 until size) {
      res(i, j) = prod(other, i, j)
    }
    res
  }

}

object Ex8 extends App {
  val size = 3
  val m1 = new Matrix(size)
  val m2 = new Matrix(size)
  for (row <- 0 until size; col <- 0 until size) m1.update(row, col, (row + 1) * col + 1)
  for (row <- 0 until size; col <- 0 until size) m2.update(row, col, (row + 1) * col + 1)
  println(m1)
  println(m1 * 2)
  println(m1 * m2)

}