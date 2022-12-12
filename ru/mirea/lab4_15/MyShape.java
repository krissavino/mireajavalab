package ru.mirea.lab4_15;

interface Point {
    double x = 0, y = 0;
}

abstract class MyShape implements Point {
    protected String color;
    protected boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "MyShape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    abstract public double getArea();
    abstract public double getPerimeter();
}

class Circle extends MyShape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}

class Rectangle extends MyShape {
    double length, height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    public Rectangle(double length,double height, String color, boolean filled) {
        this.length = length;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getArea() {
        return length*height;
    }
    public double getPerimeter() {
        return length*2+height*2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Square extends MyShape {
    double side;
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getArea() {
        return side*side;
    }
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}