package ru.mirea.lab6;

public class Tester {
    public void task1() {
        MovableCircle mc = new MovableCircle(5, 4, 10, 20, 100);
        MovableRectangle mr = new MovableRectangle(10, 10, 20, 20, 1, 1);
        System.out.println(mc.toString());
        System.out.println(mr.toString());
        mc.moveLeft();
        mr.moveUp();
        System.out.println(mc.toString());
        System.out.println(mr.toString());
    }
    public void task6789() {
        Printable[] printable = new Printable[2];
        printable[0] = new Book();
        printable[1] = new Magazine();
        for(Printable p : printable)
            p.print();
        ;
    }
    public void task10() {
        Shop shop = new Shop();
        shop.enterData();
        System.out.println(shop.find("INTEL", "SSD", "SAMSUNG", "SAMSUNG"));
    }
    public void task11() {
        System.out.println(new Temperature(15).convert(TemperatureType.Celsius));
        System.out.println(new Temperature(15).convert(TemperatureType.Fahrenheit));
        System.out.println(new Temperature(15).convert(TemperatureType.Kelvin));
    }

}
