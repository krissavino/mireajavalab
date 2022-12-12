package ru.mirea.lab4;

enum Brand {
    HP, ACER, SAMSUNG
}

class Processor {
    public Processor() {
    }
}

class Memory {
    int data[];
    public Memory(int dataSize) {
        data = new int[dataSize];
    }
}

class Monitor {
    int[][] screen;
    boolean state;

    public Monitor(int height, int width) {
        screen = new int[height][width];
    }

    void show() {
        for(int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++)
                System.out.print(screen[i][j] + " ");
            System.out.println();
        }
    }

    void switchOn() {
        state = true;
    }

    void switchOff() {
        state = false;
    }
}

public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;
    Brand brand;

    boolean state;

    public Computer() {
        processor = new Processor();
        monitor = new Monitor(5, 5);
    }
    void powerOn() {
        state = true;

        monitor.switchOn();
        monitor.show();
    }
    void powerOff() {
        state = false;
    }
}
