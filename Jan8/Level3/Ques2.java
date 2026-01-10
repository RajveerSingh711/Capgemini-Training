package Jan8.Level3;

/*Find unique characters in a string using the charAt() method and display the result
Hint =>
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/

import java.util.*;

public class Ques2 {
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
    public static char[] findUniqueChars(String s){
        int len=findLength(s);
        char[] temp=new char[len];
        int k=0;
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            boolean isUnique=true;
            for(int j=0;j<i;j++){
                if(ch==s.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique) temp[k++]=ch;
        }
        char[] unique=new char[k];
        for(int i=0;i<k;i++) unique[i]=temp[i];
        return unique;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] result=findUniqueChars(s);
        for(char c:result) System.out.print(c);
    }
}
