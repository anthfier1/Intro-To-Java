/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony Fierro
 */
public class HotBeverage extends Beverage {

    private String type;

    private static int numHotBeverages;

    public HotBeverage(String name, double price, String type) {

        super(name, price);
        
        /* if(type != "Coffee" || type != "Tea" || type != "Cocoa")
            this.type = "N/A";
        else
        */this.type = type;
        
        numHotBeverages++;

    }

    public String toString() {

        return super.toString() + "\n The type is " + type + ". \n";
    }

    public static int getNumHotBeverages() {
        return numHotBeverages;
    }

}
