package ru.mirea.lab6;

import java.util.Scanner;

public class Shop implements canEnter {
    private Computer[] computers;

    public void add(Computer comp) {
        Computer[] newComputers;
        if(!(computers == null)) {
            newComputers = new Computer[computers.length + 1];
            for(int i = 0; i < computers.length; i++)
                newComputers[i] = computers[i];
            newComputers[computers.length] = comp;
        }
        else
            newComputers = new Computer[] { comp };
        computers = newComputers;
    }
    public Computer find(String processor, String memory, String monitor, String brand) {
        for (Computer comp:computers) {
            if(comp.processor.name.equals(processor) & comp.memory.type.equals(memory) & comp.monitor.name.equals(monitor) & comp.brand.equals(Brand.valueOf(brand)))
            {
                return comp;
            }
        }
        return null;
    }

    @Override
    public void enterData() {
        int c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Count: ");
        c = scan.nextInt();
        for(int i = 0; i < c; i++) {
            System.out.print("Enter: processor memoryType monitor brand");
            String[] str = new String[4];
            for(int j = 0; j < 4; j++)
                str[j] = scan.next();
            add(new Computer(new Processor(str[0]), new Memory(512, str[1]), new Monitor(str[2], 1440, 900), Brand.valueOf(str[3])));
        }
    }
}

interface canEnter {
    void enterData();
}

enum Brand {
    HP, ACER, SAMSUNG
}

class Processor {
    String name;
    public Processor(String name) {
        this.name = name;
    }
}

class Memory {
    int data[];
    String type;

    public Memory(int size, String type) {
        this.data = new int[size];
        this.type = type;
    }
}

class Monitor {
    int[][] screen;
    String name;
    boolean state;

    public Monitor(String name, int width, int height) {
        this.name = name;
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

class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;
    Brand brand;

    boolean state;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    public Computer() {

    }
    void powerOn() {
        state = true;

        monitor.switchOn();
        monitor.show();
    }
    void powerOff() {
        state = false;
    }

    @Override
    public String toString() {
        return "Computer " + brand.toString();
    }
}