/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony Fierro
 */
public class ColdBeverage extends Beverage {
    
    private String type;

    private static int numColdBeverages;

    public ColdBeverage(String name, double price, String type) {

        super(name, price);
      /* if(type.toLowerCase() != "coffee" || type.toLowerCase() != "tea" || type.toLowerCase() != "soda" || type.toLowerCase() != "yogurt")
            this.type = "N/A";
        else
       */ this.type = type;
        
        numColdBeverages++;

    }

    public String toString() {

        return super.toString() + "\n The type is " + type + ". \n";
    }

    public static int getNumColdBeverages() {
        return numColdBeverages;
    }

}

