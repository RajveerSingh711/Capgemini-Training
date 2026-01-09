package Jan9;

/*Count the number of vowels in a string*/

import java.util.*;

public class Ques1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        String vowels="AEIOUaeiou";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(vowels.indexOf(ch)!=-1) count++;
        }
        System.out.println(count);
    }
}
