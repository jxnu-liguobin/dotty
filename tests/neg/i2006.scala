object Test {

  inline def foo(f: Int ?=> Int): AnyRef = f // error
  inline def bar(f: Int ?=> Int) = f // error

  def main(args: Array[String]) = {
    foo((using thisTransaction) => 43)
    bar((using thisTransaction) => 44)
  }
}
