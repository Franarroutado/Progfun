import patmat.Huffman._

object work {

  val listOfTrees = List(Leaf('a', 3))            //> listOfTrees  : List[patmat.Huffman.Leaf] = List(Leaf(a,3))
  combine(listOfTrees)                            //> res0: List[patmat.Huffman.CodeTree] = List(Leaf(a,3))
}