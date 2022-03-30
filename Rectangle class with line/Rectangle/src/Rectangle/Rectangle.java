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
public class Rectangle {

    private Line length;
    private Line width;

    public Rectangle() {

        Line line1 = new Line();
        Line line2 = new Line();

        setLength(line1);

        setWidth(line2);
    }

    public Rectangle(Line line, Line line2) {

        setLength(line);
        setWidth(line2);

    }

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);
        width = new Line(p1, p2);
        length = new Line(p3, p4);

    }

    public void setWidth(Line line) {
        this.width = line;
    }

    public void setLength(Line line) {

        this.length = line;
    }

    public String toString() {

        return "The width is " + calcLength(width) + "\n" +
                "the length is " + calcLength(length) + "\n" +
                "the perimeter is " + perimeter()+ "\n" +
                "the area is " + area()+ "\n" +
                "Is it a square? " + isSquare()+ "\n";
    }

    public boolean isSquare() {

        if (calcLength(width) == calcLength(length)) {
            return true;
        }
        return false;
    }

    public double area() {

        return (calcLength(width)*calcLength(length));

    }

    public double perimeter() {

        return 2*(calcLength(width) + calcLength(length));
    }

    public double calcLength(Line line) {

        double valX1 = line.getP1().getX();
        double valY1 = line.getP1().getY();
        double valX2 = line.getP2().getX();
        double valY2 = line.getP2().getY();

        double a = valX2 - valX1;
        double b = valY2 - valY1;
        double c = Math.pow(a, 2) + Math.pow(b, 2);

        return Math.sqrt(c);

    }
}
