package com.homeTask.task02;

public class Test07 {
    public static void main (String[] args) {
        int num = (int)(Math.random() * 150 + 1) + 5;
        System.out.println("rand num = " + num);
        if (num <= 25 || num >= 100) {
            System.out.println("out (25;100) num = " + num);
        } else
            System.out.println("in (25;100) num = " + num);
    }
}
