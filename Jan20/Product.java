package Jan20;

/* E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
*/

import java.util.*;

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
public abstract class Product {
    private int productId;
    private String name;
    private double price;
    Product(int id,String name,double price){
        this.productId=id;
        this.name=name;
        this.price=price;
    }
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public abstract double calculateDiscount();
    public void displayDetails() {
        System.out.println("Product ID: "+productId);
        System.out.println("Name: "+name);
        System.out.println("Base Price: "+price);
    }
}
class Electronics extends Product implements Taxable{
    Electronics(int id,String name,double price){
        super(id,name,price);
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*0.10;
    }
    @Override
    public double calculateTax(){
        return getPrice()*0.18;
    }
    @Override
    public String getTaxDetails(){
        return "18% GST on Electronics";
    }
}
class Clothing extends Product implements Taxable{
    Clothing(int id,String name,double price){
        super(id,name,price);
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*0.20;
    }
    @Override
    public double calculateTax(){
        return getPrice()*0.05;
    }
    @Override
    public String getTaxDetails(){
        return "5% GST on Clothing";
    }
}
class Groceries extends Product{
    Groceries(int id,String name,double price){
        super(id,name,price);
    }
    @Override
    public double calculateDiscount(){
        return getPrice()*0.10;
    }
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Electronics(101,"Laptop",60000));
        products.add(new Clothing(102,"Jacket",3000));
        products.add(new Groceries(103,"Rice",1200));
        calculateFinalPrice(products);
    }
    static void calculateFinalPrice(List<Product> products){
        for (Product p:products){
            double tax = 0;
            if(p instanceof Taxable){
                tax=((Taxable)p).calculateTax();
            }
            double discount=p.calculateDiscount();
            double finalPrice=p.getPrice()+tax-discount;
            p.displayDetails();
            System.out.println("Discount: "+discount);
            System.out.println("Tax: "+tax);
            System.out.println("Final Price: "+finalPrice);
            System.out.println("----------------------");
        }
    }
}