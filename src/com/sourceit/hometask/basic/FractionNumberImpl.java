package com.sourceit.hometask.basic;

public class FractionNumberImpl implements FractionNumber{
    private int divisor;
    private int dividend;

//    public Class01(int dividend, int divisor) {
//        this.dividend = dividend;
//        this.divisor = divisor;
//    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) {
        if (divisor != 0){
            this.divisor = divisor;
        }
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double doubleValue() {
        return (double) dividend/ (double) divisor;
    }

    @Override
    public String toString() {
        return divisor + "/" + dividend;
    }

    @Override
    public int compareTo(FractionNumber o) {
        return Double.valueOf(this.doubleValue()).compareTo(Double.valueOf(o.doubleValue()));
    }
}