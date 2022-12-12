package ru.mirea.lab2.task10;

import java.util.Scanner;

public class HowMany {
    public HowMany() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ');
            {
                count++;
                if(i + 1 == str.length()) break;
                while(str.charAt(i+1) == ' ') {
                    i++;
                    if(i + 1 == str.length()) break;
                }
            }
        }
        System.out.println(count);
    }
}
