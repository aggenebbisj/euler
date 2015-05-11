package ex9

object PythagoreanTriplet extends App {

  val triplets = for {
    a <- 1 to 998
    b <- a + 1 to 999
    c <- b + 1 to 1000
    if (a + b + c == 1000)
    if (a * a + b * b == c * c)
  } yield (a * b * c)

  println(triplets.head)
}
