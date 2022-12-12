package ru.mirea.lab4;

import java.util.Scanner;

public class Main {
    static public void main(String[] args) throws InterruptedException {
        new Seasons().show();
        new Seasons().yourSeason(Seasons.Season.valueOf(new Scanner(System.in).next()));
        //new Atelier();
        //new EShop().enter();
        //new Computer().powerOn();
    }
}
