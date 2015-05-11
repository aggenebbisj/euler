package ex12

import util.EulerUtil._

object HighlyDivisibleTriangularNumber extends App {

  def ts(start: Long, next: Long): Stream[Long] = start #:: ts(start + next, next + 1)

  def divisors(n: Long): Long = primeFactors(n).groupBy(x => x).mapValues(_.length + 1).values.product

  println(ts(1,2).dropWhile(x => divisors(x) <= 500))
}
