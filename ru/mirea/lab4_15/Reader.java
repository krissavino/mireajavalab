package ru.mirea.lab4_15;

class Book {
    String name;
    String author;
    public Book(String name) {
        this.name = name;
    }
}

public class Reader {
    String name;
    String readerNumber;
    String number;
    String date;
    public Reader(String name) {
        this.name = name;
    }
    public void takeBook(int books) {
        System.out.println(name + " took " + books + " books");
    }
    public void returnBook(Book ... books) {
        System.out.print(name + " return books: ");
        for(Book b : books)
            System.out.println(b.name + " ");
    }
    public void returnBook(String ... books) {
        System.out.print(name + " return books: ");
        for(String b : books)
            System.out.println(b + " ");
    }
    public void takeBook(Book ... books) {
        System.out.print(name + " took books: ");
        for(Book b : books)
            System.out.println(b.name + " ");
    }
    public void takeBook(String ... books) {
        System.out.print(name + " took books: ");
        for(String b : books)
            System.out.println(b + " ");
    }

    public void returnBook(int books) {
        System.out.println(name + " returned " + books + " books");
    }



}
