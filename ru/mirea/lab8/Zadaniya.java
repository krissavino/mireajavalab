package ru.mirea.lab8;

import java.util.Scanner;

public class Zadaniya {
    void zadanie2() {
        int n;
        n = new Scanner(System.in).nextInt();
        for(int i = 0; i < n; i++)
            System.out.print(i+1 + " ");
        System.out.println();
    }
    void zadanie3() {
        int a, b;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        if(a > b) {
            for(int i = b; i < a; i++)
                System.out.print(i + " ");
        } else {
            for(int i = a; i < b; i++)
                System.out.print(i + " ");
        }
    }
    void zadanie4() {
        int k, d;
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        d = scan.nextInt();
        int result = 0;
        for(int i = 1; i < Math.pow(10, k); i++) {
            int a = i;
            int sum = 0;
            while(a > 0) {
                sum += a % 10;
                a /= 10;
            }
            System.out.println(i + " " + sum);
            if(sum == d)
                result++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Zadaniya().zadanie2();
        new Zadaniya().zadanie3();
        new Zadaniya().zadanie4();
    }
}
