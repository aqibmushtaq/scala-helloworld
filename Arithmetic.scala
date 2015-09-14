object Arithmetic {
  def main(args: Array[String]) {
    def addOne(n: Int): Int = n + 1
    println(addOne(3))

    val addTwo = (n: Int) => n + 2
    println(addTwo(4))

    def addThree(n: Int): Int = {
      List(n,3).sum
    }
    println(addThree(10))

    def addFour(n: Int): Int = {
      var ans : Int = n
      ans += 1
      ans += 1
      ans += 1
      ans += 1
      ans
    }
    println(addFour(10))


  }
}
