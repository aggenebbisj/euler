package ex14

object LongestCollatzSequence extends App {

  def collatzSeq(n: Long): Long =
    if (n == 1) 1
    else if (n % 2 == 0) 1 + collatzSeq(n / 2)
    else 1 + collatzSeq(3 * n + 1)

  val seqMap = (1 to 1000000).map(x => collatzSeq(x) -> x).toMap

  seqMap(seqMap.keys.max)
  
}
