package Assignment_01

object Task02 {
  // Function to generate a List[Char] starting from a given ASCII value
  def CharArray(start: Int): List[Char] = {
    def loop(currentChar: Char, result: List[Char]): List[Char] = {
      if (currentChar > 'z') {
        result.reverse // Reverse the result to maintain the correct order
      } else {
        // Recursive call to generate the next character and add it to the result
        loop((currentChar.toInt + 1).toChar, currentChar :: result)
      }
    }

    // Start the recursion with the given ASCII value converted to Char and an empty result list
    loop(start.toChar, Nil)
  }

  def main(args: Array[String]): Unit = {
    val random = new scala.util.Random
    val testValues = List(random.nextInt(26) + 97, random.nextInt(26) + 97, random.nextInt(26) + 97)

    println("Testing CharArray function:")
    testValues.foreach { startValue =>
      val charList = CharArray(startValue)
      val startChar = startValue.toChar
      // Print the start character and the resulting list of characters
      println(s"Start Char: $startChar, Result: ${charList.mkString("")}")
    }
  }
}
