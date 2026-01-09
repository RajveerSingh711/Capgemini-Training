package Jan9;

/*Check if a number is a palindrome*/

import java.util.*;

public class Ques3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        int temp=n;
        while(temp>0){
            reverse=reverse*10+temp%10;
            temp/=10;
        }
        if(reverse==n) System.out.print("The number "+n+" is a palindrome");
        else System.out.print("The number "+n+" is not a palindrome");
    }
}
