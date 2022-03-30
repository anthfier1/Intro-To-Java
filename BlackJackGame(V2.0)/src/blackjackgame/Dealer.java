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
public class Dealer extends Player {

    private int cardToBeDealt;
    
    
    public Dealer() {
       super();
    }
    
    /**
     *
     * @returns the value of the card that is going to be either dealt to the player or dealer.
     * Uses the string variable cardToBeDealt to 
     */
    public int dealCard(){
    
        return cardToBeDealt = DeckOfCards.getCardDealt();
        
    }

    @Override
    public String cheer(){
    
        return "The dealer always wins!";
    }
    
}
