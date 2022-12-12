package ru.mirea.lab4_15;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println(name + " calling");
    }

    void receiveCall(String name, String number) {
        System.out.println(name + " calling, number: " + number);
    }

    void sendMessage(String ... vars) {
        for(String v : vars) {
            System.out.println(v);
        }
    }

    public String getNumber() {
        return number;
    }
}
