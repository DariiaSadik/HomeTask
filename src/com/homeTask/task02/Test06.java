package com.homeTask.task02;
import java.util.*;

public class Test06 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Double m = scanner.nextDouble();
        Double n = scanner.nextDouble();
        int a = 10;
        Double b = Math.abs(a-m); // разница по модулю между 10 и числом m.
        Double c = Math.abs(a-n); // -*-*- 10 и числом n
        // если разница менше - длиже к 10
        if (b < c) {
            System.out.println(m);
        } else if(b > c){
            System.out.println(n);
        } else {
            System.out.println("Equals");
        }

    }
}
