package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 means player 1 won");
        System.out.println("0 means tie");
        System.out.println("-1 means player 2 won");
        Deck deck1 = new Deck(1);
        Card[] hand1 = deck1.drawCards(5);
        Deck deck2 = new Deck(2);
        Card[] hand2 = deck2.drawCards(5);
        System.out.println("Wynik Rarity Battle to: "+(Battles.RarityBattle(hand1,hand2)));
        System.out.println("Wynik Color Battle to: "+(Battles.ColorBattle(hand1,hand2)));
        System.out.println("Wynik Normal Battle to: "+(Battles.NormalBattle(hand1,hand2)));
    }
}
