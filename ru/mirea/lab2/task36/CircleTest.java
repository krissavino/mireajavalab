package ru.mirea.lab2.task36;

public class CircleTest {
    public void test() {
        Circle circle = new Circle(new Point(0, 0), 5);
        System.out.println("S: "+circle.getS());
        System.out.println("L: "+circle.getL());
        System.out.println(circle.equals(new Circle(new Point(3, 5), 5)));
    }
}
