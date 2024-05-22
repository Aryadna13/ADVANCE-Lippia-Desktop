package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;
import io.cucumber.java.en.*;

public class CalculatorSteps extends PageSteps {

    @When("Seven Plus Eight")
    public void plus() {
        CalculatorService.plus();
    }

    @Then("Result is Fifteen")
    public void result() {
        CalculatorService.plusResult();
    }

    @When("Five Subtract two")
    public void fiveSubtractTwo() {
        CalculatorService.subtract();
    }

    @Then("Result is Three")
    public void resultIsThree() {
        CalculatorService.subtractResult();
    }

    @When("Nine multiply Six")
    public void nineMultiplySix() {
        CalculatorService.multiply();
    }

    @Then("Result is Fifty-four")
    public void resultIsFiftyFour() {
        CalculatorService.multiplyResult();
    }

    @When("Fifteen division Three")
    public void fifteenDivisionThree() {
        CalculatorService.division();
    }

    @Then("Result is Five")
    public void resultIsFive() {
        CalculatorService.divisionResult();
    }
}
