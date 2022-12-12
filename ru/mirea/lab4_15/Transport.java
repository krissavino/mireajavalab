package ru.mirea.lab4_15;

class Vehicle extends Transport {
    public Vehicle(int time, int price) {
        super(time, price);
    }
    public String toString() {
        return "Vehicle";
    }
}


class Plane extends Transport {
    public Plane(int time, int price) {
        super(time, price);
    }

    @Override
    public String toString() {
        return "Plane";
    }
}


class Train extends Transport {
    public Train(int time, int price) {
        super(time, price);
    }
    public String toString() {
        return "Train";
    }
}

class Ship extends Transport {
    public Ship(int time, int price) {
        super(time, price);
    }

    @Override
    public String toString() {
        return "Ship";
    }
}

abstract public class Transport {
    int time;
    int price;

    public Transport(int time, int price) {
        this.time = time;
        this.price = price;
    }
    public int getTime() {
        return time;
    }
    public int getPrice() {
        return price;
    }
}
