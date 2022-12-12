package ru.mirea.lab2.task8;

public class StringSwaper {
    String str[];
    public StringSwaper(String str[]) {
        this.str = str;
    }
    public void swap() {
        for(int i = 0; i < str.length; i++){
            String s = new String(str[i]);
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = s;
        }
    }
    public void show() {
        for(String s:str) System.out.print(s + " ");
    }
}
