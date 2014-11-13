package com.homeTask.task04_01;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args){
        Site st = Site.getInstance();
        System.out.println(
                Arrays.toString(st.getSort(new Comparator() {
                    @Override
                    public int compare(Object o, Object o2) {
                        return ((Publication)o).getContetnt().compareTo(
                                ((Publication)o2).getContetnt()
                        );
                    }
                })));
    }
}
