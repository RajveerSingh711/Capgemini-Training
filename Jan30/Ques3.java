package Jan30;

/*You are given an array of strings. Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
Approach:
Create a new StringBuffer object.
Iterate through each string in the array and append it to the StringBuffer.
Return the concatenated string after the loop finishes.
Using StringBuffer ensures efficient string concatenation due to its mutable nature.
*/

import java.util.*;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++) words[i]=sc.next();
        StringBuffer sb=new StringBuffer();
        for(String word:words) sb.append(word);
        System.out.println(sb.toString());
    }
}
