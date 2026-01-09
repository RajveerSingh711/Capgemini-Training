package Jan9;

/*Find factorial of a number*/

import java.util.*;

public class Ques19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=n;i++) factorial*=i;
        System.out.print("Factorial of "+n+" is "+factorial);
    }
}
