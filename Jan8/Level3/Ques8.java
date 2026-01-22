package Jan8.Level3;

/*Write a program to check if two texts are anagrams and display the result
Hint =>
An anagram is a word or phrase formed by rearranging the same letters to form different words or phrases,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result.
*/

import java.util.*;

public class Ques8 {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        for (int i=0;i<s1.length();i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        for(int i=0;i<256;i++) {
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(isAnagram(s1,s2)) System.out.println("The texts are Anagrams.");
        else System.out.println("The texts are NOT Anagrams.");

    }
}