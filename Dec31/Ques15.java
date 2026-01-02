package Dec31;

/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/

import java.util.*;

public class Ques15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int quantity=sc.nextInt();
        int totalPrice=price*quantity;
        System.out.print("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+price);
    }
}
