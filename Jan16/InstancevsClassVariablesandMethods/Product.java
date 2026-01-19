package Jan16.InstancevsClassVariablesandMethods;

/*Problem 1: Product Inventory
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
*/

import java.util.*;

public class Product{
    String productName;
    double price;
    static int totalProducts=0;
    Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    void displayProductDetails() {
        System.out.println("Product Name: "+productName);
        System.out.println("Price: ₹"+price);
    }
    static void displayTotalProducts() {
        System.out.println("Total Products Created: "+totalProducts);
    }
    public static void main(String[] args){
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 799);
        Product p3 = new Product("Keyboard", 1299);
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        Product.displayTotalProducts();
    }
}
