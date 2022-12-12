package ru.mirea.lab6;

interface Printable {
    void print();
}

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("BOOK!");
    }
}

class Magazine implements Printable{
    @Override
    public void print() {
        System.out.println("MAGAZINE!");
    }
}