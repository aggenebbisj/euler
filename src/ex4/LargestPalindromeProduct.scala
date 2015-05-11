package ex4

object LargestPalindromeProduct extends App {
  def largestPalindrome: Int = {
    val pals = for {
      i <- 999 to 100 by -1
      j <- 999 to 100 by -1
      if (isPalindrome(i * j))
    } yield i * j
    pals.max
  }

  def isPalindrome(n: Int) = {
    n.toString == n.toString.reverse
  }

  println(largestPalindrome)
}
