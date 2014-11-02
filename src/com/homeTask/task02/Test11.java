package com.homeTask.task02;

public class Test11 {
    long property;

    void setParam(int shift, int value){
        // (1)
        long mask = 0xFFFF;
        mask = mask << shift;
        mask = ~mask;
        property = property & mask;
        // (2)
        long var = (short) value;
        // (3)
        var <<= shift;
        // (4)
        property = property | var;
    }
    void setYear (int year){
        setParam(48, year);
    }
    void setWeight(int weight){
        setParam(32, weight);
    }
    void setHeight(int height){
        setParam(16, height);
    }
    void setAge (int age){
        setParam(0, age);
    }

    int getParam (int shift){
        // (1)
        long mask = 0xFFFF;
        // (2)
        long prop = property >>> shift;
        prop = mask & prop;
        return (int)prop;
    }
    int getYear (){
        return getParam(48);
    }
    int getWeight (){
        return getParam(32);
    }
    int getHeight (){
        return getParam(16);
    }
    int getAge (){
        return getParam(0);
    }
    public static void main (String[] args){
        Test11 propetry = new Test11();
        propetry.setAge(18);
        propetry.setWeight(2);
        propetry.setHeight(165);
        propetry.setYear(1993);

        System.out.println("Age = " + propetry.getAge() + "; Weight = "  + propetry.getWeight()
                + "; Heigth = " + propetry.getHeight() + "; Year = " + propetry.getYear());
    }
}
