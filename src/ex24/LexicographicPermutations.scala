package ex24

object LexicographicPermutations extends App {
  List(0,1,2,3,4,5,6,7,8,9)
    .permutations
    .drop(999999)
    .next
    .mkString
}
