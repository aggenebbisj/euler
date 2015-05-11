package ex16

object PowerDigitSum extends App {
  def powerOf(x: Int, power: Int): BigInt = {
    if (power == 1) BigInt(x)
    else BigInt(x) * powerOf(x,  power - 1)
  }

  powerOf(2, 1000).toString.map(_.asDigit).sum
}
