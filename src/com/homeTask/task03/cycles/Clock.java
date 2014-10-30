package com.homeTask.task03.cycles;

public class Clock {
    String hours;
    String minute;

    void tick (){
        if(Integer.parseInt(minute) >= 60){
            hours = (Integer.parseInt(hours) + 1) + "";
            minute = "00";
        }
    }
    boolean isMirrored () {
        return ((Integer.parseInt(hours) / 10 == Integer.parseInt(minute) % 10) && (Integer.parseInt(hours) % 10 == Integer.parseInt(minute) / 10));
//        if ((Integer.parseInt(hours) / 10 == Integer.parseInt(minute) % 10) && (Integer.parseInt(hours) % 10 == Integer.parseInt(minute) / 10))
//            return true;
//            else return false;
    }
    void count () {
        String h;
        String m;
        int count = 0;
        for(int i = 0; i < 24; i++){
            h = "0";
            h += i;
            hours = h;
            //h += ":";
            for (int j = 0; j <= 60; j++){
                m = "0";
                m += j;
                minute = m;
                // hm = h + m;
                //System.out.println(hm);
                tick();
                isMirrored();
                if (isMirrored()) {
                    count++;
                    String s = (hours.substring(1) + " " + minute.replaceFirst("0", "")).replace(" ", ":");
                    System.out.println(s + " " + count);
                }
            }
        }
    }
    public static void main(String[] args){
        Clock clock = new Clock();
        clock.count();
    }
}

//clock.hours = "05";
//clock.minute = "50";
//        String h = "0";
//        String m = "0";
//        int count = 0;
//        for(int i = 0; i < 24; i++){
//            h = "0";
//            h += i;
//            clock.hours = h;
//            //h += ":";
//            for (int j = 0; j <= 60; j++){
//                m = "0";
//                m += j;
//                clock.minute = m;
//               // hm = h + m;
//                //System.out.println(hm);
//                clock.tick();
//                clock.isMirrored();
//               // int count = 0;
//                if (clock.isMirrored() == true) {
//                    count++;
//                    System.out.println(clock.hours + " " + clock.minute + " " + count);
//                }
//            }
//        }
//        clock.tick();
//        clock.isMirrored();
//        int count = 0;
//        if (clock.isMirrored() == true){
//            count++;
//            System.out.println(clock.hours + " " + clock.minute + " " + count);
//        } else {
//            System.out.println("0");
//        }
