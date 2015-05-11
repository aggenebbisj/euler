package ex20

object FactorialDigitSum extends App {
  def fac(n: BigInt): BigInt = if (n <= 0) 1 else n * fac(n - 1)

  fac(100).toString.map(_.asDigit).sum
}
