package com.homeTask.task02;
import java.util.*;

public class Test04 {
    static int Sum(String d){
        int sum = 0;
        System.out.println("length = " + (d.length()));
        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) != '.') { // (d.charAt(i) != '.') || (d.charAt(i) != ',')   :((((
                sum += Character.getNumericValue(d.charAt(i));
            //} else continue;
            }
        }
        return sum;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        System.out.println("num = " + num);
        System.out.println("Sum = " + Sum(num));
    }
}
