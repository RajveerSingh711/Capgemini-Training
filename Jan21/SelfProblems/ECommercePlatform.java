package Jan21.SelfProblems;

/*Problem 4: E-commerce Platform with Orders, Customers, and Products
Description: Design an e-commerce platform with Order, Customer, and Product classes. Model relationships where a Customer places an Order, and each Order contains multiple Product objects.
Goal: Show communication and object relationships by designing a system where customers communicate through orders, and orders aggregate products.
*/

import java.util.*;

class Product{
    private String productName;
    private double price;
    Product(String productName,double price){
        this.productName=productName;
        this.price=price;
    }
    double getPrice(){
        return price;
    }
    String getProductName(){
        return productName;
    }
}
class Order{
    private int orderId;
    ArrayList<Product> products=new ArrayList<>();
    Order(int orderId){
        this.orderId=orderId;
    }
    void addProduct(Product product){
        products.add(product);
    }
    void showOrderDetails(){
        System.out.println("Order ID: "+orderId);
        double total=0;
        for (Product p:products){
            System.out.println("  Product: "+p.getProductName()+", Price: "+p.getPrice());
            total+=p.getPrice();
        }
        System.out.println("Total Amount: "+total);
    }
}
class Customer{
    private String name;
    ArrayList<Order> orders=new ArrayList<>();
    Customer(String name){
        this.name=name;
    }
    void placeOrder(Order order){
        orders.add(order);
        System.out.println("Customer "+name+" placed an order.");
    }
    void viewOrders(){
        System.out.println("Customer: "+name);
        for(Order o:orders){
            o.showOrderDetails();
        }
    }
}
public class ECommercePlatform{
    public static void main(String[] args){
        Customer customer=new Customer("Rahul");
        Product p1=new Product("Laptop",60000);
        Product p2=new Product("Mouse",500);
        Product p3=new Product("Keyboard",1500);
        Order order1=new Order(101);
        order1.addProduct(p1);
        order1.addProduct(p2);
        Order order2=new Order(102);
        order2.addProduct(p3);
        customer.placeOrder(order1);
        customer.placeOrder(order2);
        System.out.println();
        customer.viewOrders();
    }
}
