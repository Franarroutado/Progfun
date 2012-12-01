import forcomp.Anagrams._

object testing {

  val charString = "Hello world!"                 //> charString  : java.lang.String = Hello world!
  val occurencesMap = charString.groupBy((c: Char) => c.toLowerCase)
                                                  //> occurencesMap  : scala.collection.immutable.Map[Char,String] = Map(e -> e, !
                                                  //|  -> !,   -> " ", l -> lll, h -> H, r -> r, w -> w, o -> oo, d -> d)

  val occurenceList = occurencesMap.toList        //> occurenceList  : List[(Char, String)] = List((e,e), (!,!), ( ," "), (l,lll),
                                                  //|  (h,H), (r,r), (w,w), (o,oo), (d,d))

  val occurence = occurenceList.map((a) => (a._1, a._2.length()))
                                                  //> occurence  : List[(Char, Int)] = List((e,1), (!,1), ( ,1), (l,3), (h,1), (r,
                                                  //| 1), (w,1), (o,2), (d,1))

  val listNums = List(1, 2, 4, 3, 1, 1)           //> listNums  : List[Int] = List(1, 2, 4, 3, 1, 1)

  val sum = listNums.foldLeft(0)((a, b) => a + b) //> sum  : Int = 12

  val listStrings = List("hi", "there", "hiagain", "hi")
                                                  //> listStrings  : List[java.lang.String] = List(hi, there, hiagain, hi)
  val foldedString = (listStrings.foldLeft("")((a, b) => a.concat(b)))
                                                  //> foldedString  : java.lang.String = hitherehiagainhi

  val testHash = Map(4 -> 2, 2 -> 1)              //> testHash  : scala.collection.immutable.Map[Int,Int] = Map(4 -> 2, 2 -> 1)

  testHash(2)                                     //> res0: Int = 1

  listNums foreach ((b) => System.out.println(b)) //> 1
                                                  //| 2
                                                  //| 4
                                                  //| 3
                                                  //| 1
                                                  //| 1

  val comboTest = List(('a', 2), ('b', 2))        //> comboTest  : List[(Char, Int)] = List((a,2), (b,2))
  comboTest ::: (Nil)                             //> res1: List[(Char, Int)] = List((a,2), (b,2))

  def what(a: List[Int]): List[Int] = {
    for (g <- a) yield (g)
  }                                               //> what: (a: List[Int])List[Int]

  listNums(1)                                     //> res2: Int = 2
  
  val mySentence: Sentence = List("Linux", "rulez")
                                                  //> mySentence  : forcomp.Anagrams.Sentence = List(Linux, rulez)
  val hello = dictionaryByOccurrences(List(('a', 3), ('b', 191)))
                                                  //> hello  : List[forcomp.Anagrams.Word] = List()
  sentenceAnagrams(mySentence)                    //> res3: List[forcomp.Anagrams.Sentence] = List(List(Zulu, Rex, Lin), List(Rex,
                                                  //|  Zulu, Lin), List(Zulu, Rex, nil), List(Rex, Zulu, nil), List(Uzi, Rex, null
                                                  //| ), List(Rex, Uzi, null), List(Zulu, Lin, Rex), List(Zulu, nil, Rex), List(Uz
                                                  //| i, null, Rex), List(null, Uzi, Rex), List(Lin, Zulu, Rex), List(nil, Zulu, R
                                                  //| ex), List(rulez, Linux), List(Rex, null, Uzi), List(null, Rex, Uzi), List(Li
                                                  //| nux, rulez), List(Rex, Lin, Zulu), List(Rex, nil, Zulu), List(Lin, Rex, Zulu
                                                  //| ), List(nil, Rex, Zulu))

}