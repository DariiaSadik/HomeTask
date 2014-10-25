package com.homeTask.task02;
import java.util.*;

public class Test03 {
    static void Simple(int a){
        if (a%2 == 0) {
            System.out.println("Simple");
        } else {
            System.out.println("Not Simple");
        }
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Simple(n);
    }
}
