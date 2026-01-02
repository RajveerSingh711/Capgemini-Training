package Dec29;

/*
 * UC3: Refactor Banner Logic Using Functions
 *
 * Question:
 * Write a Java program to improve the modularity of the OOPS banner application
 * by extracting banner-building and printing logic into reusable functions.
 *
 * The program should:
 * 1. Define helper methods to build banner patterns.
 * 2. Use a separate method to print the banner.
 * 3. Display the same output as UC2.
 *
 * Goal:
 * Improve readability, reusability, and maintainability of the code.
 */

public class UC3 {
    public static String[] buildO() {
        return new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                " *****   "
        };
    }
    public static String[] buildP() {
        return new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                " *****   ",
                "*        ",
                "*        ",
                "*        "
        };
    }
    public static String[] buildS() {
        return new String[]{
                " *****   ",
                "*        ",
                "*        ",
                " *****   ",
                "      *  ",
                "      *  ",
                " *****   "
        };
    }
    public static void printBanner(String[] O1,String[] O2,String[] P,String[] S) {
        for (int i=0;i<7;i++) {
            System.out.println(O1[i]+O2[i]+P[i]+S[i]);
        }
    }
    public static void main(String[] args) {
        String[] O=buildO();
        String[] P=buildP();
        String[] S=buildS();
        printBanner(O,O,P,S);
    }
}
