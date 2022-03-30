/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony Fierro
 */
public class Beverage {

    private String name;
    private double price;
    

    public Beverage() {
    }

    public Beverage(String name) {
        setName(name);
    }

    public Beverage(double price) {
        setPrice(price);
    }

    public Beverage(String name, double price) {

        setName(name);
        setPrice(price);
    }

    private void setPrice(double price) {
        if (price <= 0) 
            this.price = 1.0;
         else 
            this.price = price;
        
    }

    public double getPrice() {
        return this.price;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString(){
    
        return "Your beverage is " + name + 
                ". \nIt costs, $" + price + "."; 
    
    }
}
