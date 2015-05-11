package ex17

object NumberLetterCounts {

  val ones =
    Map(
      1 -> "one",
      2 -> "two",
      3 -> "three",
      4 -> "four",
      5 -> "five",
      6 -> "six",
      7 -> "seven",
      8 -> "eight",
      9 -> "nine",
      10 -> "ten",
      11 -> "eleven",
      12 -> "twelve",
      13 -> "thirteen",
      14 -> "fourteen",
      15 -> "fifteen",
      16 -> "sixteen",
      17 -> "seventeen",
      18 -> "eighteen",
      19 -> "nineteen"
    )

  val tens = Map(
    2 -> "twenty",
    3 -> "thirty",
    4 -> "forty",
    5 -> "fifty",
    6 -> "sixty",
    7 -> "seventy",
    8 -> "eighty",
    9 -> "ninety"
  )
  val hundred = "hundred"
  val thousand = "thousand"

  def toWord(n: Int): String = {
    if (n == 1000) "one thousand"
    else if (n % 100 == 0) toWord(n / 100) + " hundred"
    else if (n / 100 > 0) toWord(n / 100) + " hundred and " + toWord(n % 100)
    else if (n < 20) ones(n)
    else if (n % 10 == 0) tens(n / 10)
    else tens(n / 10) + "-" + ones(n % 10)
  }

  toWord(20)

  (1 to 1000)
    .map(
      x => toWord(x)
        .replaceAll("-", "")
        .replaceAll(" ", "")
        .length
    ).sum
}
