package com.homeTask.task02;

public class Test11 {
    public static void main (String[] args){
        byte age = 21;    //00010101
        int height = 165;//10100101
        byte weight = 2;  //00000010                         // :)))

        int conteiner = (age) | (height << 8) | (weight << 16);
        System.out.println(conteiner);
    }
}
