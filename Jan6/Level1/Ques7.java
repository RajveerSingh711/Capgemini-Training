package Jan6.Level1;

/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint =>
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/

import java.util.*;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<=0){
            System.out.println("Error: Not a natural number");
        }
        else {
            int evenArray[] = new int[number / 2 + 1];
            int oddArray[] = new int[number / 2 + 1];
            int evenIdx=0,oddIdx=0;
            for(int i=1;i<=number;i++){
                if(i%2==0) evenArray[evenIdx++]=i;
                else oddArray[oddIdx++]=i;
            }
            System.out.println("Output of odd Array:");
            for (int i = 0; i < oddArray.length; i++) {
                System.out.print(oddArray[i] + " ");
            }
            System.out.println();
            System.out.println("Output of even Array:");
            for (int i = 0; i < evenArray.length; i++) {
                if(evenArray[i]!=0) System.out.print(evenArray[i] + " ");
            }
        }
    }
}
