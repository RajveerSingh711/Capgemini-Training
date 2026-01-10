package Jan8.Level3;

/*Write a program to find the first non-repeating character in a string and show the result
Hint =>
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using the charAt() method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays result.
*/

import java.util.*;

public class Ques3 {
    public static char firstNonRepeatingChar(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]==1) return s.charAt(i);
        }
        return '\0';
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char res=firstNonRepeatingChar(s);
        if(res!='\0') System.out.println(res);
        else System.out.println("No non-repeating character");
    }
}
