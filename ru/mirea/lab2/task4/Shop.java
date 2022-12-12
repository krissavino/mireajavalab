package ru.mirea.lab2.task4;

import java.util.Scanner;

public class Shop implements canEnter {
    private Computer[] computers;

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add(new Computer("ASUS"));
        shop.add(new Computer("HP1"));
        shop.add(new Computer("HP2"));
        System.out.println(shop.find("HP1").getName());
    }

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
    public Computer find(String name) {
        for (Computer comp:computers) {
            if(name.equals(comp.getName()))
                return comp;
        }
        return null;
    }

    @Override
    public void enterData() {
        int c;
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Count: ");
        c = scan.nextInt();
        for(int i = 0; i < c; i++) {
            System.out.print("Name: ");
            str = scan.next();
            add(new Computer(str));
        }
    }
}

interface canEnter {
    void enterData();
}

class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
