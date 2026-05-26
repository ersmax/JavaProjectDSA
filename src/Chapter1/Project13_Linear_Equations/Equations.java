package Chapter1.Project13_Linear_Equations;

import java.text.DecimalFormat;

/**
 * The Equations class provides a solution for a 2x2 system of linear equations
 * using Cramer's rule. This program calculates the values of x and y based on
 * the given equations.
 */
public class Equations {
    public static void main(String[] args) {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

        double determinant = a * d - b * c;
        if (determinant == 0)
            System.exit(0);
        double determinantX = e * d - b * f;
        double determinantY = a * f - e * c;
        double x = determinantX / determinant;
        double y = determinantY / determinant;
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("x = " + formatter.format(x));
        System.out.println("y = " + formatter.format(y));
    }
}
