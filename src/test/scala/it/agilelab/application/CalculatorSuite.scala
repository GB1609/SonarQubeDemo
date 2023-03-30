package it.agilelab.application

import org.scalatest.{FlatSpec, GivenWhenThen, Matchers}


class CalculatorSuite extends FlatSpec with GivenWhenThen with Matchers {

  it should "test sum method" in {
    val x = 10
    val y = 23

    Calculator.sum(x, y) shouldBe 33
  }

  it should "test diff method" in {

    val x = 10
    val y = 5

    Calculator.diff(x, y) shouldBe 5

  }

  it should "test divide method" in {

    val x = 10
    val y = 5

    Calculator.divide(x, y) shouldBe 2

  }

  //  it should "test divide method exception" in {
  //
  //    Given("0 as denominator")
  //    val x = 10
  //    val y = 0
  //
  //    When("divide method is called")
  //
  //
  //    Then("an exception must be raised")
  //    an[ArithmeticException] shouldBe thrownBy(Calculator.divide(x, y))
  //
  //  }

  it should "test multipy method" in {

    val x = 10
    val y = 5

    Calculator.multiply(x, y) shouldBe 50

  }

  it should "test percentage method" in {

    Given("A total")
    val total = 200
    val partialAmount = 100

    When("Calculate percentage is called")
    Then("the correct result is retrieved")

    Calculator.calculate_percentage(total, partialAmount) shouldBe 50

    //scalastyle:off magic.number
    Calculator.calculate_percentage(500, 470) shouldBe 94

  }

}
