package it.agilelab.application

import it.agilelab.application.Calculator._

object ResultsPrinter {

  def printResults(argsToNumber: Array[Int]): String = {

    val firstNumber = argsToNumber(0) //50
    val secondNumber = argsToNumber(1) //10
    val total = argsToNumber(2) //500
    val partial_amount = argsToNumber(3) //470

    val toReturn =
      s"""|
          |SUM: ${sum(firstNumber, secondNumber)}
          |DIFF: ${diff(firstNumber, secondNumber)}
          |MULTIPLICATION: ${multiply(firstNumber, secondNumber)}
          |DIVISION: ${divide(firstNumber, secondNumber)}
          |PERCENTAGE: ${calculate_percentage(total, partial_amount)}
          |""".stripMargin
    toReturn
  }

}
