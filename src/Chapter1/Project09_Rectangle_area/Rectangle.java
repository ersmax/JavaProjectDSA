package Chapter1.Project09_Rectangle_area;

/**
 * The Rectangle class provides a representation of a rectangle with fixed width and height.
 * It contains constants to represent the dimensions of the rectangle and calculates
 * its area and perimeter.
 */
public class Rectangle {
    public static final double WIDTH = 4.5;
    public static final double HEIGHT = 7.9;

    public static void main(String[] args) {
        System.out.println("Area = " + WIDTH * HEIGHT);
        System.out.println("Or = " + 2 * (WIDTH + HEIGHT));
    }
}
