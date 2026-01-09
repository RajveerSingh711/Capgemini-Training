package Jan9;

/*Generate Fibonacci series up to N terms*/

import java.util.*;

public class Ques8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) System.out.println(0);
        else if(n==2) System.out.println("0 1");
        else {
            int a = 0;
            int b = 1;
            System.out.print("0 1 ");
            int c;
            for(int i=2;i<n;i++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
