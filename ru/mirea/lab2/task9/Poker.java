package ru.mirea.lab2.task9;
import java.util.*;

class Card {
    String letter;
    String var;
    public Card(String l, String v) {
        letter = l;
        var = v;
    }
    public void show() {
        System.out.print(letter + "(" + var + ")");
    }
}

public class Poker {
    String players[];
    int n;
    public Poker(int n) {
        List<Card> cards = new ArrayList<Card>(56);
        this.n = n;
        for(int i = 0; i <= 39; i++)
        {
            String v = "";
            if(i >= 0 && i <= 9) v = "clubs";
            if(i >= 10 && i <= 19) v = "diamonds";
            if(i >= 20 && i <= 29) v = "hearts";
            if(i >= 30 && i <= 39) v = "spades";
            Integer s = (i%10+1);
            cards.add(i, new Card(s.toString(), v));
        }
        System.out.println();
        for(int i = 39; i < 55; i+=4) {
            String v = "";
            if(i == 39) v = "clubs";
            if(i == 43) v = "diamonds";
            if(i == 47) v = "hearts";
            if(i == 51) v = "spades";
            cards.add(i + 1, new Card("J", v));
            cards.add(i + 2, new Card("Q", v));
            cards.add(i + 3, new Card("K", v));
            cards.add(i + 4, new Card("A", v));
        }
        System.out.println("Cards: ");
        for(Card c : cards)
            c.show();
        System.out.println();
        Collections.shuffle(cards);
        System.out.println("Shuffled cards: ");
        for(Card c : cards)
            c.show();
        players = new String[n];
        for(int i = 0; i < n; i++)
            players[i] = "";
        for(int i = 0; i < n*5; i+=6) {
            for(int j = 0; j < 6; j++)
                players[i/6] += cards.get(i+j).letter + "(" + cards.get(i+j).var + ")";
        }
    }
    public void showPlayers() {
        for (int i = 1; i < n; i++) {
            System.out.print("Player " + i + ": ");
            System.out.println(players[i]);
        }
    }

}
