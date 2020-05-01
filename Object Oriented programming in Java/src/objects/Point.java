package objects;

/*
public double distance(Point other)
returns the distance between the current Point object and the given other Point object. The distance between two points
is equal to the square root of the sum of the squares of the differences of their x- and y-coordinates. In other words,
the distance between two points (x1, y1) and (x2, y2) can be expressed as the square root of (x2 - x1)2 + (y2 - y1)2.
Two points with the same (x, y) coordinates should return a distance of 0.0.
 */
public class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point other) {

        return Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
    }
}
