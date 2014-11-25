package com.homeTask;

import java.util.Date;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Human> human = new HashSet<>();
        Human humanFirst = new Human(12, "Name", new Date(), 10);
        human.add(humanFirst);
        human.add(new Human(22, "NameSecondPerson", new Date(), 61));
        human.add(new Human(2, "A", new Date(10), 3));
        human.add(new Human(32, "NameThirdPerson", new Date(), 70));
        System.out.println(human);
        System.out.println(human.contains(new Human(2, "A", new Date(10), 3)));
        humanFirst.setName("B");
        System.out.println(human.contains(humanFirst));
        for (Human var : human) {
            System.out.println(var.equals(humanFirst));
        }
        human.add(humanFirst);
        System.out.println("-----------------------------------");
        for (Human var : human) {
            System.out.println(var.equals(humanFirst));
        }
    }
}
