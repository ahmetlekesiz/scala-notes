// Exercise 1
// Challenge Name: Filter Positions in a List
// Problem definition: For a giv  en list with  integers, return a new list removing the elements at odd positions.
// Challenge link: https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem

def f(arr:List[Int]):List[Int] = {
  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
  arr.zipWithIndex
    .filter(p => (p._2 + 1) % 2 == 0)
    .map(f => f._1)
}

// Solution Explanation
// First, I have  got the new list (item, indexOfItem) by using zipWithIndex.
// Then, I have filtered the indexOfItem by using p._2.
// Finally, mapped the values of each item after filtering.
