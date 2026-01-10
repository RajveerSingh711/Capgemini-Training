package Jan9;

/*Check if a string is a pangram*/

import java.util.*;

public class Ques7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        boolean isPanagram=true;
        for(char ch='a';ch<='z';ch++){
            if(s.indexOf(ch)==-1){
                isPanagram=false;
                break;
            }
        }
        if(isPanagram) System.out.println("String is panagram");
        else System.out.println("String is not panagram");
    }
}
