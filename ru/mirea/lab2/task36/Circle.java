package ru.mirea.lab2.task36;

public class Circle {
    private Point c;
    private double radius;

    public double getS() {
        return Math.PI*radius*radius;
    }

    public double getL() {
        return 2*Math.PI*radius;
    }

    public boolean equals(Circle circle) {
        if(this.radius == circle.getRadius()) return true;
        return false;
    }

    public Circle(Point c, double radius) {
        this.c = c;
        this.radius = radius;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "c=" + c +
                ", radius=" + radius +
                '}';
    }
}
