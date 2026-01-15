package Jan15.Level2;

/*Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.
*/

import java.util.*;

public class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String name,double price,int qty){
        this.itemName=name;
        this.price=price;
        this.quantity+=qty;
        System.out.println("Item added to cart.");
    }
    void removeItem(int qty){
        if (qty<=quantity){
            quantity-=qty;
            System.out.println("Item removed from cart.");
        } else System.out.println("Not enough items to remove.");
    }
    void display() {
        double total=price*quantity;
        System.out.println("Item Name: "+itemName);
        System.out.println("Price per Item: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Cost: "+total);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CartItem c=new CartItem();
        String name=sc.nextLine();
        double price=sc.nextDouble();
        int qtyAdd=sc.nextInt();
        c.addItem(name,price,qtyAdd);
        int qtyRemove=sc.nextInt();
        c.removeItem(qtyRemove);
        c.display();
    }
}
