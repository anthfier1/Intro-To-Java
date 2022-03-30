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
public class Dealer extends DeckOfCards {

    private int valueOfHand;
    private Card[] dealersHand;
    private Card cardToBeDelt;
    
    
    public Dealer() {
    }
    
    public Card dealCard(){
    
        return cardToBeDelt = DeckOfCards.getCardDelt();
        
    }
    
    
    
    
}
