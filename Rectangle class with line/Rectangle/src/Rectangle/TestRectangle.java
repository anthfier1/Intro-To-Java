/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;
/**
 *
 * @author Anthony Fierro
 */
public class TestRectangle {
    public static void main(String[] args){
        
        Point p1 = new Point(5,10);
        Point p2 = new Point(7,14);
        Point p3 = new Point(8,16);
        Point p4 = new Point(9,18);
        
        
        Line line1 = new Line(p1,p2);
        Line line2 = new Line(p3, p4);
        
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(line1, line2);
        Rectangle rec3 = new Rectangle(2,4,4,6,6,8,8,10);
        
       System.out.println("Rectangle 1: \n" + rec1.toString());
       System.out.println("Rectangle 2: \n" +rec2.toString());
       System.out.println("Rectangle 3: \n" +rec3.toString());

    }
}
