package ru.mirea.lab7;

public class StringsFunc implements WorkWithStrings {

    public static void main(String[] args) {
        StringsFunc sf = new StringsFunc();
        System.out.println(sf.countSymbols("123"));
        System.out.println(sf.oddPositions("12345"));
        System.out.println(sf.invert("12345"));
    }
    @Override
    public int countSymbols(String s) {
        return s.length();
    }

    @Override
    public String oddPositions(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        for(int i = 0, j = 0; i < s.length(); i++) {
            if(i % 2 != 0)
            stringBuilder.insert(j++, s.charAt(i));
        }
        return stringBuilder.toString();
    }

    @Override
    public String invert(String s) {
        return (new StringBuilder(s).reverse()).toString();
    }
}
