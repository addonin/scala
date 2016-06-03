package chapter5

/**
  * Created by Dmytro_Adonin on 6/1/16.
  */
class Account {

  private var count: Double = 0

  def deposit(amount: Double): Unit = {
    count += amount
  }

  def withdraw(amount: Double): Unit = {
    if (count >= amount) count -= amount else throw new RuntimeException("Not enough to withdraw")
  }

  def balance = count

}

object Test2 extends App {
  val a = new Account
  a.deposit(10)
  println(a.balance)
  a.withdraw(5)
  println(a.balance)
  a.withdraw(10)
}



