package Jan9;

/*Check for prime number*/

import java.util.*;

public class Ques11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1) System.out.println("Not a prime number");
        else{
            boolean check=true;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    check=false;
                    break;
                }
            }
            if(check) System.out.println("It is a prime number");
            else System.out.println("Not a prime number");
        }
    }
}
