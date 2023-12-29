package Assignment_01
import scala.collection.mutable

object mutable_DataTypes {
  // Function to create and return a mutable Set
  def mutableSet(): mutable.Set[Int] = {
    // Creating a mutable Set with initial elements
    val a = mutable.Set(1, 2, 3)
    a // Returning the created mutable Set
  }

  // Function to create and return a mutable Map
  def mutableMap(): mutable.Map[String, Int] = {
    // Creating a mutable Map with initial key-value pairs
    val b = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    b // Returning the created mutable Map
  }

  def main(args: Array[String]) = {
    // Printing the created mutable Set and mutable Map
    println(s"Mutable Set = ${mutableSet()}")
    println(s"Mutable Map = ${mutableMap()}")
  }
}
