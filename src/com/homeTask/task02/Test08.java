package com.homeTask.task02;

import java.util.Scanner;

public class Test08 {
    static Double Area(Double d, Double c){
        return (d * c)/2; // S =(1/2)*(a*b)
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        System.out.println("Area = " + Area(a,b));
    }
}
