package com.homeTask.task02;

public class Dog {
    String name;
    String says;

    public static void main (String[] args){
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.says = "Ruff!";
        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.says = "Wurf!";
        System.out.println(spot.name + " says " + spot.says + "\n" + scruffy.name + " says " + scruffy.says);
    }
}
