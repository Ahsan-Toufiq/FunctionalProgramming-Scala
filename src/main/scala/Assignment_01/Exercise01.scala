package Assignment_01

// Array Creation Methods
object CreateArray {

  // Method 1: Using Array.tabulate
  def method1(n: Int) = {
    // Creating an array using Array.tabulate
    val a = Array.tabulate(n)(i => i * 2)
    a // Returning the created array
  }

  // Method 2: Using a tail-recursive function
  def method2(n: Int): Array[Int] = {
    // Defining a tail-recursive helper function "go"
    def go(n: Int, array: Array[Int]): Array[Int] = {
      if (n == 0) {
        array // Base case: Return the accumulator array
      } else {
        // Calculate the next element and prepend it to the accumulator array
        val acc1 = ((n - 1) * 2) +: array
        // Recursively call "go" with a decremented n and updated accumulator
        go(n - 1, acc1)
      }
    }
    // Start the recursion with an empty array and return the result
    go(n, Array.empty[Int])
  }

  // Main function
  def main(args: Array[String]) = {
    // Printing the results of both methods
    println(s"Array from method 01 = ${"{  " + method1(6).mkString("   ")}" + "  }")
    println(s"Array from method 02 = ${"{  " + method2(6).mkString("   ")}" + "  }")
  }
}
