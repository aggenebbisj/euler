package ex1

object SumOfMultiples3And5 extends App {

  val candidates = for {
    n <- 1 until 1000
    if (n % 3 == 0 || n % 5 == 0)
  } yield n

  println(candidates.sum)

}
