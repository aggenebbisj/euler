val pans = (1 to 9).toList.permutations.take(10)

val pansAsNums = pans.map(list => list.foldRight("")(_.toString ++ _)).map(_.toInt)

pansAsNums.mkString(", ")


def products(ns: List[Int]): List[List[Int]] = ns match {
  case x :: Nil =>
  case x :: xs =>
}

1234 5 6789