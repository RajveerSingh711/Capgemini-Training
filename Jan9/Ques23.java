package Jan9;

/*Sum of even-position digits*/

import java.util.*;

public class Ques23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        int count=0;
        while(temp>0){
            int digit=temp%10;
            if(count%2==0) sum+=digit;
            temp/=10;
            count++;
        }
        System.out.println("The sum of even position digit of "+n+" is "+sum);
    }
}
