object testing {
  def f(n: Int): Int = {
   if (n < 3) {n}
   else {f(n - 1) + 2 * f(n - 2) + 3 * f(n - 3)}
  }
  f(10)
  
  val i = 8;
  switch(i) {
  case 1: System.out.println("hello");
  break;
  }
}