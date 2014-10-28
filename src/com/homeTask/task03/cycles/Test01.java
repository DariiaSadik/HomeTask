package com.homeTask.task03.cycles;
import java.util.*;

public class Test01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("Str =" + str + " Total = " + sum);
    }
}
