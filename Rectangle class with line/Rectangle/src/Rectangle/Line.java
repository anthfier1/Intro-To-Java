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
 public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line() {
        this.p1 = new Point();
        this.p2 = new Point(1, 1);
    }

    public void setLine(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return (p1.toString() + ", " + p2.toString());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
}
