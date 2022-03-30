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
public class Gambler extends Player {

    /**
     * calls the super class constructor to initialize their hand.
     */
    public Gambler() {
        super();
    }

    /**
     *
     * @return the saying that the gambler says when they win
     */
    @Override
    public String cheer() {

        return "I never lose!";
    }

    /**
     * clears the hand of the gambler to start a new game
     */
    public void clearGamblerHand() {

            gamblerHand.removeAll(gamblerHand);
        

    }

      /**
     *
     * @param val is used to add the value of the card given to one of the
     * players hands.
     */
    public void addCardValueToGamblerHand(int val) {

        gamblerHand.add(val);

    }
    
     /**
     *
     * @return score returns the score the players hand depending on who called
     * the method
     */
    public int getGamblerScore() {

       int gamblerScore = 0;
        for (int i = 0; i < gamblerHand.size()- 1; i++) {
            gamblerScore += gamblerHand.get(i);
        }
        return gamblerScore;
    }


}
