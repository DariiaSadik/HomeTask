package com.homeTask.task03.cycles;
// isMidnight
// isMirrored -> str.charAt(i);
public class Clock {
    String minute = "00";
    String  hours = "00";
    int count = 0; // количество isMirrored()

    // минуты ++
    void tick() {
        if (Integer.parseInt(minute) < 10) {
            minute = (Integer.parseInt(minute) + 1) + "";
            minute = Half(minute);
        } else {
            minute = (Integer.parseInt(minute) + 1) + "";
        }
        if (Integer.parseInt(minute) == 60){
            minute = "00";
            hours();
        }
        printAll();
    }
    // часы ++
    void hours(){
        if (Integer.parseInt(hours) < 10){
            hours = (Integer.parseInt(hours) + 1) + "";
            hours = Half(hours);
        }
        else {
            hours = (Integer.parseInt(hours) + 1) + "";
            isMidnight();
        }
    }
    // сутки
    void isMidnight(){
        if (Integer.parseInt(hours) == 24){
            hours = "00";
            minute = "00";
        }
    }
    // минуты или часы
    String Half (String str){
        String firstHalf = "";
        int index = 2 - (str.length());
        for (int i = index; i > 0; i--){
            firstHalf += "0";
        }
        return firstHalf + str;
    }
    boolean isMirrored(){
        return ((Integer.parseInt(hours) / 10 == Integer.parseInt(minute) % 10) &&
                (Integer.parseInt(minute) / 10 == Integer.parseInt(hours) % 10));
    }
    void printAll(){
        if (isMirrored()) {
            count++;
            System.out.println(hours + ":" + minute + "  -  " + count);
        }
    }
    public static void main(String[] args){
        System.out.println(" Time " + "  index");
        Clock clock = new Clock();
        for (int i = 0; i < 2000; i++) {
            clock.tick();
        }
    }
}
