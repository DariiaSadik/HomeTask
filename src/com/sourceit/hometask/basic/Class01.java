package com.sourceit.hometask.basic;

public class Class01 implements FractionNumber{
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
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double doubleValue() {
        return (double) dividend/ (double) divisor;
    }

    public String toString(){
        return dividend + "/" + divisor;
    }
    @Override
    public int compareTo(FractionNumber o) {
        return (int)(o.doubleValue()); // !!!!!!!!!!!!
    }
    public static void main (String[] args){

        Class01 a = new Class01();
        Class01 b = new Class01();
        a.setDividend(1);
        a.setDivisor(2);

        b.setDividend(1);
        b.setDivisor(4);


        System.out.println(a.doubleValue() + " " + b.doubleValue());
    }
}