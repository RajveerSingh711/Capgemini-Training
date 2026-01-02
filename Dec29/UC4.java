package Dec29;

/*
 * UC4: Store Character Pattern in a Class
 *
 * Question:
 * Write a Java program to encapsulate banner character patterns inside a
 * dedicated class. The program should use objects of this class to store
 * character data and display the OOPS banner.
 *
 * Goal:
 * To separate data (character patterns) from display logic using a class.
 *
 * Flow:
 * 1. Define a BannerCharacter class to store a character and its pattern.
 * 2. Create objects for characters O, P, and S.
 * 3. Use a display method to print the banner.
 * 4. Program outputs the same banner as previous use cases.
 */

public class UC4 {
    static class BannerCharacter {
        private char character;
        private String[] pattern;
        public BannerCharacter(char character,String[] pattern) {
            this.character=character;
            this.pattern=pattern;
        }
        public String[] getPattern() {
            return pattern;
        }
        public char getCharacter() {
            return character;
        }
    }
    public static void main(String[] args) {
        BannerCharacter O=new BannerCharacter('O',new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                " *****   "
        });
        BannerCharacter P=new BannerCharacter('P',new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                " *****   ",
                "*        ",
                "*        ",
                "*        "
        });

        BannerCharacter S=new BannerCharacter('S',new String[]{
                " *****   ",
                "*        ",
                "*        ",
                " *****   ",
                "      *  ",
                "      *  ",
                " *****   "
        });
        printBanner(O,O,P,S);
    }
    public static void printBanner(BannerCharacter c1,BannerCharacter c2,BannerCharacter c3,BannerCharacter c4) {
        for (int i=0;i<7;i++) {
            System.out.println(c1.getPattern()[i]+c2.getPattern()[i]+c3.getPattern()[i]+c4.getPattern()[i]);
        }
    }
}
