package com.sourceit.hometask.basic;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        FractionNumbers[] mass = new FractionNumbers[10];
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            FractionNumbers class01 = new FractionNumbers();
            class01.setDivisor(r.nextInt(20));
            class01.setDividend(r.nextInt(20));
            mass[i] = class01;
        }

        System.out.println(Arrays.toString(mass));
        System.out.println("__________________________________");
        FractionNumbers[] sortMass = new FractionNumbers[mass.length];
        System.arraycopy(mass, 0, sortMass, 0, mass.length);
        Arrays.sort(sortMass);
        System.out.println(Arrays.toString(sortMass));


        FractionOperation test = new FractionOperation();
        FractionNumbers a = new FractionNumbers();
        FractionNumbers b = new FractionNumbers();

        a.setDividend(10);
        a.setDivisor(2);

        b.setDividend(5);
        b.setDivisor(0);

        test.add(a, b);
        test.div(a, b);
        test.mul(a, b);
        test.sub(a, b);
        System.out.println(a.toString() + " = " + a.doubleValue() + " " + b.toString() + " = " + b.doubleValue());
        System.out.println(a.toString() + " + " + b.toString() + " = " + test.add(a, b));
        System.out.println(a.toString() + " / " + b.toString() + " = " + " " + test.div(a, b));
        System.out.println(a.toString() + " * " + b.toString() + " = "+ " " + test.mul(a, b));
        System.out.println(a.toString() + " - " + b.toString() + " = "+ " " + test.sub(a, b));
        System.out.println(test.parseFractionNumber("2455555"));
    }
}
