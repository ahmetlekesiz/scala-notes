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
