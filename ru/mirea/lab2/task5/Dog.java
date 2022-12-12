package ru.mirea.lab2.task5;

class Kennel {
    private Dog[] dogs;
    public void add(Dog doggie) {
        Dog[] newDogs;
        if(!(dogs == null)) {
            newDogs = new Dog[dogs.length + 1];
            for(int i = 0; i < dogs.length; i++)
                newDogs[i] = dogs[i];
            newDogs[dogs.length] = doggie;
        }
        else
            newDogs = new Dog[] { doggie };
        dogs = newDogs;
    }

}

public class Dog {
    private String tag;
    private int age;

    public Dog(String tag, int age) {
        this.tag = tag;
        this.age = age;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getAge() {
        return age;
    }

    public int getHumanAge() {
        return age*7;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tag='" + tag + '\'' +
                ", age=" + age +
                '}';
    }
}
