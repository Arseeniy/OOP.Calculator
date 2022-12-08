package com.arseeniy.calculator.service.numberprepareservice;

public interface NumberPrepareService {

    public int getNumerator(String number);

    public int getDenominator(String number);

    public int getLeastCommonMultiple(int firstDenominator, int secondDenominator);
}
