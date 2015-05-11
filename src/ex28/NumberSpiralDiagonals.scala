package ex28

object NumberSpiralDiagonals {

  def sumOfLayer(n: Int) = if (n == 1) 1 else 4 * n * n - 6 * (n - 1)

  def sumOfDiagonals(n: Int) = {
    require(n % 2 != 0)
    (1 to n by 2).map(sumOfLayer).sum
  }

  sumOfDiagonals(1001)

}