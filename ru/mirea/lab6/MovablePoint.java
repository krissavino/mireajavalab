package ru.mirea.lab6;

import java.util.Arrays;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

public class MovablePoint {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    void moveUp() {
        y += ySpeed;
    }
    void moveDown() {
        y -= ySpeed;
    }
    void moveLeft() {
        x -= xSpeed;
    }
    void moveRight() {
        x += xSpeed;
    }
}

class MovableCircle implements Movable {
    MovablePoint center;
    int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.center = center;
        this.radius = radius;
    }

    public boolean speedTest(MovablePoint p1, MovablePoint p2) {
        return ((p1.xSpeed + p1.ySpeed) == (p2.xSpeed + p2.ySpeed));
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

class MovableRectangle implements Movable {
    MovablePoint[] points;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.points = new MovablePoint[2];
        points[0] = new MovablePoint(x1, y1, xSpeed, ySpeed);
        points[1] = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    @Override
    public void moveUp() {
        for(MovablePoint mp : points)
            mp.moveUp();
    }

    @Override
    public void moveDown() {
        for(MovablePoint mp : points)
            mp.moveDown();

    }

    @Override
    public void moveLeft() {
        for(MovablePoint mp : points)
            mp.moveLeft();

    }

    @Override
    public void moveRight() {
        for(MovablePoint mp : points)
            mp.moveRight();

    }
}
