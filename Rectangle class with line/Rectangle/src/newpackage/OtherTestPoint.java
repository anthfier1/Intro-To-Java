/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Rectangle.Point;

/**
 *
 * @author ct-D101-Instructor
 */
public class OtherTestPoint {
    

   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("There are : " + Point.getNumPoints() +
                " points so far.");
        Point defaultPoint = new Point();
        System.out.println("Default Point: " + 
                defaultPoint.toString());
        System.out.println("There are : " + defaultPoint.getNumPoints() +
                " points so far.");
        
        Point newPoint = new Point(3, 7);
        System.out.println("New Point: " + newPoint.toString());
        System.out.println("There are : " + newPoint.getNumPoints() +
                " points so far.");
        System.out.println("There are : " + defaultPoint.getNumPoints() +
                " points so far.");
        newPoint.translate(-4, 8);
        System.out.println("Translate New Point by -4, 8: " +
                newPoint.toString());
        newPoint.setPoint(5, 4);
        System.out.println("Set this point to " + newPoint.getX() 
                + ", " +
                newPoint.getY() + " : " + newPoint.toString());
        newPoint.setPoint(newPoint.getX(), newPoint.getY()+1);
        System.out.println("Set this point to " + newPoint.getX()
                + ", " +
               newPoint.getY() + " : " + newPoint.toString());
        System.out.println("There are : " + Point.getNumPoints() +
                " points so far.");
    }
    
}


