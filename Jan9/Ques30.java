package Jan9;

//Capitalize first letter of each word

import java.util.*;

public class Ques30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        String ans="";
        for(String word:words){
            if(word.length()>0) ans+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.print(ans);
    }
}
