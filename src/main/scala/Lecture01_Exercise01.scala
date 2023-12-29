object Lecture01_Exercise01 {

  // Recursive function to calculate the Fibonacci number at position n
  def fibonacci(n: Int): Int = {

    // Helper function "loop" to calculate Fibonacci recursively
    def loop(n: Int, acc: Int): Int = {
      if (n <= 1) {
        1 // Base case: Fibonacci of 0 and 1 is 1
      } else {
        // Recursively calculate Fibonacci by summing two previous Fibonacci numbers
        loop(n - 2, acc) + loop(n - 1, acc)
      }
    }

    // Start the recursion with n and an initial accumulator of 1
    loop(n, 1)
  }

  def main(args: Array[String]) = {
    // Calculate and print Fibonacci numbers from 0 to 9
    for (i <- 0 to 9) {
      println(fibonacci(i))
    }
  }
}
