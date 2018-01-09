object MainApp extends App{
  val exec = new Operations
  val toPrintIndex1 = 10
  val toPrintIndex2 = 20
  val toPrintIndex3 = 30
  val toPrintIndex4 = 40
  val toPrintIndex = List(toPrintIndex1,toPrintIndex2,toPrintIndex3,toPrintIndex4)
  val toFindMax1 = 1
  val toFindMax2 = 5
  val toFindMax3 = 2
  val toFindMax4 = 9
  val toFindMax5 = 7
  val toFindMax = List(toFindMax1,toFindMax2,toFindMax3,toFindMax4,toFindMax5)
  val fibonacciPlaceholder = 4
  val sopod_placeholder = 5
  exec.printIndices(toPrintIndex)
  println(exec.findMax(toFindMax))
  println(exec.nthFibonacci(fibonacciPlaceholder))
  println(exec.sumOfProductOfDigits(sopod_placeholder))
}
