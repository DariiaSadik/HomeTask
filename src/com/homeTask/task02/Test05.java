package com.homeTask.task02;
import java.util.*;

public class Test05 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a= (int) (Math.random()*(2*n+1)) - n;
        System.out.println("Случайное число из отрезка " + (n * (-1)) + "," + n + " равно " + a);
    }
}
