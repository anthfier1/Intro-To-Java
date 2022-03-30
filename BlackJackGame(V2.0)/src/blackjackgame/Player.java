/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import java.util.ArrayList;

/**
 *
 * @author xanth
 */
public abstract class Player {
    
    public   ArrayList<Integer> hand = new ArrayList<>();
    private static int score = 0; 
    

     public Player() {
             
    }
   
   
     public  int getScore(){
         
        for(int i = 0; i < hand.size(); i ++){
            score += hand.get(i);
         }
         return score;
             
         
     }
     
     public String cheer(){
     
         return "I win!!";
         
     }
     
     public void addCardValueToHand(int val){
     
         hand.add(val);
         
     
     }
    
}
