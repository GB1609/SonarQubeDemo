package it.agilelab.application

object Calculator {

  /**
   * Given a total, calculate percentage of a partial amount
   *
   * @param total         total input number
   * @param partialAmount partial amount number
   * @return
   */
  def calculatePercentage(total: Int, partialAmount: Int): Int = (partialAmount * 100) / total

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

    //scalastyle:off printChecker
    print(ResultsPrinter.printResults(argsToNumber))

  }
}
