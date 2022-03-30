/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import Rectangle.Line;
import Rectangle.Point;

/**
 *
 * @author ct-D101-Instructor
 */
public class TestLine {
    public static void main(String[] args) {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(6, 6);
    Line line1 = new Line();
    Line line2 = new Line(p1, p2);
    System.out.println(line1.toString());
    line1.setLine(p1, p2);
    System.out.println(line1.toString());
    System.out.println(line2.toString());
    }
    
}
