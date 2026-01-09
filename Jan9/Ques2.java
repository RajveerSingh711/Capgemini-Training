package Jan9;

/*Reverse words in a sentence*/

import java.util.*;

public class Ques2 {
    public static String reverse(String s){
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.trim().split("\\s+");
        for(int i=0;i<words.length;i++){
            words[i]=reverse(words[i]);
        }
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]);
            if(i!= words.length-1){
                System.out.print(" ");
            }
        }
    }
}
