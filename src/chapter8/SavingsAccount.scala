package chapter8

import chapter5.Account

/**
  * Created by Dmytro_Adonin on 6/2/16.
  */
class SavingsAccount(private val percents: Int = 10,
                     private val commission: Int = 1,
                     private var freeOperationsAmount: Int = 3) extends Account {

  override def deposit(amount: Double): Unit = {
    if (freeOperationsAmount > 0) {
      super.deposit(amount)
      freeOperationsAmount -= 1
    }
    else super.deposit(amount - commission)

  }

  override def withdraw(amount: Double): Unit = {
    if (freeOperationsAmount > 0) {
      super.withdraw(amount)
      freeOperationsAmount -= 1
    }
    else super.withdraw(amount + commission)
  }

  def earnMonthlyInterest(): Unit = {
    freeOperationsAmount = 3
    super.deposit(super.balance * percents / 100)
  }

}

object Ex2 extends App {
  val a = new SavingsAccount
  a.deposit(10)
  println(a.balance)
  a.withdraw(5)
  println(a.balance)
  a.withdraw(3)
  println(a.balance)
  a.deposit(1)
  println(a.balance)
  a.deposit(1)
  a.earnMonthlyInterest()
  println(a.balance)
}
