

object Test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  type Set = Int => Boolean

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean

  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = { (x: Int) => elem == x }
                                                  //> singletonSet: (elem: Int)Int => Boolean

  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = { x: Int => s(x) || t(x) }
                                                  //> union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` or `t`.
   */
  def intersect(s: Set, t: Set): Set = { x: Int => s(x) && t(x) }
                                                  //> intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set = { x: Int => s(x) && !t(x) }
                                                  //> diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean

  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set = { x: Int => s(x) && p(x) }
                                                  //> filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean

  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000                                //> bound  : Int = 1000

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
  }                                               //> forall: (s: Int => Boolean, p: Int => Boolean)Boolean

  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = { !forall(s, { x: Int => !p(x) }) }
                                                  //> exists: (s: Int => Boolean, p: Int => Boolean)Boolean

  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = { x: Int => exists(s, { input: Int => f(input) == x }) }
                                                  //> map: (s: Int => Boolean, f: Int => Int)Int => Boolean

  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }                                               //> toString: (s: Int => Boolean)String

  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  }                                               //> printSet: (s: Int => Boolean)Unit
  
  val four = singletonSet(4)                      //> four  : Int => Boolean = <function1>
  val five = singletonSet(5)                      //> five  : Int => Boolean = <function1>
  val fourAndFive = union(four, five)             //> fourAndFive  : Int => Boolean = <function1>
  
  forall(fourAndFive, {x: Int => x == 4 || x == 5})
                                                  //> res0: Boolean = true
  
  exists(fourAndFive, {x: Int => x == 3})         //> res1: Boolean = false
  
  val mapped = map(fourAndFive, {x: Int => x * 2})//> mapped  : Int => Boolean = <function1>
  
  printSet(mapped)                                //> {8,10}
}