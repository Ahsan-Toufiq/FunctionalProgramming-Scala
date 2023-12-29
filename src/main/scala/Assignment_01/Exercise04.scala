package Assignment_01

object HigherOrderMethods {
  // Example of using the 'map' higher-order method
  def mapExample(): Array[Int] = {
    // Create an array of numbers from 1 to 5
    val numbers = Array.tabulate(5)(_ + 1)

    // Use 'map' to double each number in the array
    numbers.map(x => x * 2)
  }

  // Example of using the 'filter' higher-order method
  def filterExample(): Array[Int] = {
    // Create an array of numbers from 1 to 5
    val numbers = Array.tabulate(5)(_ + 1)

    // Use 'filter' to select only the even numbers from the array
    numbers.filter(x => x % 2 == 0)
  }

  // Example of using the 'exists' and 'forall' higher-order methods
  def existsAndForallExample(): (Boolean, Boolean) = {
    // Create an array of numbers from 1 to 5
    val numbers = Array.tabulate(5)(_ + 1)

    // Use 'exists' to check if any even number exists in the array
    val anyEven = numbers.exists(x => x % 2 == 0)

    // Use 'forall' to check if all numbers in the array are even
    val allEven = numbers.forall(x => x % 2 == 0)

    // Return a tuple containing the results of 'exists' and 'forall'
    (anyEven, allEven)
  }

  def main(args: Array[String]): Unit = {
    // Call the example functions and store their results
    val doubledNumbers = mapExample()
    val evenNumbers = filterExample()
    val (anyEven, allEven) = existsAndForallExample()

    // Print the results of each example
    println(s"mapExample: Doubled numbers = ${doubledNumbers.mkString(", ")}")
    println(s"filterExample: Even numbers = ${evenNumbers.mkString(", ")}")
    println(s"existsAndForallExample: Any even number? $anyEven, All even numbers? $allEven")
  }
}
