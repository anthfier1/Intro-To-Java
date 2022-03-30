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
public class DeckOfCards extends Card {
    public static String[] value;
    private static Card[] deck;
    private static Card cardDelt;
    
    public DeckOfCards(){
    
        setValueOfCards();
        initilizeDeck();
    }
    
    public static void getACard(){
    
        cardDelt = deck[(int)(Math.random() * 52) % 13];
        
    }
    
    public static Card getCardDelt(){
    
        return DeckOfCards.cardDelt;
    
    }
    
    public void initilizeDeck(){
    
        for (int i= 0; i < 52; i++)
            deck[i] = new Card(value[i]);
    }
    
    public int faceValue(){
    
       
    
    }
        
    public void setValueOfCards(){
    
        value = new String[]{
    
        "Ace Of Spades",
        "Ace Of Clubs",
        "Ace Of Diamonds",
        "Ace Of Hearts",
        "2 Of Spades",
        "2 Of Clubs",
        "2 Of Diamonds",
        "2 Of Hearts",
        "3 Of Spades",
        "3 Of Clubs",
        "3 Of Diamonds",
        "3 Of Hearts",
        "4 Of Spades",
        "4 Of Clubs",
        "4 Of Diamonds",
        "4 Of Hearts",
        "5 Of Spades",
        "5 Of Clubs",
        "5 Of Diamonds",
        "5 Of Hearts",
        "6 Of Spades",
        "6 Of Clubs",
        "6 Of Diamonds",
        "6 Of Hearts",
        "7 Of Spades",
        "7 Of Clubs",
        "7 Of Diamonds",
        "7 Of Hearts",
        "8 Of Spades",
        "8 Of Clubs",
        "8 Of Diamonds",
        "8 Of Hearts",
        "9 Of Spades",
        "9 Of Clubs",
        "9 Of Diamonds",
        "9 Of Hearts",
        "10 Of Spades",
        "10 Of Clubs",
        "10 Of Diamonds",
        "10 Of Hearts",
        "Jack Of Spades",
        "Jack Of Clubs",
        "Jack Of Diamonds",
        "Jack Of Hearts",
        "Queen Of Spades",
        "Queen Of Clubs",
        "Queen Of Diamonds",
        "Queen Of Hearts",
        "King Of Spades",
        "King Of Clubs",
        "King Of Diamonds",
        "King Of Hearts",
    };
        
    }
}
