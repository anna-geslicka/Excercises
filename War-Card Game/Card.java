package com.company;

public class Card {
   private int suit;
   private int value;
   private boolean rarity;

   public Card( int suit, int value, boolean rarity ) {
      this.suit = suit;
      this.value = value;
      this.rarity = rarity;
   }

   public int getSuit() {
      return suit;
   }

   public int getValue() {
      return value;
   }

   public boolean getRarity() {
      return rarity;
   }

   public String toString() {
      return ("("+suit+" , "+ value+" , "+rarity+")");
   }
}
