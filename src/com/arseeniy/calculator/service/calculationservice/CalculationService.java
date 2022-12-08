package com.arseeniy.calculator.service.calculationservice;

public interface CalculationService {
    public String numberSimplification(String number);
    public String numberAddition(String firstNumber, String secondNumber);
    public String numberSubtraction(String firstNumber, String secondNumber);
    public String numberMultiplication(String firstNumber, String secondNumber);
    public String numberDivision(String firstNumber, String secondNumber);
}
