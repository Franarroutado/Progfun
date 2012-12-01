import patmat._

object worksheet {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 

  val myList = List(1, 2, 3);System.out.println("""myList  : List[Int] = """ + $show(myList ));$skip(35); val res$0 = 

  myList.count((x: Int) => x > 0);System.out.println("""res0: Int = """ + $show(res$0));$skip(42); 

  val myChars = List(('a', 1), ('z', 3));System.out.println("""myChars  : List[(Char, Int)] = """ + $show(myChars ));$skip(19); val res$1 = 

  myChars.head _1;System.out.println("""res1: Char = """ + $show(res$1));$skip(67); val res$2 = 

  myChars.find((lookingFor: (Char, Int)) => lookingFor._1 == 'a');System.out.println("""res2: Option[(Char, Int)] = """ + $show(res$2));$skip(508); 

  def times(chars: List[Char]): List[(Char, Int)] = {
    def timesHelper(chars: List[Char], accu: List[(Char, Int)]): List[(Char, Int)] = {
      if (chars.isEmpty) { accu }
      else if (accu.find((lookingFor: (Char, Int)) => lookingFor._1 == chars.head) != None) {
        // needs to be fixed
        return timesHelper(chars.tail, accu)
      } else { timesHelper(chars.tail, accu :+ (chars.head, chars.count((character: Char) => character == chars.head))) }

    }
    timesHelper(chars, List())
  };System.out.println("""times: (chars: List[Char])List[(Char, Int)]""");$skip(63); 

  val testList = List('a', 'b', 'a', 'd', 'e', 'g', 'g', 'g');System.out.println("""testList  : List[Char] = """ + $show(testList ));$skip(21); val res$3 = 
  
  testList :+ 'b';System.out.println("""res3: List[Char] = """ + $show(res$3));$skip(34); 
  val timesList = times(testList);System.out.println("""timesList  : List[(Char, Int)] = """ + $show(timesList ));$skip(235); 

  def makeOrderedLeafList(freqs: List[(Char, Int)]): List[Huffman.Leaf] = {
    val orderedFreqs = freqs.sortWith((a: (Char, Int), b: (Char, Int)) => a._2 < b._2)
    orderedFreqs.map((a: (Char, Int)) => Huffman.Leaf(a._1, a._2))
  };System.out.println("""makeOrderedLeafList: (freqs: List[(Char, Int)])List[patmat.Huffman.Leaf]""");$skip(23); val res$4 = 
	Huffman.decodedSecret;System.out.println("""res4: List[Char] = """ + $show(res$4));$skip(61); val res$5 = 
	
	Huffman.encode(Huffman.frenchCode)(Huffman.decodedSecret);System.out.println("""res5: List[patmat.Huffman.Bit] = """ + $show(res$5))}
}