package Jan8.Level2;

/*Write a program to find and return the length of a string without using the length() method
Hint =>
Take user input using the Scanner next() method
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

import java.util.*;

public class Ques1 {
    public static int findLength(String s){
        int cnt=0;
        try{
            while(true){
                s.charAt(cnt);
                cnt++;
            }
        }catch(StringIndexOutOfBoundsException e){
            return cnt;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int customLength=findLength(s);
        int builtInLength=s.length();
        System.out.println("Length using custom method: "+customLength);
        System.out.println("Length using length(): "+builtInLength);
    }
}
