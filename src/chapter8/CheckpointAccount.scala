package chapter8

import chapter5.Account

/**
  * Created by Dmytro_Adonin on 6/2/16.
  */

class CheckpointAccount extends Account {

  import CheckpointAccount._

  override def deposit(amount: Int): Unit = {
    if (amount >= 1) super.deposit(amount - 1)
    else throw new RuntimeException(NOT_ENOUGH_TO_PAY_COMISSION)
  }

  override def withdraw(amount: Int): Unit = {
    if (balance - amount > 1) super.withdraw(amount + 1)
    else throw new RuntimeException(NOT_ENOUGH_TO_PAY_COMISSION)
  }

}

object CheckpointAccount extends App {

  val NOT_ENOUGH_TO_PAY_COMISSION = "Not enough to pay comission"

  val checkpointAccount = new CheckpointAccount
  checkpointAccount.deposit(10)
  println(checkpointAccount.balance)
  checkpointAccount.withdraw(5)
  println(checkpointAccount.balance)
  checkpointAccount.withdraw(5)

}
