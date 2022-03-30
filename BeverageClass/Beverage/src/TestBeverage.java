/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony Fierro
 */
public class TestBeverage {

    public static void main(String[] args) {

        System.out.println("The number of hot beverages created: " + HotBeverage.getNumHotBeverages()
                + "\nThe number of cold beverages created: " + ColdBeverage.getNumColdBeverages());

        HotBeverage coffee = new HotBeverage("Hot Coffee", 2.50, "Coffee");
        System.out.println("\n" + printBeverage(coffee) + "The number of hot beverages created: " + coffee.getNumHotBeverages());

        ColdBeverage icedCoffee = new ColdBeverage("Iced Coffee", 2.75, "Coffee");
        System.out.println("\n" + printBeverage(icedCoffee) + "The number of Cold beverages created: " + icedCoffee.getNumColdBeverages());

        HotBeverage tea = new HotBeverage("Green Tea", 1.50, "Tea");
        System.out.println("\n" + printBeverage(tea) + "The number of hot beverages created: " + tea.getNumHotBeverages());

        ColdBeverage pepsi = new ColdBeverage("Pepsi", 2.10, "Soda");
        System.out.println("\n" + printBeverage(pepsi) + "The number of Cold beverages created: " + pepsi.getNumColdBeverages());

        HotBeverage cocoa = new HotBeverage("Hot Cocoa w/ Marshmellos", 9.60, "Cocoa");
        System.out.println("\n" + printBeverage(cocoa) + "The number of hot beverages created: " + cocoa.getNumHotBeverages());

        ColdBeverage yogurt = new ColdBeverage("Smoothie", 5.50, "Yogurt");
        System.out.println("\n" + printBeverage(yogurt) + "The number of Cold beverages created: " + yogurt.getNumColdBeverages());

        ColdBeverage icedTea = new ColdBeverage("Iced Green Tea", 1.75, "Tea");
        System.out.println("\n" + printBeverage(icedTea) + "The number of Cold beverages created: " + icedTea.getNumColdBeverages());
    }

    public static String printBeverage(Beverage beverage) {

        return beverage.toString();

    }
}
