package Jan9;

/*Find GCD (HCF) and LCM of two numbers*/

import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt();
        int x=num1,y=num2;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        int lcm=(num1*num2)/gcd;
        System.out.println("GCD = "+gcd);
        System.out.println("LCM = "+lcm);
    }
}
