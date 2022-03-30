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
public class Dealer extends Player {

    private int cardToBeDealt;
    
    /**
     * calls the super class constructor to initialize their hand 
     */
    public Dealer() {
       super();
    }
    
    /**
     *
     * @return the value of the card that is going to be either dealt to the player or dealer.
     * Uses the string variable cardToBeDealt to 
     */
    public int dealCard(){
     int tempcard = 0;
      boolean flag = true;
        while(flag == true || (DeckOfCards.getValue() <= 10 && DeckOfCards.getValue() >= 1)){
        try {
          tempcard = DeckOfCards.getACard();
          flag = false;
        }
        catch(ExceptionClass ex){
            flag = true;
        }
    }
        return tempcard;
    
    }
    /**
     *
     * @return the saying the dealer says when they win 
     */
    @Override
    public String cheer(){
    
        return "The dealer always wins!";
    }
 
    /**
     * clears the hand of the dealer when a new game is played.
     */
    public void clearDealerHand() {

       
            dealerHand.removeAll(dealerHand);
        

    }
       
         /**
     *
     * @param val is used to add the value of the card given to one of the
     * players hands.
     */
    public  void addCardValueToDealerHand(int val) {

        dealerHand.add(val);

    }
    
    
    
      /**
     *
     * @return score returns the score the dealers hand
     */
    public int getDealerScore() {

       int dealerScore = 0;
        for (int i = 0; i < dealerHand.size(); i++) {
            dealerScore += dealerHand.get(i);
        }
        return dealerScore;

    }

}
