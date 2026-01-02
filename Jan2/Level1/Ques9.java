package Jan2.Level1;

/*Rewrite program 8 to do the countdown using the for-loop
*/

import java.util.*;

public class Ques9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}
