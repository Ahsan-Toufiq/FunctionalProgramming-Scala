package Assignment_01

import scala.util.Random

object Task04 {
  // Technique 1: Recursive function to count even values
  def CountEvenRecursive(arr: Array[Int]): Int = {
    def loop(index: Int, count: Int): Int = {
      if (index >= arr.length) {
        count
      } else {
        if (arr(index) % 2 == 0) {
          loop(index + 1, count + 1)
        } else {
          loop(index + 1, count)
        }
      }
    }

    loop(0, 0)
  }

  // Technique 2: Using the count higher-order method
  def CountEvenWithCount(arr: Array[Int]): Int = {
    arr.count(x => x % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    // Create an array of 100 random integers between 0 and 99
    val randomArray = Array.fill(100)(Random.nextInt(100))

    // Count even values using both techniques
    val countRecursive = CountEvenRecursive(randomArray)
    val countWithCount = CountEvenWithCount(randomArray)

    // Print the results
    println("Even Value Count (Recursive): " + countRecursive)
    println("Even Value Count (count method): " + countWithCount)
  }
}
