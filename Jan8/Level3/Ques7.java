package Jan8.Level3;

/*Write a program to to check if a text is palindrome and display the result
Hint =>
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of the string to determine whether the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end of the text passed as parameters using recursion. The logic used here is as follows:
First, check if the start index is greater than or equal to the end index, then return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and the end index
Logic 3: Write a Method to compare the characters from the start and end of the text using character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using the charAt() method and return the reversal array.
Create a character array using the String method toCharArray() and also create a reverse array. Compare the characters in the original and reverse arrays to do a Palindrome check
Finally, in the main method do palindrome check using the three logic and display result
*/

import java.util.*;

public class Ques7 {
    static boolean iterationApproach(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static boolean recursiveApproach(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return recursiveApproach(s,i+1,j-1);
    }
    static String reverseString(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;
    }
    static boolean charArrayApproach(String s){
        char[] original=s.toCharArray();
        char[] reverse=reverseString(s).toCharArray();
        for(int i=0;i<original.length;i++){
            if(original[i]!=reverse[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Logic 1 (Iterative): "+iterationApproach(s));
        System.out.println("Logic 2 (Recursive): "+recursiveApproach(s,0,s.length()-1));
        System.out.println("Logic 3 (Char Array): "+charArrayApproach(s));
    }
}
