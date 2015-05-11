package ex6

object SumSquareDifferenceOpt extends App {
  def sqr(x: Long) = x * x

  def squareOfSum(n: Long) = sqr(n * (n + 1) / 2)

  def sumOfSquares(n: Long) = n * (2 * n + 1) * (n + 1) / 6

  def diff(n: Long) = squareOfSum(n) - sumOfSquares(n)

  println(diff(100))
}
