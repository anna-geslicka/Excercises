package com.company;

import java.util.Random;

public class Deck {
    public Card[] deck;
    private int currentCard;
    private final int NUMBER_OF_SUITS = 4;
    private final int NUMBER_OF_VALUES = 10;
    private final int NUMBER_OF_CARDS = NUMBER_OF_SUITS*NUMBER_OF_VALUES;
    private Random deckRandomGenerator;
    private long seed;

    public Deck(long seed) {
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        deckRandomGenerator = new Random(seed);
        
//completing deck
        for (int i = 0; i < NUMBER_OF_SUITS; i++) {
            for (int j = 0; j < NUMBER_OF_VALUES; j++) {
                deck[currentCard] = new Card(i, j, deckRandomGenerator.nextBoolean());
                currentCard++;

            }
        } 
        
//shuffling
        currentCard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = deckRandomGenerator.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        } 
    }
//drwaing cards 
    Card[] drawCards(int cardsInHand){
        Card[] hand = new Card[cardsInHand];
        for(int i = 0; i < cardsInHand; i++) {
            hand[i] = deck[i];
            System.out.print("Karta " + i +" - "+ this.deck[i].toString()+" ");
        }
        System.out.println();
        return hand;
    }
}
