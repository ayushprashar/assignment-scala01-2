def mul(num:Int): Int ={
  if(num == 1){
    1
  }
  else
    num*mul(num-1)
}

def sum_of_product(num: Int): Int ={
  if(num/10 == 0){
    num
  }
  else{
    sum_of_product(num/10)+num%10
  }
}

def sum_of_product_of_digits(num: Int): Int ={
  sum_of_product(mul(num))
}
sum_of_product_of_digits(5)