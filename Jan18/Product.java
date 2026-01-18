package Jan18;

/*Create a Product class to manage shopping cart items with the following features:
Static:
○       A static variable discount shared by all products.
○       A static method updateDiscount() to modify the discount percentage.
This:
○       Use this to initialize productName, price, and quantity in the constructor.
Final:
○       Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
○       Validate whether an object is an instance of the Product class before processing its details.
*/

import java.util.*;

public class Product{
    static double discount=10.0;
    static void updateDiscount(double newDiscount){
        discount=newDiscount;
        System.out.println("Discount updated to "+discount+"%");
    }
    private String productName;
    private double price;
    private int quantity;
    private final int productID;
    Product(String productName,int productID,double price,int quantity){
        this.productName=productName;
        this.productID=productID;
        this.price=price;
        this.quantity=quantity;
    }
    void processProduct(Object obj){
        if(obj instanceof Product){
            Product p=(Product) obj;
            double totalPrice=p.price*p.quantity;
            double discountAmount=totalPrice*discount/100;
            double finalPrice=totalPrice-discountAmount;
            System.out.println("Product ID: "+p.productID);
            System.out.println("Product Name: "+p.productName);
            System.out.println("Price per unit: ₹"+p.price);
            System.out.println("Quantity: "+p.quantity);
            System.out.println("Discount: "+discount+"%");
            System.out.println("Final Price: ₹"+finalPrice);
        }else{
            System.out.println("Object is not a Product instance.");
        }
    }
    public static void main(String[] args){
        Product p1 = new Product("Laptop",201,60000,1);
        Product p2 = new Product("Headphones",202,3000,2);
        Product.updateDiscount(15);
        System.out.println();
        p1.processProduct(p1);
        System.out.println();
        p2.processProduct(p2);
    }
}
