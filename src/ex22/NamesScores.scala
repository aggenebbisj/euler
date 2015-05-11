package ex22

import scala.io.Source

object NamesScores extends App {
  val fileName: String = "/Users/remko/Dropbox/workspace/scala/euler/src/ex22/p022_names.txt"

  val names = Source.fromFile(fileName).mkString.replaceAll("\"", "").split(',')

  val sortedNames: Array[String] = names.sorted

  def toScore(name: String) = name.map(_ - 64).sum

  sortedNames.zipWithIndex.map{ case (name: String, index: Int) => toScore(name) * (index + 1) }.sum

  // Alternative
  // sortedNames.zip(Stream from 1).map{ case (name: String, index: Int) => toScore(name) * index }.sum
}
