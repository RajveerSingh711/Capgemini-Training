package Jan9;

/*Sum of digits of a number*/

import java.util.*;

public class Ques6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("The sum of digit of "+n+" is "+sum);
    }
}
