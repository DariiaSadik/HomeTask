package com.homeTask.task03.recursion;

public class Test04 {
    static int center (int begin, int end){ // 1, 2, 3
        if (((begin == 1)&&(end == 3)) || ((begin == 3)&&(end == 1)))
             return 2;
        else
        if (((begin == 2)&&(end == 3)) || ((begin == 3)&&(end == 2)))
            return 1;
        else // 1 -> 2 || 2 -> 1
            return 3;
    }

    static void hanoi (int r, int begin, int end){
        int center = center(begin, end);
        if(r > 1){
            hanoi(r-1, begin, center); //без последнего кольца
            System.out.println(begin + " -> " + end);
            //System.out.println(center);
            hanoi(r-1, center, end); //вся башня
        }
        else {
            System.out.println(begin + " -> " + end);
           // System.out.println(center);
        }//кольцо одно
    }
    public static void main (String[] args){
        Test04.hanoi(4, 1, 3);
    }
}
