package com.homeTask.task03.recursion;

import java.util.Scanner;

public class Test01 {
    static int sum (int n){
        if (n == 1) return 1;
        else return sum(n - 1) + n;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Summ = " + sum(n) + " number = " + n);
    }
}
