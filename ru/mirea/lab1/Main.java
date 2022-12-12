package ru.mirea.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().task1();
        new Main().task2(args);
        new Main().task3();
        new Main().task4();
    }
    public void task1() {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size: ");
        size = scanner.nextInt();
        int data[] = new int[size];
        int sum = 0;
        int max = 0, min = 0;
        boolean isfirst = true;
        System.out.print("Enter elements: ");
        for(int i = 0; i < size; i++) {
            data[i] = scanner.nextInt();
            sum += data[i];
            if(isfirst) {
                max = data[i];
                min = data[i];
                isfirst = false;
            }
            if(data[i] > max) max = data[i];
            if(data[i] < min) min = data[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Arithmetic mean: " + sum/size);
    }
    public void task2(String[] args) {
        for(var arg : args) {
            System.out.println(arg);
        }
    }
    public void task3() {
        System.out.print("Harmonic series: ");
        for(int i = 1; i <= 10; i++) {
            String str = String.format("%.5f ", 1/(double)i);
            System.out.print(str);
        }
        System.out.println();
    }
    public void task4() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int of = scanner.nextInt();
        System.out.print("Factorial: ");
        if(of == 0)
            System.out.println(1);
        else {
            int res = 1;
            for (int i = 1; i <= of; i++)
                res *= i;
            System.out.println(res);
        }

    }
}
