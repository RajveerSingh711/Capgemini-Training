package Jan8.Level3;

/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint =>
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies.
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.
*/

import java.util.*;

public class Ques5 {
    public static char[] uniqueCharacters(String s){
        int len=s.length();
        char[] temp=new char[len];
        int k=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            boolean unique=true;
            for(int j=0;j<i;j++){
                if(ch==s.charAt(j)){
                    unique=false;
                    break;
                }
            }
            if(unique) temp[k++]=ch;
        }
        char[] uniqueChars=new char[k];
        for(int i=0;i<k;i++) uniqueChars[i]=temp[i];

        return uniqueChars;
    }
    public static String[][] frequencyUsingUnique(String s){
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        char[] unique=uniqueCharacters(s);
        String[][] result=new String[unique.length][2];
        for(int i=0;i<unique.length;i++){
            result[i][0]=String.valueOf(unique[i]);
            result[i][1]=String.valueOf(freq[unique[i]]);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] res=frequencyUsingUnique(s);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i][0]+" "+res[i][1]);
        }
    }
}
