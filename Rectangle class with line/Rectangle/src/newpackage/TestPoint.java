/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Rectangle.Point;
import Rectangle.Point;

/**
 *
 * @author ct-D101-Instructor
 */
public class TestPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point defaultPoint = new Point();
        System.out.println("Default Point: " + 
                defaultPoint.toString());
        
        Point newPoint = new Point(3, 7);
        System.out.println("New Point: " + newPoint.toString());
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
    }
    
}
