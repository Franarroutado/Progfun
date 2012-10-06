object test {

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) {0}
    else{f(a) + sum(f)(a + 1, b)}
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) { 1 }
    else { f(a) * product(f)(a + 1, b) }
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int

  product(x => x * x)(3, 4)                       //> res0: Int = 144

  def factorial(a: Int): Int = { product(x => x)(1, a) }
                                                  //> factorial: (a: Int)Int

  factorial(3)                                    //> res1: Int = 6

  def general(f: Int => Int, method: (Int, Int) => Int, fundamental: Int)(a: Int, b: Int): Int = {
    if (a > b) {fundamental}
    else {method(f(a), general(f, method, fundamental)(a + 1, b))}
  }                                               //> general: (f: Int => Int, method: (Int, Int) => Int, fundamental: Int)(a: Int
                                                  //| , b: Int)Int
  
  general(x => x, (x, y) => (x * y), 1)(1, 5)     //> res2: Int = 120
  
  
}