object MainApp extends App{
  val exec = new Operations
  val toPrintIndex = List(10, 20, 30, 40)
  val toFindMax = List(1,5,2,9,7)
  val fibonacciPlaceholder = 4
  val sopod_placeholder = 5
  exec.print_indices(toPrintIndex)
  println(exec.findMax(toFindMax))
  println(exec.nth_fibonacci(fibonacciPlaceholder))
  println(exec.sum_of_product_of_digits(sopod_placeholder))
}
