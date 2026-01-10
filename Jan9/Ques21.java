package Jan9;

/*Count even and odd digits in a number*/

import java.util.*;

public class Ques21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd=0,even=0;
        int temp=n;
        while(temp>0){
            if(temp%2==0) even++;
            else odd++;
            temp/=10;
        }
        System.out.print("The number of odd and even digits in "+n+" are "+odd+" and "+even);
    }
}
