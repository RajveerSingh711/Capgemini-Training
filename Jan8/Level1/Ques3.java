package Jan8.Level1;

/*Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint =>
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray()
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/

import java.util.*;

public class Ques3 {
    public static String createSubstring(String s,int start,int end){
        String sub="";
        for(int i=start;i<end;i++) sub+=s.charAt(i);
        return sub;
    }
    public static boolean compareStrings(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=sc.nextInt(),j=sc.nextInt();
        String subCharAt=createSubstring(s,i,j);
        String subBuiltIn=s.substring(i,j);
        System.out.println("Substring using charAt(): "+subCharAt);
        System.out.println("Substring using substring(): "+subBuiltIn);
        System.out.println("Both substrings same: "+compareStrings(subCharAt,subBuiltIn));
    }
}
