package Jan8.Level1;

/*Write a program to convert the complete text to lowercase and compare the results
Hint =>
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result
*/

import java.util.*;

public class Ques10{
    static String convertToLowerCase(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z') ch=(char)(ch+32);
            result+=ch;
        }
        return result;
    }
    static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String s1= convertToLowerCase(s);
        String s2=s.toLowerCase();
        boolean result=compare(s1,s2);
        System.out.println("Manual Lowercase   : "+s1);
        System.out.println("Built-in Lowercase : "+s2);
        System.out.println("Are both equal?    : "+result);
        sc.close();
    }
}
