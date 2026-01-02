package Dec29;

/*
 * UC5: Use Map for Character Patterns and Render via Function
 *
 * Question:
 * Write a Java program that stores character patterns using a Map data structure.
 * The program should map each character to its banner pattern and use a rendering
 * function to display the word "OOPS" on the console.
 *
 * Goal:
 * To enable efficient lookup and reuse of character patterns using a HashMap,
 * improving scalability and code maintainability.
 *
 * Flow:
 * 1. Define a BannerCharacter class to store character and pattern.
 * 2. Store BannerCharacter objects inside a Map.
 * 3. Use the map to fetch patterns and render the banner.
 * 4. Display the output and exit the program.
 */

import java.util.*;

public class UC5 {
    static class BannerCharacter {
        private char character;
        private String[] pattern;
        public BannerCharacter(char character,String[] pattern) {
            this.character=character;
            this.pattern=pattern;
        }
        public char getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static void main(String[] args) {
        Map<Character, BannerCharacter> bannerMap=buildCharacterMap();
        printBanner("OOPS",bannerMap);
    }
    public static Map<Character,BannerCharacter> buildCharacterMap() {
        Map<Character,BannerCharacter> map=new HashMap<>();
        map.put('O',new BannerCharacter('O',new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                "*     *  ",
                " *****   "
        }));
        map.put('P',new BannerCharacter('P',new String[]{
                " *****   ",
                "*     *  ",
                "*     *  ",
                " *****   ",
                "*        ",
                "*        ",
                "*        "
        }));
        map.put('S',new BannerCharacter('S',new String[]{
                " *****   ",
                "*        ",
                "*        ",
                " *****   ",
                "      *  ",
                "      *  ",
                " *****   "
        }));
        return map;
    }
    public static void printBanner(String text,Map<Character,BannerCharacter> map) {
        for (int row= 0;row<7;row++) {
            for (char ch:text.toCharArray()) {
                BannerCharacter bc=map.get(ch);
                System.out.print(bc.getPattern()[row]);
            }
            System.out.println();
        }
    }
}
