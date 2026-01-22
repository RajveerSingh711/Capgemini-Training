package Jan8.Level2;

/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint =>
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.*;

public class Ques6 {
    static String checkCharacterType(char ch){
        String vowels="AEIOUaeiou";
        if(!((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))) return "Not a Letter";
        if(vowels.indexOf(ch)!=-1) return "Vowel";
        return "Consonant";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[][]=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[i][0]=String.valueOf(ch);
            arr[i][1]=checkCharacterType(ch);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][0]+"\t\t"+arr[i][1]);
        }
    }
}
