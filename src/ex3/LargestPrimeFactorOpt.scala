package ex3

object LargestPrimeFactorOpt extends App {

  def naturals(from: Int): Stream[Int] = Stream.cons(from, naturals(from + 1))

  def largestPrimeFactor(n: Long): Long = {

    def largestPrimeFactorRec(n: Long, naturals: Stream[Int]): Long = {
      val largestPrime = naturals.head
      if (n == 1) largestPrime
      else if (n % largestPrime == 0) largestPrimeFactorRec(n / largestPrime, naturals)
      else largestPrimeFactorRec(n, naturals.tail)
    }

    largestPrimeFactorRec(n, naturals(2))
  }

  println(largestPrimeFactor(600851475143L))
}
