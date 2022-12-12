package ru.mirea.lab4_15;

public class Listener {
    public void show() {
        System.out.println("Who am i?7");
    }
}

class Pupil extends Listener {
    public void show() {
        System.out.println("Im pupil((99");
    }
}

class Student extends Listener {
    public void show() {
        System.out.println("Im student)0");
    }
}