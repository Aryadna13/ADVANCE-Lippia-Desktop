package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void subtract(){
        ActionManager.click(CalculatorConstants.FIVE);
        ActionManager.click(CalculatorConstants.SUBTRACT);
        ActionManager.click(CalculatorConstants.TWO);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void multiply(){
        ActionManager.click(CalculatorConstants.NINE);
        ActionManager.click(CalculatorConstants.MULTIPLY);
        ActionManager.click(CalculatorConstants.SIX);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void division(){
        ActionManager.click(CalculatorConstants.ONE);
        ActionManager.click(CalculatorConstants.FIVE);
        ActionManager.click(CalculatorConstants.DIVISION);
        ActionManager.click(CalculatorConstants.THREE);
        ActionManager.click(CalculatorConstants.EQUAL);
    }
    
    public static void plusResult() {
    	Assert.assertEquals(getResult(),"15");
    }
    public static void subtractResult() {
        Assert.assertEquals(getResult(),"3");
    }
    public static void multiplyResult() {
        Assert.assertEquals(getResult(),"54");
    }
    public static void divisionResult() {
        Assert.assertEquals(getResult(),"5");
    }
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }

}
