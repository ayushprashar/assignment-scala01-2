class Operations {

  def printIndices(domain: List[Int]) {
    val result = for (counter <- 0 to domain.length - 1) yield s" $counter = ${domain(counter)} \n"
    print(result.mkString("\n"))
  }

  def bubbleSort(domain: Array[Int]): List[Int] = {
    for (counter1 <- 0 until domain.length - 1) {
      for (counter2 <- 0 until domain.length - counter1 - 1) {
        if(domain(counter2) > domain(counter2 + 1)){
          val temporary: Int = domain(counter2)
          domain(counter2) = domain(counter2 + 1)
          domain(counter2 + 1) = temporary
        }
      }
    }
    domain.toList
  }

  def findMax(domain: List[Int]): Int = {
    val result: List[Int] = bubbleSort(domain.toArray)
    result(result.length - 1)
  }

  def nthFibonacci(index: Int): Int = {
    if(index == 0){
      0
    }
    else{
      if(index == 1){
        1
      }
      else {
        nthFibonacci(index - 1) + nthFibonacci(index - 2)
      }
    }
  }

  def mul(num: Int): Int = {
    if(num == 1){
      1
    }
    else {
      num * mul(num - 1)
    }
  }

  def sumOfProduct(num: Int): Int = {
    if(num / 10 == 0){
      num
    }
    else {
      sumOfProduct(num / 10) + num % 10
    }
  }

  def sumOfProductOfDigits(num: Int): Int = {
    sumOfProduct(mul(num))
  }
}
