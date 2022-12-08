package com.arseeniy.calculator.service.demoservice;

import com.arseeniy.calculator.numbers.Numbers;
import com.arseeniy.calculator.service.calculationservice.CalculationServiceImpl;

public class DemoServiceImpl implements DemoService {
    private Numbers numbers = new Numbers();
    private CalculationServiceImpl calculationService = new CalculationServiceImpl();

    @Override
    public void startTest() {
        numbers.setFirstNumber("34/26");
        numbers.setSecondNumber("12/20");
        System.out.println(calculationService.numberSimplification(numbers.getFirstNumber()));
        System.out.println(calculationService.numberAddition(numbers.getFirstNumber(), numbers.getSecondNumber()));
    }
}
