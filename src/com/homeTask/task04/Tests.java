package com.homeTask.task04;

public class Tests {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Coach Bob", 27, "M");
        person[1] = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        person[2] = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        person[3] = new CollegeStudent("Ima Frosh", 18, "F", "UCD123", 4.0, 1, "English");
//        for (int i = 0; i < person.length; i++)
//            System.out.println(person[i]);
        for (Person item : person)
            System.out.println(item);
    }
}
