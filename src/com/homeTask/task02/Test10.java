package com.homeTask.task02;
import java.util.*;

public class Test10 {
    static void Equation (Double a, Double b, Double c){
        Double x1, x2;
        Double d = (b * b) - (4 * a * c);
        System.out.println("d = " + d);

        if (d < 0) {
            System.out.println("Нет решений!");
        } else if (d == 0){
            x1 = (-b)/ (2 * a);
            System.out.println("x = " + x1);
        } else {
            x1 = (-b + Math.sqrt(d))/ (2 * a);
            x2 = (-b - Math.sqrt(d))/ (2 * a);
            System.out.println("x1 = " + x1 +  " x2 = " + x2);
        }
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        Double a = scanner.nextDouble();
        System.out.println("b = ");
        Double b = scanner.nextDouble();
        System.out.println("c = ");
        Double c = scanner.nextDouble();
        Equation(a, b, c);
    }
}
