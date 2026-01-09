package Jan9;

/*Check if a number is Armstrong*/

import java.util.*;

public class Ques9 {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp>0){
            count++;
            temp/=10;
        }
        int sum=0;
        temp=n;
        while(temp>0){
            sum+=Math.pow(temp%10,count);
            temp/=10;
        }
        if(sum==n) System.out.println(n+" is a Armstrong number");
        else System.out.println(n+" is not a Armstrong number");
    }
}
