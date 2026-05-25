package Chapter1.Project08_Circle_area;

/**
 * The Circle class calculates and prints the perimeter and area of a circle
 * with a fixed radius. The radius is predefined within the program.
 *
 * The perimeter of the circle is calculated using the formula:
 * perimeter = 2 * radius * π
 *
 * The area of the circle is calculated using the formula:
 * area = radius * radius * π
 */
public class Circle {
    public static final double RADIUS = 5.5;

    public static void main(String[] args) {
        System.out.println("Perimeter = " + 2 * RADIUS * Math.PI );
        System.out.println("Area = " + RADIUS * RADIUS * Math.PI );
    }
}
