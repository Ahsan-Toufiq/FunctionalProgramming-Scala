package Assignment_01

object Task05 {
  def buildMap[A, B](data: Seq[A], f: A => B): Map[B, A] = {
    val mapEntries = data.map(value => f(value) -> value)
    mapEntries.toMap
  }

  def main(args: Array[String]): Unit = {
    val lst = Array(1, 2, 3, 4, 5)

    // Define a function that checks if an integer is even
    def func(x: Int): Boolean = x % 2 == 0

    val result = buildMap(lst, func)
    println(s"Result: $result")
  }
}
