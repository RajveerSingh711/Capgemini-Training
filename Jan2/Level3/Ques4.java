package Jan2.Level3;

/*Write a Program to check if the given n is a prime n or not
Hint =>
A n that can be divided exactly only by itself and 1 are Prime Ns,
Prime Ns checks are done for ns greater than 1
Loop through all the ns from 2 to the user input n and check if the reminder is zero. If the reminder is zero break out from the loop as the n is divisible by some other n and is not a prime n.
Use the isPrime boolean variable to store the result
*/

import java.util.*;

public class Ques4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+" is a Prime Number.");
        }else{
            System.out.println(n+" is NOT a Prime Number.");
        }
    }
}
