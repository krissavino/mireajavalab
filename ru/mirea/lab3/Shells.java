package ru.mirea.lab3;

public class Shells {
    public void task1() {
        Double d = Double.valueOf(5);
        System.out.println(d);

        String s = "12";
        System.out.println(s);
        System.out.println(Double.parseDouble(s));
        System.out.println();
        System.out.println((double)d);
        System.out.println((float)(double)d);
        System.out.println((short)(double)d);
        System.out.println((long)(double)d);
        System.out.println((int)(double)d);
        System.out.println((byte)(double)d);
        System.out.println((char)(double)d);
        s = Double.toString(d);
        System.out.println(s);
        System.out.println(Double.toString(3.14));

    }
}
