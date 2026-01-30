package Jan30;

/*Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
Approach:
Initialize an empty StringBuilder and a HashSet to keep track of characters.
Iterate over each character in the string:
If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
Return the StringBuilder as a string without duplicates.
*/

import java.util.*;

public class Ques2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }
        System.out.println(sb.toString());
    }
}
