object quick extends App {
  //picks a partition elt
  //finds > < ==
  //continues until all is sorted
  def getParter(tosort: List[Int]): Int = {
    tosort.length/2
  }

  var s = List(6,5,4,1,9)

  def quick(arr: List[Int]): List[Int] = {
    if (arr.length > 1) {
      val mid = arr(getParter(arr))

      quick(arr.filter(_ < mid)) ++
      quick(arr.filter(_ == mid)) ++
      quick(arr.filter(_ > mid))
    }
    else arr
  }

  println(quick(s))
}
