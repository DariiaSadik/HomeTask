package com.homeTask.task03.cycles;

public class Tickets {
    public static void main (String[] args) {
        int i = 0;
        int y = 0;
        String result;
        int firstHalf;
        int secondHalf;
        while (i < 1000000){
            result = "";
            int index = 6 - (i + "").length(); // длина i если i = 999 то index будет равен 3
            for (int j = index; j > 0; j--){
                result += "0"; // забиваем 0
            }
            result += i; // + i
            firstHalf = result.charAt(0) + result.charAt(1) + result.charAt(2);
            secondHalf = result.charAt(3) + result.charAt(4) + result.charAt(5);

            if (firstHalf == secondHalf){
                y++;
                System.out.println("Счастливый № = " + result); // числа
            }
            i++;
        }
        System.out.println("Количество = " + y); // количество чисел
    }
}
