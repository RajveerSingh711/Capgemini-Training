package Jan9;

/*Remove vowels from a string*/

import java.util.*;

public class Ques17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String vowels="AEIOUaeiou";
        String ans="";
        for(char ch:s.toCharArray()){
            if(vowels.indexOf(ch)==-1) ans+=ch;
        }
        System.out.print(ans);
    }
}
