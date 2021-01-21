import scala.collection.LinearSeqOptimized
// Reduction of Lists

// How to sum elements of list?
// it will be sum(List(1,2,3,4,...)) = 1 + 2 + 3 + ...

val exampleList = List(1,2,3,4,5)

def sum(xs : List[Int]): Int = {
  xs match {
    case Nil => 0
    case y :: ys => y + sum(ys)
  }
}

print(sum(exampleList))
// 15

// Shorter version of writing match expression
def sumShorter(xs: List[Int]): Int = (0 :: xs) reduceLeft(_ + _)

print(sumShorter(exampleList))
// 15

/*
// Here you can see the implementation of reduceLeft in Scala
  def reduceLeft(op: Function2[_, _, _]): Any = if (this.isEmpty) {
    throw new UnsupportedOperationException("empty.reduceLeft")
  }
  else {
    return this.tail.asInstanceOf[LinearSeqOptimized].foldLeft(this.head, op)
  }
*/

// sumShorter by Foldleft
def sumShorterFoldLeft(xs: List[Int]): Int = (xs foldLeft 0)(_ + _)

print(sumShorterFoldLeft(exampleList))
// 15