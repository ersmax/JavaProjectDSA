package Chapter1.Project07_PI;

/**
 * The PI class demonstrates the calculation of an approximation of the mathematical constant π (pi)
 * using a partial sum of the Gregory-Leibniz series.
 *
 * The series for π is expressed as:
 * π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... ).
 *
 * This class calculates and prints:
 * - An approximation of π using the first six terms of the series.
 * - An enhanced approximation of π by including the seventh term of the series.
 * - The actual value of π from the Math library for comparison.
 */
public class PI {
    public static final double CONSTANT = 1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11;

    public static void main(String[] args) {
        System.out.println(4 * CONSTANT);
        System.out.println(4 * (CONSTANT + 1.0 / 13));
        System.out.println("True PI: " + Math.PI);
    }
}
