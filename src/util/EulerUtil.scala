package util

object EulerUtil {

  def triangular(n: Long): Long = n * (n + 1) / 2

  lazy val primes: Stream[Int] =
    2 #:: Stream.from(3)
      .filter(i => primes.takeWhile{ j => j * j <= i }
      .forall{ k => i % k > 0 });

  def isPrime(n: Long): Boolean = !(2L until Math.sqrt(n).round + 1).exists(n % _ == 0)

  def primeFactors(n: Long): List[Long] = {
    def primeFac(n: Long, primes: Stream[Int]): List[Long] = {
      if (isPrime(n)) List(n)
      else {
        if (n % primes.head == 0) primes.head :: primeFactors(n / primes.head)
        else primeFac(n, primes.tail)
      }
    }
    primeFac(n, primes)
  }

}
