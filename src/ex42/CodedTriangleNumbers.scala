package ex42

object CodedTriangleNumbers {
  import util.EulerUtil

  import scala.io.Source

  val fileName: String = "/Users/remko/Dropbox/workspace/scala/euler/src/ex42/p042_words.txt"

  val names = Source.fromFile(fileName).mkString.replaceAll("\"", "").split(',')

  def toScore(name: String) = name.map(_ - 64).sum

  val tSet = (1L to 3000).map(EulerUtil.triangular).toSet
  names.map(toScore(_).toLong).filter(tSet).size

}
