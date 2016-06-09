package chapter11

/**
  * Created by Dmytro_Adonin on 6/9/16.
  */
class Money(val bill: Int, val coin: Int) {

  if (coin > 99) throw new RuntimeException("Coins should be < 99")

  def + (that: Money): Money = {
    val coins = this.coin + that.coin
    Money(this.bill + that.bill + (if (coins >= 100) 1 else 0), coins % 100)
  }

  def - (that: Money): Money = {
    val newCoin = this.coin - that.coin
    val newBill = this.bill - that.bill - (if (newCoin < 0) 1 else 0)
    Money(if (newBill < 0) throw new RuntimeException("Negative value: ") else newBill, if (newCoin < 0) 100 + newCoin else newCoin)
  }

  def == (that: Money): Boolean = this.bill == that.bill && this.coin == that.coin

  def < (that: Money): Boolean = {
    if (this.bill < that.bill || (this.bill == that.bill && this.coin < that.coin)) true else false
  }

  override def toString = bill + "." + (if (coin < 10) "0" + coin else coin)
}

object Money {
  def apply(bill: Int, coin: Int): Money = new Money(bill, coin)
  def roundCoin(coin: Int): Int = if (coin / 100 == 0) coin else roundCoin(coin / 10)
}

object Ex4 extends App {
  println(Money(112, 85) + Money(1, 26))
  println(Money(112, 85) - Money(1, 96))
  println(Money(112, 85) == Money(112, 85))
  println(Money(112, 85) < Money(112, 85))
}

