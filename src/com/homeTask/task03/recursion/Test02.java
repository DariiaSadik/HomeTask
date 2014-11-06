package com.homeTask.task03.recursion;

public class Test02 {
    static int c;
    static int fibonacci(int n){
        if (n == 0)
            return 1;
        else
            if (n == 1)
                return 1;
            else
            if (n == 4){
                c++;
            }
                return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args){
        System.out.println(fibonacci(15) + " is number of Fibonacci " + Test02.c);
    }
}
