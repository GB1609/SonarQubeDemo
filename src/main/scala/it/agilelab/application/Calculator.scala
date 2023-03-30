package it.agilelab.application

object Calculator {

  /**
   * Given a total, calculate percentage of a partial amount
   *
   * @param total         total input number
   * @param partialAmount partial amount number
   * @return
   */
  def calculate_percentage(total: Int, partialAmount: Int): Int = (partialAmount * 100) / total

  /**
   * Simulate sum
   *
   * @param x input number
   * @param y input number
   * @return
   */
  def sum(x: Int, y: Int): Int = x + y

  /**
   * Simulate difference
   *
   * @param x input number
   * @param y input number
   * @return
   */
  def diff(x: Int, y: Int): Int = x - y

  /**
   * Simulate multiplication
   *
   * @param x input number
   * @param y input number
   * @return
   */
  def multiply(x: Int, y: Int): Int = x * y

  /**
   * Simulate div
   *
   * @param x input number
   * @param y input number
   * @return result if y>0, otherwise raise an exception
   * */
  def divide(x: Int, y: Int): Double = if (y > 0) {x / y}
  else {
    throw new ArithmeticException("No possible to divide")
  }

  def main(args: Array[String]): Unit = {

    val argsToNumber = args.map(_.toInt) //50 10 500 470

    val firstNumber = argsToNumber(0) //50
    val secondNumber = argsToNumber(1) //10
    val total = argsToNumber(2) //500
    val partial_amount = argsToNumber(3) //470

    //scalastyle:off printChecker
    println(sum(firstNumber, secondNumber))
    println(diff(firstNumber, secondNumber))
    println(multiply(firstNumber, secondNumber))
    println(divide(firstNumber, secondNumber))
    println(calculate_percentage(total, partial_amount))

  }
}
