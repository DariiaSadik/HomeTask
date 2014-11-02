package com.homeTask.task03.arrays;

public class Test01 {
    static int rand(int begin, int end){
        return (int)(Math.random() * (end - begin + 1)) + begin;
    }
    public static void main (String[] args){
    int arr[][] = new int[8][5];
        for (int i =0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                arr[i][j] = rand(10, 99);//(int)(Math.random() * 90) + 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

