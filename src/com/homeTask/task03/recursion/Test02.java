package com.homeTask.task03.recursion;

public class Test02 {
    static int fibonacci(int n){
        if (n == 0)
            return 1;
        else
            if (n == 1)
                return 1;
            else
                return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int four(int n){
        if (n > 4) return fibonacci(n)/fibonacci(4);
        else return 0;
    }
    public static void main(String[] args){
        System.out.println(fibonacci(15) + " is number of Fibonacci");
        System.out.println(four(15) + " raz");
    }
}
