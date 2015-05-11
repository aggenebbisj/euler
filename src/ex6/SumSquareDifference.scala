package ex6

object SumSquareDifference extends App {
  def sqr(x: Int) = x * x

  val squareOfSum: Long = sqr((1 to 100).sum)
  val sumOfSquares  = (1 to 100).map(sqr(_)).sum

  println(squareOfSum - sumOfSquares)
}
