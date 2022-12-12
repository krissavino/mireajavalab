package ru.mirea.lab4_15;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {}

    public void move() {
        System.out.println(fullName + " walking");
    }
    public void talk() {
        System.out.println(fullName + " talking");
    }

}
