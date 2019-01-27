object Main {

  def main(args: Array[String]): Unit = {

    val n = io.StdIn.readInt()

    val a =  io.Source.stdin.getLines().take(n).map(_.toInt).toList

    val r = if(a.nonEmpty) {
      var max: Int = a.head
      var sMax: Int = max

      for(i <- 1 until a.length ){
        if(max < a(i)) {
          sMax = max
          max = a(i)
        }else if(sMax < a(i)) {
          sMax = a(i)
        }
      }

      (max, sMax)
    } else {
      (Int.MaxValue, Int.MaxValue)
    }

    println(s"(max, 2nd max) = $r")
  }

}
