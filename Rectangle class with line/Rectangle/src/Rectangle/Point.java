/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author ct-D101-Instructor
 */
public class Point {
   private int x;
   private int y;
   private static int numPoints = 0;
    
   public Point() { // default constructor
        setPoint(0, 0);
        numPoints++;
    }
    
   public Point(int x, int y) {
       setPoint(x, y);
       //this.x = x;
       //this.y = y;
        numPoints++;
    }
    
   public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
   public int getX() {
        return x;
    }
   public int getY() {
        return y;
    }
    
   public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    
   public static int getNumPoints() {
       return numPoints;
   }
    
    public String toString() {
        return ("("+x+","+y+")");
    }
}
