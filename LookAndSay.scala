// scalac LookAndSay.scala && scala LookAndSay 10
// 1
// 11
// 21
// 1211
// 111221
// 312211
// 13112221
// 1113213211
// 31131211131221
// 13211311123113112211
// 11131221133112132113212221
object LookAndSay {

  def main(args: Array[String]) {
    println(generate(args(0).toInt).mkString("\n"))
  }

  def generate(i: Integer = 1, n: String = "1"): List[String] = {
    if (i == 0)
      return List(n);

    val arrN= n.split("0+|(?<=(\\d))(?!\\1)")
    val newN = for(group <- arrN)
    yield group.size + "" + group(0)

    return List(n) ++ generate(i - 1, newN.mkString)
  }

}
