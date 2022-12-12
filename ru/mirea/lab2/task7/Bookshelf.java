package ru.mirea.lab2.task7;

public class Bookshelf {
    private Book books[];
    public void add(Book book) {
        Book[] newBooks;
        if(!(books == null)) {
            newBooks = new Book[books.length + 1];
            for(int i = 0; i < books.length; i++)
                newBooks[i] = books[i];
            newBooks[books.length] = book;
        }
        else
            newBooks = new Book[] { book };
        books = newBooks;
    }
    public void sortByYear() {
        for(int i = 0; i < books.length; i++)
            for(int j = 0; j < books.length-1; j++)
                if(books[j].getYear() > books[j+1].getYear()){
                    Book tmp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = tmp;
                }
    }

    public void show() {
        for(Book b : books) {
            System.out.println(b.getName());
        }
    }

    public Book getLate() {
        if(books[0] == null) return null;
        Book res = books[0];
        int max = books[0].getYear();
        for(Book b:books) {
            if(max < b.getYear()) {
                max = b.getYear();
                res = b;
            }
        }
        return res;
    }

    public Book getEarly() {
        if(books[0] == null) return null;
        Book res = books[0];
        int min = books[0].getYear();
        for(Book b:books) {
            if(min > b.getYear()) {
                min = b.getYear();
                res = b;
            }
        }
        return res;
    }
}
