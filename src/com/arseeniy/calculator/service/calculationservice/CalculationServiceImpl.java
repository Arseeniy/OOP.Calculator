package com.arseeniy.calculator.service.calculationservice;

import com.arseeniy.calculator.service.numberprepareservice.NumberPrepareServiceImpl;

public class CalculationServiceImpl implements CalculationService {

    private NumberPrepareServiceImpl numberPrepareService = new NumberPrepareServiceImpl();

    @Override
    public String numberSimplification(String number) {

        int numerator = numberPrepareService.getNumerator(number);
        int denominator = numberPrepareService.getDenominator(number);
        int generalDenominator = 1;
        int tmpNumber = 1;
        for (int i = 0; i < (int) Math.min(numerator, denominator); i++) {
            if ((numerator % tmpNumber) == 0 && (denominator % tmpNumber) == 0) {
                generalDenominator = tmpNumber;
            }
            tmpNumber++;
        }
        return numerator / generalDenominator + "/"
                + denominator / generalDenominator;
    }

    @Override
    public String numberAddition(String firstNumber, String secondNumber) {

        int firstNumerator = numberPrepareService.getNumerator(firstNumber);
        int firstDenominator = numberPrepareService.getDenominator(firstNumber);
        int secondNumerator = numberPrepareService.getNumerator(secondNumber);
        int secondDenominator = numberPrepareService.getDenominator(secondNumber);
        int lcm = numberPrepareService.getLeastCommonMultiple(firstDenominator, secondDenominator);
        int firstMultiplier = lcm / firstDenominator;
        int secondMultiplier = lcm / secondDenominator;
        int resultNumerator = firstNumerator * firstMultiplier + secondNumerator * secondMultiplier;

        return resultNumerator + "/" + lcm;
    }

    @Override
    public String numberSubtraction(String firstNumber, String secondNumber) {

        int firstNumerator = numberPrepareService.getNumerator(firstNumber);
        int firstDenominator = numberPrepareService.getDenominator(firstNumber);
        int secondNumerator = numberPrepareService.getNumerator(secondNumber);
        int secondDenominator = numberPrepareService.getDenominator(secondNumber);
        int lcm = numberPrepareService.getLeastCommonMultiple(firstDenominator, secondDenominator);
        int firstMultiplier = lcm / firstDenominator;
        int secondMultiplier = lcm / secondDenominator;
        int resultNumerator = firstNumerator * firstMultiplier - secondNumerator * secondMultiplier;

        return resultNumerator + "/" + lcm;
    }

    @Override
    public String numberMultiplication(String firstNumber, String secondNumber) {

        int firstNumerator = numberPrepareService.getNumerator(firstNumber);
        int firstDenominator = numberPrepareService.getDenominator(firstNumber);
        int secondNumerator = numberPrepareService.getNumerator(secondNumber);
        int secondDenominator = numberPrepareService.getDenominator(secondNumber);
        int resultNumerator = firstNumerator * secondNumerator;
        int resultDenominator = firstDenominator * secondDenominator;

        return resultNumerator + "/" + resultDenominator;
    }

    @Override
    public String numberDivision(String firstNumber, String secondNumber) {
        int firstNumerator = numberPrepareService.getNumerator(firstNumber);
        int firstDenominator = numberPrepareService.getDenominator(firstNumber);
        int secondNumerator = numberPrepareService.getNumerator(secondNumber);
        int secondDenominator = numberPrepareService.getDenominator(secondNumber);
        int resultNumerator = firstNumerator * secondDenominator;
        int resultDenominator = firstDenominator * secondNumerator;

        return resultNumerator + "/" + resultDenominator;
    }
}
