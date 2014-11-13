package com.sourceit.hometask.basic;

public class Class02 implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '+'
        if ((fractionNumber.getDivisor() == 0) || (fractionNumber2.getDivisor() == 0)){
            return null;
        }
        else {
            Class01 resultFractionNumber = new Class01();
            if (fractionNumber.getDivisor() == fractionNumber2.getDivisor()) {
                resultFractionNumber.setDividend(fractionNumber.getDividend() + fractionNumber2.getDividend());
                resultFractionNumber.setDivisor(fractionNumber.getDivisor());
            } else {
                resultFractionNumber.setDividend(fractionNumber.getDivisor() * fractionNumber2.getDividend()
                        + fractionNumber.getDividend() * fractionNumber2.getDivisor());
                resultFractionNumber.setDivisor(fractionNumber.getDivisor() * fractionNumber2.getDivisor());
            }
            return resultFractionNumber;
        }
    }

    @Override
    public FractionNumber sub(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '-'
        if ((fractionNumber.getDivisor() == 0) || (fractionNumber2.getDivisor() == 0)){
            return null;
        }
        else {
            Class01 resultFractionNumber = new Class01();
            if (fractionNumber.getDivisor() == fractionNumber2.getDivisor()) {
                resultFractionNumber.setDividend(fractionNumber2.getDividend() - fractionNumber.getDividend());
                resultFractionNumber.setDivisor(fractionNumber.getDivisor());
            } else {
                resultFractionNumber.setDividend(fractionNumber2.getDivisor() * fractionNumber.getDividend()
                        - fractionNumber2.getDividend() * fractionNumber.getDivisor());
                resultFractionNumber.setDivisor(fractionNumber.getDivisor() * fractionNumber2.getDivisor());
            }
            return resultFractionNumber;
        }
    }

    @Override
    public FractionNumber mul(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '*'
        if ((fractionNumber == null) || (fractionNumber2 == null)){
            return null;
        }
        Class01 resultFractionNumber = new Class01();
        resultFractionNumber.setDivisor(fractionNumber.getDivisor() * fractionNumber2.getDivisor());
        resultFractionNumber.setDividend(fractionNumber.getDividend() * fractionNumber2.getDividend());
        return resultFractionNumber;
    }

    @Override
    public FractionNumber div(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '/'
        Class01 resultFractionNumber = new Class01();
        if ((fractionNumber.getDivisor() == 0) || (fractionNumber2.getDivisor() == 0)){
            return null;
        }
        else {
//            ((fractionNumber.getDivisor() != 0) || (fractionNumber2.getDivisor() != 0))
            resultFractionNumber.setDividend(fractionNumber2.getDivisor() * fractionNumber.getDividend());
            resultFractionNumber.setDivisor(fractionNumber2.getDividend() * fractionNumber.getDivisor());
            return resultFractionNumber;
        }
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        String[] f = s.split("/");
        Class01 parseFractionNumber = new Class01();
        parseFractionNumber.setDividend(Integer.parseInt(f[0]));
        parseFractionNumber.setDivisor(Integer.parseInt(f[1]));
        return parseFractionNumber;
    }
}
