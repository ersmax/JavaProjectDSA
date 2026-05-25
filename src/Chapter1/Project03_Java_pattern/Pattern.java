package Chapter1.Project03_Java_pattern;

/**
 * The Pattern class is a simple program that prints out a predefined pattern
 * in the form of letters arranged to spell "JAVA". The pattern is constructed
 * using a combination of spaces and characters to create a symmetrical and
 * visually appealing text design.
 */
public class Pattern {
    /**
     * The main method serves as the entry point of the program and is responsible
     * for printing a predefined pattern to the console. The pattern spells out
     * the word "JAVA" using a combination of characters and spaces to create
     * a visually structured output.
     *
     * @param args Command-line arguments passed to the program. These arguments
     *             are not utilized in the current implementation of the method.
     */
    public static void main(String[] args) {
        System.out.println("    J     A    V    V     A");
        System.out.println("    J    A A    V   V    A A");
        System.out.println("J   J   AAAAA    V V    AAAAA");
        System.out.println(" J J   A     A    V    A     A");
    }
}
