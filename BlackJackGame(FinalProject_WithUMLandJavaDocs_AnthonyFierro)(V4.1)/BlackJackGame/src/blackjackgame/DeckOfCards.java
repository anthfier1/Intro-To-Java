/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

/**
 *
 * @author Anthony Fierro
 */
public class DeckOfCards {

    private static int valueDealt;
    
    private static int[] deck = new int[52];
    public int count = 1;
    public static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "Jack", "Queen", "King"};

    /**
     * the constructor initializes the deck
     */
    public DeckOfCards() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }

    /**
     * @return a random index of the deck. 
     * getACard gets a random value from the ranks and parses the string
     * into an integer. There are assigned values if the card is equal to ace
     * jack queen king.
     * @throws blackjackgame.ExceptionClass
     */
    public static int getACard() throws ExceptionClass {
        boolean flag = true;
        
        while (flag == true) {
            try {
                
                for(int i = 0; i < 52; i ++){
                String temp = ranks[randomNumber()];
                
                if(temp == "Jack")
                    deck[i] = 10;
                else if(temp == "Queen")
                    deck[i] = 10;
                else if(temp == "King")
                    deck[i] = 10;
                else if (temp == "Ace")
                    deck[i] = 1;
                else if (Integer.parseInt(temp) > 10)
                    deck[i] = 10;
                else if (Integer.parseInt(temp) < 1)
                    deck[i] = 1;
                else
                    deck[i] = Integer.parseInt(temp);
                }
                flag = false;
            } catch (NumberFormatException e) {

                flag = true;
                ExceptionClass ex = new ExceptionClass();
                System.out.println(ex.message);
            }
        }
        return deck[randomNumber()];

    }

    public static int getValue() {
            return valueDealt;
    }
    
 
    public static int randomNumber(){
        int randomnum =(int) (Math.random() * 52) % 13;
                return randomnum;
        
    }
    
}

/**
 * shuffles the cards to help it be more random
 */
/* public static void shuffle(){
    for (int i = 0; i< deck.length ; i++) {
    int index = (int)((Math.random() * + 52) % 13);
      String temp = ranks[i];
      ranks[index] = ranks[i]; 
      ranks[index] = temp;
    }
    }
 */
/**
 *
 * @return the integer value of the card that is going to be dealt.
 */
//   public static int getCardDealt() {
//     getACard();
//   return DeckOfCards.valueDelt;
//}

