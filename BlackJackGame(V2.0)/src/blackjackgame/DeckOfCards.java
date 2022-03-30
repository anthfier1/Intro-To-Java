/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

/**
 *
 * @author xanth
 */
public class DeckOfCards {

    private static int valueDelt;
    private static int[] deck = new int[52];
    public int count = 1;
    public String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};
    public String rank;

    public DeckOfCards() {
        for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    }

    public void getACard() {

        rank = ranks[(int) (Math.random() + 52) % 13];
        if ("Jack".equals(rank))
            valueDelt = 10;
        if("Queen".equals(rank))
            valueDelt = 10;
        if("King".equals(rank))
            valueDelt = 10;
        if("Ace".equals(rank))
            valueDelt = 1;
        
        valueDelt = Integer.parseInt(rank);

    }


   
 /*   // Shuffle the cards
    for (int i = 0;
    i< deck.length ;
    i

    
        ++) {
      // Generate an index randomly
      int index = (int) (Math.random() * deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
    }

    // Display the first four cards
    for (int i = 0;
    i< 4; i

    
        ++) {
      String suit = suits[deck[i] / 13];
        String rank = ranks[deck[i] % 13];
        System.out.println("Card number " + deck[i] + ": "
                + rank + " of " + suit);
    }
*/
    
    public static int getCardDealt() {
        
        return DeckOfCards.valueDelt;

    }


}



/*

public class DeckOfCards {
  public static void main(String[] args) {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
      "10", "Jack", "Queen", "King"};
        
    // Initialize cards
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;
    
    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index]; 
      deck[index] = temp;
    }

    // Display the first four cards
    for (int i = 0; i < 4; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println("Card number " + deck[i] + ": " 
        + rank + " of " + suit);
    }
  }
}

*/
