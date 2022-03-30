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
public class ExceptionClass extends Exception{

     String message = "The Number of the card does not exist";
    
    /**
     * constructor that prints the error message when created.
     */
    public ExceptionClass() {
        
       
    
        System.out.println(message);
    
    }

}
    

