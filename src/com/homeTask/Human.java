package com.homeTask;

import java.util.Date;

public class Human {
    private int age;
    private String name;
    private Date dateOfBirth;
    private int weight;

    public Human(int age, String name, Date dateOfBirth, int weight) {
        this.age = age;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (weight != human.weight) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(human.dateOfBirth) : human.dateOfBirth != null) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "{ age = " + age + ", name = " + name + ", dateOfBirth = " + dateOfBirth + ", weight = " + weight + " } \n";
    }
}
