package ex7

object Prime10001 extends App {
  lazy val primes: Stream[Int] =
    2 #:: Stream.from(3)
      .filter(i => primes.takeWhile{ j => j * j <= i }
      .forall{ k => i % k > 0 });

  println(primes.drop(10000).head)
}
