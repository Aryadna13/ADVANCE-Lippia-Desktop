@Regression @Calculator @Success
Feature: As a potential client i need to open a calculator and do math operations


  @Smoke @Plus
  Scenario: Plus operation
    When Seven Plus Eight
    Then Result is Fifteen

  @Smoke @subtract
  Scenario: Subtract operation
    When Five Subtract two
    Then Result is Three

  @Smoke @multiply
  Scenario: Multiply operation
    When Nine multiply Six
    Then Result is Fifty-four

  @Smoke @division
  Scenario: Division operation
    When Fifteen division Three
    Then Result is Five