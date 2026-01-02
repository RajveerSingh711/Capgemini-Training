package Dec29;

/**
 * UC2 - Display OOPS in Banner Format
 *
 * This program prints the word "OOPS" using
 * a banner pattern made of '*' and spaces.
 * */

public class UC2 {
    public static void main(String[] args){
        String[] O={
                " *****   ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                " *****   "
        };
        String[] P={
                " *****   ",
                "*     *  ",
                "*     *  ",
                " *****   ",
                "*        ",
                "*        ",
                "*        "
        };
        String[] S={
                " *****   ",
                "*        ",
                "*        ",
                " *****   ",
                "      *  ",
                "      *  ",
                " *****   "
        };
        for (int i=0;i<7;i++) {
            System.out.println(O[i]+O[i]+P[i]+S[i]);
        }
    }
}
