package Jan9;

//Print ASCII values of characters

import java.util.*;

public class Ques27 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for (char ch:s.toCharArray()){
            System.out.println(ch+" -> "+(int)ch);
        }
    }
}
