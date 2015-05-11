package ex2

object EvenFibonacci extends App {

  def fibFrom(a: Int, b: Int): Stream[Int] = a #:: fibFrom(b, a + b)

  val result =
    fibFrom(1, 1)
    .filter(_ % 2 == 0)
    .takeWhile(_ < 4000000)
    .sum

  println(result)
}
