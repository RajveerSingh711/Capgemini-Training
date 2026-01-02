package Jan2.Level2;

/*Rewrite the program 4 FizzBuzz using the while loop
*/

import java.util.*;

public class Ques5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.print(n+" is not a positive integer");
        }else{
            int i=1;
            while(i<=n){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }else if(i%3==0){
                    System.out.println("Fizz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
