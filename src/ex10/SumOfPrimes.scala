package ex10

object SumOfPrimes extends App {
  lazy val primes: Stream[Int] =
    2 #:: Stream.from(3)
      .filter(i => primes.takeWhile{ j => j * j <= i }
      .forall{ k => i % k > 0 });

  println(primes.takeWhile(_ < 2000000).map(BigInt(_)).sum)
}
