package Jan8.Level1;

/*Write a program to convert the complete text to uppercase and compare the results
Hint =>
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result
*/

import java.util.*;

public class Ques9{
    static String convertToUpperCase(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z') ch=(char)(ch-32);
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
        String s1=convertToUpperCase(s);
        String s2=s.toUpperCase();
        boolean result=compare(s1,s2);
        System.out.println("Manual Uppercase   : "+s1);
        System.out.println("Built-in Uppercase : "+s2);
        System.out.println("Are both equal?    : "+result);
        sc.close();
    }
}
