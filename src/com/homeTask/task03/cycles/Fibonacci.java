package com.homeTask.task03.cycles;

public class Fibonacci {
    public static void main (String[] args){
        int begin = 1;
        int end = 1;
        int result;
        System.out.println(begin + " index = " + 1); // *
        System.out.println(begin + " index = " + 2); // *
        for (int i = 0; i < 9; i++) {
            result = begin + end;
            System.out.println(result + " index = " + (i + 3));
            begin = end;
            end = result;
        }
    }
}
