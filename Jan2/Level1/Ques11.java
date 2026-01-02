package Jan2.Level1;

/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint =>
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
 */

import java.util.*;

public class Ques11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        double no;
        while (true){
            no=sc.nextDouble();
            if(no<=0){
                break;
            }
            total+=no;
        }
        System.out.println("Total sum = " + total);
    }
}
