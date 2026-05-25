package Chapter1.Project04_PowerOf;

/**
 * The PowerOf class demonstrates a simple program that prints a table of numbers and their powers.
 * The table consists of integers from 1 to 4 along with their squares and cubes.
 *
 * The program uses the Math.pow method to compute the square and cube of each integer in the range.
 * It then formats the output as a tab-separated table with the columns: "a", "a^2", and "a^3".
 *
 */
public class PowerOf {
    /**
     * The main method is the entry point of the program and performs the following:
     * - Prints a header row for the table.
     * - Iterates through integers from 1 to 4 and calculates their powers.
     * - Prints each integer and its corresponding powers in a formatted row.
     */
    public static void main(String[] args) {
        System.out.println("a\ta^2 \ta^3");
        for (int idx = 1; idx < 5; idx++)
            System.out.println(idx + "\t" + Math.pow(idx, 2) + " \t" + Math.pow(idx, 3));
    }
}
