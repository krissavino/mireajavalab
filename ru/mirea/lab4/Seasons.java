package ru.mirea.lab4;

public class Seasons {
    enum Season {
        SUMMER(25) {
            String getDescription() {
                return "Warm season";
            }
        }, SPRING(15), WINTER(-5), AUTUMN(0);
        private double temperature;
        Season(double temperature) {
            this.temperature = temperature;
        }
        String getDescription() {
            return "Cold season";
        }
    }
    Season[] season;
    public Seasons() {
        season = new Season[4];
        season[0] = Season.SUMMER;
        season[1] = Season.SPRING;
        season[2] = Season.AUTUMN;
        season[3] = Season.WINTER;
    }
    public void show() {
        for(Season s : season) {
            System.out.println(s.name() + ": " + "Temperature: " + s.temperature + " " + s.getDescription());
        }
    }

    public void yourSeason(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("I love spring!"); break;
            case AUTUMN:
                System.out.println("I love autumn!"); break;
            case WINTER:
                System.out.println("I love winter!"); break;
            case SUMMER:
                System.out.println("I love summer!");
        }
    }
}
