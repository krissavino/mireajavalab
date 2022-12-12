package ru.mirea.lab2.task7;

public class BookTest {
    public void test() {
        Bookshelf bs = new Bookshelf();
        bs.add(new Book("Tolstoy", "Voyna i mir", 1863));
        bs.add(new Book("Tolstoy", "Voyna i mir 2", 3333));
        bs.add(new Book("Tolstoy", "Voyna i mir 3", 1999));
        System.out.println(bs.getEarly().getName());
        System.out.println(bs.getLate().getName());
        bs.show();
        bs.sortByYear();
        bs.show();
    }
}
