package com.sourceit.hometask.basic;

public class Class02 implements FractionNumberOperation {
//    private int fractionNumber;
//    private int fractionNumber2;


    @Override
    public FractionNumber add(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '+'
        if ((fractionNumber == null) || (fractionNumber2 == null)){
            return null;
        }
        else {
            Class01 resultFractionNumber = new Class01();
            resultFractionNumber.setDividend(fractionNumber.getDivisor() * fractionNumber2.getDividend()
                    + fractionNumber.getDividend() * fractionNumber2.getDivisor());
            resultFractionNumber.setDivisor(fractionNumber.getDivisor() * fractionNumber2.getDivisor());

            return resultFractionNumber;
        }
    }

    @Override
    public FractionNumber sub(FractionNumber fractionNumber, FractionNumber fractionNumber2) { // '-'
        if ((fractionNumber == null) || (fractionNumber2 == null)){
            return null;
        }
        Class01 resultFractionNumber = new Class01();
        resultFractionNumber.setDividend(fractionNumber.getDivisor() * fractionNumber.getDividend()
                - fractionNumber2.getDividend() * fractionNumber2.getDivisor());
        resultFractionNumber.setDivisor(fractionNumber.getDivisor() * fractionNumber2.getDivisor());

        return resultFractionNumber;
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
        if ((fractionNumber == null) || (fractionNumber2 == null)){
            return null;
        }
//        Class01 resultFractionNumber = new Class01();
//        resultFractionNumber.setDividend();
        return null;
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        String[] f = s.split("/");
        Class01 parseFractionNumber = new Class01();
        parseFractionNumber.setDividend(Integer.parseInt(f[0]));
        parseFractionNumber.setDivisor(Integer.parseInt(f[1]));
        return parseFractionNumber;
    }

    public static void main (String[] args){
        Class02 test = new Class02();
        Class01 a = new Class01();
        Class01 b = new Class01();
        a.setDividend(1);
        a.setDivisor(2);

        b.setDividend(1);
        b.setDivisor(4);

        test.add(a, b);
        test.div(a, b);
        test.mul(a, b);
        test.sub(a, b);
        System.out.println(test.add(a, b) + " " + test.div(a, b) + " " + test.mul(a, b) + " " + test.sub(a, b));
    }
}
