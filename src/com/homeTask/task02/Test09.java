package com.homeTask.task02;
//import java.util.*;

public class Test09 {
    static int Max (int a, int b, int c){
        int max;
        if (a > b) {
            max = a;
        } else if (b > c){
            max = b;
        } else {
            max = c;
        }
        return max;
    }
    public static void main (String[] args){
       // Random rand = new Random();
        int num = (int )(Math.random() * 899 + 100);
        //int num = rand.netxInt(899)+100;
        System.out.println("Num = " + num);
        int a = num%10;
        int b = (num/10)%10;
        int c = (num/100)%10;
        System.out.println("a = " + a + " b = " + b + " c = " + c + "\n");
        System.out.println("MAX = " + Max(a, b, c));
    }
}
