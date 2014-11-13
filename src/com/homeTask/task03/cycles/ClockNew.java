package com.homeTask.task03.cycles;

public class ClockNew {
    int minute = 0;
    int  hours = 0;

    void tick() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hours++;
        }
    }
    boolean isMidnight(){
        return hours == 24;
    }
    boolean isMirrored(){
       return ((hours / 10 == minute % 10) && (minute / 10 == hours % 10));
    }

    String time(int value){
        String time = "0";
        if ((value + "").length() == 1){
            return time + (value + "");
        }
        return value + "";
    }
    void getTime(){
        System.out.println(time(hours) + ":" + time(minute));
    }
    public static void main(String[] args){
        ClockNew clock = new ClockNew();
        do {
            if (clock.isMirrored()){
                clock.getTime();
            }
            clock.tick();
        } while (!clock.isMidnight());
    }
}
