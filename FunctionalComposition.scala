object FunctionalComposition {

  def main(args: Array[String]) {

    def foo() = println("foo")
    def bar() = println("bar")
    val foobar = foo compose bar
    foobar()
    // var foobar = foo.f compose bar.f
    // val foobar f.compose(b)
    // foobar()

    def f(s: String) = "f(" + s + ")"
    def g(s: String) = "g(" + s + ")"
    val fComposeG = f _ compose g _
    println(fComposeG("yay"))
  }

  // // object foo {
  //   def f() ={
  //     println("foo")
  //   }
  // // }
  //
  // // object bar {
  //   def b() ={
  //     println("bar")
  //   }
  // // }
}

