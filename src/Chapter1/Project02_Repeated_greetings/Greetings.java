/*
1.2 (Display five messages) Write a program that displays Welcome to Java five times.
 */

package Chapter1.Project02_Repeated_greetings;

/**
 * The Greetings class is a simple program that demonstrates
 * basic functionality for printing a message multiple times to the console.
 *
 * This class includes a main method which prints the message
 * "Welcome to Java" five times using a for loop.
 */
public class Greetings {
    /**
     * The entry point of the program which prints the message
     * "Welcome to Java" five times to the console.
     *
     * @param args an array of command-line arguments passed to the program
     */
    public static void main(String[] args) {
        for (int idx = 0; idx < 5; idx++)
            System.out.println("Welcome to Java");
    }
}
