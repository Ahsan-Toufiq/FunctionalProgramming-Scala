package Assignment_01

object Task03 {
  // Function to perform element-wise addition of two arrays of doubles
  def ElementWiseSum(arr1: Array[Double], arr2: Array[Double]): Array[Double] = {
    // Check if the arrays have the same length
    if (arr1.length != arr2.length) {
      throw new IllegalArgumentException("Input arrays must have the same length")
    }

    // Use zipWithIndex to iterate through the arrays with their indices
    val result = arr1.zipWithIndex.map { case (elem1, index) =>
      elem1 + arr2(index)
    }

    result
  }

  def main(args: Array[String]): Unit = {
    // Example arrays for testing
    val array1 = Array(1.0, 2.0, 3.0)
    val array2 = Array(4.0, 5.0, 6.0)

    // Perform element-wise addition and print the result
    val sumArray = ElementWiseSum(array1, array2)
    println("Element-wise Sum:")
    println(sumArray.mkString(", ")) // Output: 5.0, 7.0, 9.0
  }
}
