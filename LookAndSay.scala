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
    // return List(newN.mkString) ++ generate(i - 1, newN.mkString)
  }

}
