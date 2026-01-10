package Jan9;

//Remove all special characters from a string

import java.util.*;

public class Ques29 {
    public static void main(String[] args){
        String specialChars="{}[]();:<>=+-*/%&|!~@#$^*_";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(char ch:s.toCharArray()){
            if(specialChars.indexOf(ch)==-1) ans+=ch;
        }
        System.out.println(ans);
    }
}
