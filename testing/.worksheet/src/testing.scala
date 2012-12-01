object testing {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
  def f(n: Int): Int = {
   if (n < 3) {n}
   else {f(n - 1) + 2 * f(n - 2) + 3 * f(n - 3)}
  };System.out.println("""f: (n: Int)Int""");$skip(8); val res$0 = 
  f(10);System.out.println("""res0: Int = """ + $show(res$0));$skip(16); 
  
  val i = 8;System.out.println("""i  : Int = """ + $show(i ));$skip(66); val res$1 = ;
  switch(i) {
  case 1: System.out.println("hello");
  break;
  };System.out.println("""res1: <error> = """ + $show(res$1))}
}