package Assignment_01

object OptionType_Utilised {
  // Function to double an integer value, wrapped in an Option
  def DoubleInput(value: Option[Int]): Int = {
    value match {
      case Some(v) =>
        // Perform operations with the present value v and return an Int result
        v * 2 // Example operation, you can replace it with your logic
      case None =>
        // Return an Int result for the case where no value is provided
        0 // Example value, you can replace it with your logic
    }
  }

  def main(args: Array[String]) = {
    // Demonstrating the usage of the DoubleInput function with Option values
    println(s"No Value Provided =   ${DoubleInput(None)}")
    println(s"Value Provided    =   ${DoubleInput(Some(42))}")
  }
}
