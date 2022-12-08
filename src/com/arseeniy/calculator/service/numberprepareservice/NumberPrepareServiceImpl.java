package com.arseeniy.calculator.service.numberprepareservice;

public class NumberPrepareServiceImpl implements NumberPrepareService {
    @Override
    public int getNumerator(String number) {
        return Integer.parseInt(number.substring(0, number.indexOf("/")));
    }

    @Override
    public int getDenominator(String number) {
        return Integer.parseInt(number.substring(number.indexOf("/") + 1, number.length()));
    }

    @Override
    public int getLeastCommonMultiple(int firstDenominator, int secondDenominator) {
        int tmpMultiplier = 1;
        int firstMultiplier = 1;
        int secondMultiplier = 1;
        int lcm = 1; //Least Common Multiple
        for (int i = 0; i < (int) Math.max(firstDenominator, secondDenominator); i++) {
            if (((firstDenominator * tmpMultiplier) % secondDenominator) == 0) {
                lcm = firstDenominator * tmpMultiplier;
                break;
            }
            tmpMultiplier++;
        }
        return lcm;
    }
}
