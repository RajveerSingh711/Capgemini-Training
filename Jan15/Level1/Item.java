package Jan15.Level1;

/*Program to Track Inventory of Items
Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.
*/

import java.util.*;

public class Item {
    int itemCode;
    String itemName;
    double price;
    void display(int quantity){
        System.out.println("Item Code: "+itemCode);
        System.out.println("Item Name: "+itemName);
        System.out.println("Price per Item: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Cost: "+(price*quantity));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Item i=new Item();
        i.itemCode=sc.nextInt();
        sc.nextLine();
        i.itemName=sc.nextLine();
        i.price=sc.nextDouble();
        int quantity=sc.nextInt();
        i.display(quantity);
    }
}
