package ex5

object SmallestMultiple extends App {

  def naturals(from: Int): Stream[Int] = Stream.cons(from, naturals(from + 1))

  def isDivisibleEvenly(n: Int) = (2 to 20).forall(n % _ == 0)

  def smallestMultiple = {
    naturals(20).dropWhile(!isDivisibleEvenly(_)).head
  }

  println(smallestMultiple)
}
