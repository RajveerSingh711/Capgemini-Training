package Jan9;

/* Check if two strings are anagrams*/

import java.util.*;

public class Ques24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagrams");
            return;
        }
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
