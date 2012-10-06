

object Test {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  println("Welcome to the Scala worksheet")

  type Set = Int => Boolean;$skip(150); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(123); 

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = { (x: Int) => elem == x };System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(182); 

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = { x: Int => s(x) || t(x) };System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(190); 

  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` or `t`.
   */
  def intersect(s: Set, t: Set): Set = { x: Int => s(x) && t(x) };System.out.println("""intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(183); 

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = { x: Int => s(x) && !t(x) };System.out.println("""diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(139); 

  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = { x: Int => s(x) && p(x) };System.out.println("""filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean""");$skip(88); 

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000;System.out.println("""bound  : Int = """ + $show(bound ));$skip(286); 

  /**
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a > bound) { true }
      else if (s(a) && !p(a)) { false }
      else iter(a + 1)
    }
    iter(-bound)
  };System.out.println("""forall: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(188); 

  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = { !forall(s, { x: Int => !p(x) }) };System.out.println("""exists: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(181); 

  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = { x: Int => exists(s, { input: Int => f(input) == x }) };System.out.println("""map: (s: Int => Boolean, f: Int => Int)Int => Boolean""");$skip(185); 

  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  };System.out.println("""toString: (s: Int => Boolean)String""");$skip(117); 

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  };System.out.println("""printSet: (s: Int => Boolean)Unit""");$skip(32); 
  
  val four = singletonSet(4);System.out.println("""four  : Int => Boolean = """ + $show(four ));$skip(29); 
  val five = singletonSet(5);System.out.println("""five  : Int => Boolean = """ + $show(five ));$skip(38); 
  val fourAndFive = union(four, five);System.out.println("""fourAndFive  : Int => Boolean = """ + $show(fourAndFive ));$skip(55); val res$0 = 
  
  forall(fourAndFive, {x: Int => x == 4 || x == 5});System.out.println("""res0: Boolean = """ + $show(res$0));$skip(45); val res$1 = 
  
  exists(fourAndFive, {x: Int => x == 3});System.out.println("""res1: Boolean = """ + $show(res$1));$skip(54); 
  
  val mapped = map(fourAndFive, {x: Int => x * 2});System.out.println("""mapped  : Int => Boolean = """ + $show(mapped ));$skip(22); 
  
  printSet(mapped)}
}