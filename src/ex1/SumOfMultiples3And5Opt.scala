package ex1

object SumOfMultiples3And5Opt extends App {
  val multiplesOf3: Set[Int] = (0 until 1000 by 3).toSet
  val multiplesOf5: Set[Int] = (0 until 1000 by 5).toSet

  println( (multiplesOf3 ++ multiplesOf5).sum )
}
