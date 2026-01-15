package Jan15.Level2;

/*Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.
*/

import java.util.*;

public class PalindromeChecker {
    String text;
    boolean isPalindrome;
    void checkPalindrome(){
        int start=0;
        int end=text.length()-1;
        isPalindrome=true;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
    }
    void display() {
        if(isPalindrome) System.out.println("The string is a Palindrome");
        else System.out.println("The string is NOT a Palindrome");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PalindromeChecker p=new PalindromeChecker();
        p.text=sc.nextLine();
        p.display();
    }
}
