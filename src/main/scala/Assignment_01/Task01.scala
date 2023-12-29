package Assignment_01
import scala.util.Random

object Task01 {
  // Function to check if a number is prime
  def isPrime(Number: Int): Boolean = {
    def loop(divisor: Int): Boolean = {
      if (divisor * divisor > Number) {
        true
      } else if (Number % divisor == 0) {
        false
      } else {
        loop(divisor + 1)
      }
    }

    // Handling special cases: numbers less than or equal to 1
    if (Number <= 1) {
      false
    } else {
      loop(2)
    }
  }

  // Main task to generate random numbers, filter prime numbers, and create a map
  def Task01(): Map[Int, Int] = {
    val random = new Random()

    // Generate a list of 15 random integers between 50 and 500
    val randomIntList = List.fill(15)(random.nextInt(451) + 50)

    // Filter the list to find prime numbers
    val primeNumbers = randomIntList.filter(isPrime)

    // Create a map where each key represents the element location (index) of the number
    val primeNumberMap = primeNumbers.zipWithIndex.toMap

    primeNumberMap
  }

  def main(args: Array[String]): Unit = {
    // Execute the main task to generate prime numbers and create a map
    val primeNumberMap = Task01()

    // Print the filtered prime numbers and their element locations
    primeNumberMap.foreach { case (primeNumber, location) =>
      println(s"Prime Number: $primeNumber at location $location")
    }
  }
}
