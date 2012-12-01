import forcomp.Anagrams._

object testing {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 

  val charString = "Hello world!";System.out.println("""charString  : java.lang.String = """ + $show(charString ));$skip(69); 
  val occurencesMap = charString.groupBy((c: Char) => c.toLowerCase);System.out.println("""occurencesMap  : scala.collection.immutable.Map[Char,String] = """ + $show(occurencesMap ));$skip(44); 

  val occurenceList = occurencesMap.toList;System.out.println("""occurenceList  : List[(Char, String)] = """ + $show(occurenceList ));$skip(67); 

  val occurence = occurenceList.map((a) => (a._1, a._2.length()));System.out.println("""occurence  : List[(Char, Int)] = """ + $show(occurence ));$skip(41); 

  val listNums = List(1, 2, 4, 3, 1, 1);System.out.println("""listNums  : List[Int] = """ + $show(listNums ));$skip(51); 

  val sum = listNums.foldLeft(0)((a, b) => a + b);System.out.println("""sum  : Int = """ + $show(sum ));$skip(58); 

  val listStrings = List("hi", "there", "hiagain", "hi");System.out.println("""listStrings  : List[java.lang.String] = """ + $show(listStrings ));$skip(71); 
  val foldedString = (listStrings.foldLeft("")((a, b) => a.concat(b)));System.out.println("""foldedString  : java.lang.String = """ + $show(foldedString ));$skip(38); 

  val testHash = Map(4 -> 2, 2 -> 1);System.out.println("""testHash  : scala.collection.immutable.Map[Int,Int] = """ + $show(testHash ));$skip(15); val res$0 = 

  testHash(2);System.out.println("""res0: Int = """ + $show(res$0));$skip(51); 

  listNums foreach ((b) => System.out.println(b));$skip(44); 

  val comboTest = List(('a', 2), ('b', 2));System.out.println("""comboTest  : List[(Char, Int)] = """ + $show(comboTest ));$skip(22); val res$1 = 
  comboTest ::: (Nil);System.out.println("""res1: List[(Char, Int)] = """ + $show(res$1));$skip(72); 

  def what(a: List[Int]): List[Int] = {
    for (g <- a) yield (g)
  };System.out.println("""what: (a: List[Int])List[Int]""");$skip(15); val res$2 = 

  listNums(1);System.out.println("""res2: Int = """ + $show(res$2));$skip(55); 
  
  val mySentence: Sentence = List("Linux", "rulez");System.out.println("""mySentence  : forcomp.Anagrams.Sentence = """ + $show(mySentence ));$skip(66); 
  val hello = dictionaryByOccurrences(List(('a', 3), ('b', 191)));System.out.println("""hello  : List[forcomp.Anagrams.Word] = """ + $show(hello ));$skip(31); val res$3 = 
  sentenceAnagrams(mySentence);System.out.println("""res3: List[forcomp.Anagrams.Sentence] = """ + $show(res$3))}

}