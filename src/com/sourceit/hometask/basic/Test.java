package com.sourceit.hometask.basic;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Class01[] mass = new Class01[10];
        Random r = new Random();
        for (Class01 class01 : mass){
            class01 = new Class01();
            class01.setDivisor(r.nextInt(20));
            class01.setDividend(r.nextInt(20));
        }

        System.out.println(mass);
        System.out.println("__________________________________");

//        Class02 test = new Class02();
//        Class01 a = new Class01();
//        Class01 b = new Class01();
//
//        a.setDividend(10);
//        a.setDivisor(2);
//
//        b.setDividend(5);
//        b.setDivisor(0);
//
//        test.add(a, b);
//        test.div(a, b);
//        test.mul(a, b);
//        test.sub(a, b);
//        System.out.println(a.toString() + " = " + a.doubleValue() + " " + b.toString() + " = " + b.doubleValue());
//        System.out.println(a.toString() + " + " + b.toString() + " = " + test.add(a, b));
//        System.out.println(a.toString() + " / " + b.toString() + " = " + " " + test.div(a, b));
//        System.out.println(a.toString() + " * " + b.toString() + " = "+ " " + test.mul(a, b));
//        System.out.println(a.toString() + " - " + b.toString() + " = "+ " " + test.sub(a, b));
//        System.out.println(test.parseFractionNumber("1/2"));
    }
}
