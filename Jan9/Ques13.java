package Jan9;

/*Replace spaces with hyphens in a string*/

import java.util.*;

public class Ques13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(char ch:s.toCharArray()){
            if(ch==' ') ans+='-';
            else ans+=ch;
        }
        System.out.print(ans);
    }
}
