import recfun.Main

object test {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(141); 

  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) {0}
    else{f(a) + sum(f)(a + 1, b)}
  };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(121); 

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) { 1 }
    else { f(a) * product(f)(a + 1, b) }
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(29); val res$0 = 

  product(x => x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(58); 

  def factorial(a: Int): Int = { product(x => x)(1, a) };System.out.println("""factorial: (a: Int)Int""");$skip(16); val res$1 = 

  factorial(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(200); 

  def general(f: Int => Int, method: (Int, Int) => Int, fundamental: Int)(a: Int, b: Int): Int = {
    if (a > b) {fundamental}
    else {method(f(a), general(f, method, fundamental)(a + 1, b))}
  };System.out.println("""general: (f: Int => Int, method: (Int, Int) => Int, fundamental: Int)(a: Int, b: Int)Int""");$skip(49); val res$2 = 
  
  general(x => x, (x, y) => (x * y), 1)(1, 5);System.out.println("""res2: Int = """ + $show(res$2));$skip(42); val res$3 = 
  
  Main.countChange(120, List(1, 2, 4));System.out.println("""res3: Int = """ + $show(res$3))}
  
  
}