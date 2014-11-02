package com.homeTask.task03.arrays;

public class Test02 {
    int[][] arr;
    int segment (int a, int b){
        return (int)(Math.random() * (b - a + 1)) + a; // Math.random()*11-5
    }
    void array (int begin, int end, int a, int b){
        int[][] array = new int[begin][end];
        for (int i = 0; i < begin; i++){
            for (int j = 0; j < end; j++){
                array[i][j] = segment(a, b);
            }
            arr = array;
        }
        max(arr);
        printAll(arr);
    }
    void max(int arr[][]){
        int sum = 1;
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++) {
                sum *= Math.abs(arr[i][j]);
            }
            if (sum > max){
                max = sum;
                index = i;
                sum = 1;
            }
            else sum = 1;
        }
        System.out.println("Max = " + max + " index = " + index);
    }
    void printAll(int arr[][]){
        for (int[] arr1 : arr){
            for (int arr2 : arr1){
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Test02 array = new Test02();
        array.array(7, 4, -5, 5);
    }
}
