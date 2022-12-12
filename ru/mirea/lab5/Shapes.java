package ru.mirea.lab5;

import org.w3c.dom.ranges.Range;

import javax.swing.*;
import java.awt.*;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Random;

abstract class Shape{
    String color;
    Point center;
}

class Circle extends Shape{
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    int width, height;

    public Rectangle(Point center, int width, int height) {
        this.center = center;
        this.width = width;
        this.height = height;
    }
}

public class Shapes {
    JFrame frame;
    public void create() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame = new JFrame("10");

        JPanel p = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();
                for(int i = 0; i < 20; i++)
                {
                    g.setColor(new Color(i*10+20,i*10, i*5+50));
                    if(random.nextInt(5) > 2)
                        g.fillOval(50+(i%10)*100, 20+i/10*100, 80, 80);
                    else
                        g.fillRect(50+(i%10)*100, 20+i/10*100, 80, 80);


                }
            }
        };
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(p);
        frame.setSize(1100, 500);
        frame.setVisible(true);

    }
}
