//Maximum of an array of n elements
object Main {

  def main(args: Array[String]): Unit = {

    val n = io.StdIn.readInt()

    val a = io.Source.stdin.getLines().take(n).map(_.toInt).toList

    val r = if (a.nonEmpty) {
      var max: Int = a.head
      for (i <- 1 until a.length) {
        if (max < a(i)) {
          max = a(i)
        }
      }
      max
    } else {
      Int.MaxValue
    }

    println(s"maximum = $r")
  }
}
