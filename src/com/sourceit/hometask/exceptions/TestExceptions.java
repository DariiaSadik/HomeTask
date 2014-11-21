package com.sourceit.hometask.exceptions;

import java.util.Arrays;

public class TestExceptions {
    public static void main(String[] args) {
        StringUtilsImplements findNumbers = new StringUtilsImplements();
        System.out.print("method findNumbers -> ");
        String str = "12.3 56.7 ff 7.8 sss 8.0";
        try {
            System.out.println("'" + str + "'" + " result: "
                    + Arrays.toString(findNumbers.findNumbers(str)));
        }catch(CustomException cExcep){
            System.out.println("Not double value was found in the text");
            cExcep.printStackTrace();
        }
        System.out.print("method div -> ");
        StringUtilsImplements div = new StringUtilsImplements();
        try{
            System.out.println("2 / 3 = " + div.div("y", "f"));
        }catch (NullPointerException nullPExcep){
            System.out.println ("number 1 and number 2 are equal null!");
            nullPExcep.printStackTrace();
        }catch (NumberFormatException numberFExcep){
            System.out.println ("number 1 and number 2 are not numbers!");
            numberFExcep.printStackTrace();
        }catch(ArithmeticException arithExcep){
            System.out.println("number 2 is equal null");
            arithExcep.printStackTrace();
        }
        System.out.print("method findWord -> ");
        StringUtilsImplements findWord = new StringUtilsImplements();
        System.out.println("text: 'd4d' and word: 'd' result: "
                + Arrays.toString(findWord.findWord("d4d", "d")));
    }
}
