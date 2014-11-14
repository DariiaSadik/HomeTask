package com.sourceit.hometask.basic;

public class FractionOperation implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '+'
        if ((fractionNumber.getDivisor() == 0) || (fractionNumber2.getDivisor() == 0)){
            return null;
        }
        else {
            FractionNumbers resultFractionNumber = new FractionNumbers();
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
            FractionNumbers resultFractionNumber = new FractionNumbers();
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
        FractionNumbers resultFractionNumber = new FractionNumbers();
        if ((fractionNumber.getDivisor() == 0) || (fractionNumber2.getDivisor() == 0)){
            return null;
        }
        else {
            resultFractionNumber.setDivisor(fractionNumber.getDivisor() * fractionNumber2.getDivisor());
            resultFractionNumber.setDividend(fractionNumber.getDividend() * fractionNumber2.getDividend());
            return resultFractionNumber;
        }
    }

    @Override
    public FractionNumber div(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '/'
        FractionNumbers resultFractionNumber = new FractionNumbers();
        if ((fractionNumber.getDivisor() == 0) || (fractionNumber2.getDivisor() == 0)){
            return null;
        }
        else {
            resultFractionNumber.setDividend(fractionNumber2.getDivisor() * fractionNumber.getDividend());
            resultFractionNumber.setDivisor(fractionNumber2.getDividend() * fractionNumber.getDivisor());
            return resultFractionNumber;
        }
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        FractionNumbers parseFractionNumber = new FractionNumbers();
        if (s.indexOf("/") == 1) {
            String[] f = s.split("/");
            parseFractionNumber.setDividend(Integer.parseInt(f[0]));
            parseFractionNumber.setDivisor(Integer.parseInt(f[1]));
        }
        else {
            parseFractionNumber.setDividend(Integer.parseInt(s));
            parseFractionNumber.setDivisor(Integer.parseInt(s));
        }
        return parseFractionNumber;
    }
}
