package ru.mirea.lab3;

import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class MathAndRandom {
    public void task1() {
        final int size = 5;
        double data[] = new double[size];
        //Create by math.random
        for (int i = 0; i < size; i++) {
            data[i] = Math.random();
            System.out.printf("%.3f ", data[i]);
        }
        System.out.println();
        for(int i = 0 ; i < size; i++)
            for(int j = 0; j < size-1; j++)
                if(data[j] > data[j+1]) {
                    double tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
        for (double d : data) {
            System.out.printf("%.3f ", d);
        }
        System.out.println();
        //Create by Random
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextDouble();
            System.out.printf("%.3f ", data[i]);
        }
        System.out.println();
        for(int i = 0 ; i < size; i++)
            for(int j = 0; j < size-1; j++)
                if(data[j] > data[j+1]) {
                    double tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }
        for (double d : data) {
            System.out.printf("%.3f ", d);
        }
        System.out.println();
    }
    public void task2() {
        Tester tester = new Tester(3);
        tester.show();
        System.out.println("Max: "+tester.getMax().toString());
        System.out.println("Min: "+tester.getMin().toString());
        tester.sort();
        System.out.println("Tester after sort: ");
        tester.show();
    }
    public void task3() {
        Random random = new Random();
        int data[] = new int[4];
        boolean is = true;
        for(int i = 0; i < 4; i++) {
            data[i] = random.nextInt(89)+10;
            if(i > 0)
                if(data[i] <= data[i-1])
                    is = false;
            System.out.print(data[i] + " ");
        }
        if(is)
            System.out.println("\nEto strogo vozrastaushaya posledovatelnost`!");
    }
    public void task4() {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt())
            System.out.print("Whats your problem? Just enter int: ");
        n = scanner.nextInt();
        scanner.close();

        int data[] = new int[n];
        int data2[] = new int[n];

        int count = 0;
        for(int i = 0; i < n; i++) {
            data[i] = new Random().nextInt(n);
            if(data[i]%2==0) data2[count++] = data[i];
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < count; i++) {
            System.out.print(data2[i] + " ");
        }

    }
}

class Point{
    double x;
    double y;
    public Point() {
        Random rand = new Random();
        x = rand.nextDouble();
        y = rand.nextDouble();
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle() {
        Random rand = new Random();
        center = new Point();
        radius = rand.nextDouble();
    }

    public String toString() {
        return new Formatter().format("(%.3f; %.3f), R=%.3f; ", getCenter().x, getCenter().y, getRadius()).toString();
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class Tester {
    private Circle[] circles;
    private int count;
    public Tester(int count) {
        this.count = count;
        circles = new Circle[count];
        for(int i = 0; i < count; i++)
            circles[i] = new Circle();
    }
    public Circle getMax() {
        Circle res = circles[0];
        for(Circle c : circles) {
            if(c.getRadius() > res.getRadius())
                res = c;
        }
        return res;
    }
    public Circle getMin() {
        Circle res = circles[0];
        for(Circle c : circles) {
            if(c.getRadius() < res.getRadius())
                res = c;
        }
        return res;
    }
    public void sort() {
        for(int i = 0 ; i < count; i++)
            for(int j = 0; j < count-1; j++)
                if(circles[j].getRadius() > circles[j+1].getRadius()) {
                    Circle tmp = circles[j];
                    circles[j] = circles[j+1];
                    circles[j+1] = tmp;
                }
    }
    public void show() {
        for(Circle c : circles) {
            System.out.print(c.toString() + " ");
        }
        System.out.println();
    }
}
