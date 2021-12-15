package com.company;

public class Battles {

   static int RarityBattle(Card[] deck1, Card[] deck2) {
        int deck1Score = 0;
        int deck2Score = 0;
        for (Card checkedCard : deck1) {
            if (checkedCard.getRarity())
                deck1Score++;
        }
        for (Card checkedCard : deck2) {
            if (checkedCard.getRarity())
                deck2Score++;
        }
        if (deck1Score == deck2Score) {return 0;}
        else if (deck1Score > deck2Score) {return 1;}
        else return -1;
    }

    static int NormalBattle(Card[] deck1, Card[] deck2) {
        int i = 0;
        int j = 0;
        int value1;
        int value2;
        while(true){
            if (i==deck1.length & j==deck2.length)
                return 0;
            if (i==deck1.length)
                return -1;
            if (j==deck2.length)
                return 1;
            value1 = deck1[i].getValue();
            value2 = deck2[j].getValue();
            if (value1>value2){
                System.out.print(value1 + " bije " + value2+" \n");
                j++;}
            if (value1<value2){
                System.out.print(value2 + " bije " + value1+" \n");
                i++;}
            if (value1==value2){
                System.out.print("remis \n");
                j++;
                i++;
            }
        }
    }


    static int ColorBattle(Card[] deck1, Card[] deck2) {
        int deck1Score = 0;
        int deck2Score = 0;
        for (Card checkedCard : deck1) {
            deck1Score =+ checkedCard.getSuit();
        }
        for (Card checkedCard : deck2) {
            deck2Score =+ checkedCard.getSuit();
        }
        if (deck1Score == deck2Score) {return 0;}
        else if (deck1Score > deck2Score) {return 1;}
        else return -1;
    }
}
