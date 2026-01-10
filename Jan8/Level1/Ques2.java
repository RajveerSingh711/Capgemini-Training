package Jan8.Level1;

/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint =>
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.*;

public class Ques2 {
    public static String substringUsingCharAt(String s,int start,int end){
        String result="";
        for(int i=start;i<end;i++) result+=s.charAt(i);
        return result;
    }
    public static boolean compareUsingCharAt(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=sc.nextInt();
        int j =sc.nextInt();
        String sub1=substringUsingCharAt(s,i,j);
        String sub2=s.substring(i,j);
        System.out.println("Substring using charAt(): "+sub1);
        System.out.println("Substring using substring(): "+sub2);
        System.out.println("Both substrings same: "+compareUsingCharAt(sub1,sub2));
    }
}
