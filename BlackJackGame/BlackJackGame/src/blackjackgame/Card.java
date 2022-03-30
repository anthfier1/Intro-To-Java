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
public class Card {
    
    private int faceValue; 
    private static int numCardsCreated = 0; 
    
        
    public Card(){}
    
    public Card(String card, int faceValue){
    
        
       
       numCardsCreated++;
           
       if(numCardsCreated % 13 == 0){
           
           faceValue = 1;           
       }
       this.faceValue = faceValue;
       setCardValue(this.faceValue);
        /*
        
        
        if numCardsCreated %13 == 0?0
        
        FaceValue = 1;
        


        */
        
    }
    
    private void setCardValue(int val){
        
        this.faceValue = val;
        
    }
    
    public int getCardVal(){
    
        return this.faceValue;
    }
}
