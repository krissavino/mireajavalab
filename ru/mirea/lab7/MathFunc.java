package ru.mirea.lab7;

public class MathFunc implements  MathCalculable {

    public double getPi() {
        return pi;
    }
    public static void main(String[] args) {
        System.out.println(new MathFunc().module(-10.2));
        System.out.println(new MathFunc().getPi());

    }

    @Override
    public double pow(double number, double stepen) {
        return Math.pow(number, stepen);
    }

    @Override
    public double module(double number) {
        return Math.abs(number);
    }
}
