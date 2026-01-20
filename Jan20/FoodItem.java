package Jan20;

/*6. Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism to handle different types of food items in a single order-processing method.
*/

import java.util.*;

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    FoodItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if (quantity>0){
            this.quantity=quantity;
        }
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails(){
        System.out.println("Item: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
}
class VegItem extends FoodItem implements Discountable{
    VegItem(String name,double price,int qty){
        super(name,price,qty);
    }
    @Override
    public double calculateTotalPrice(){
        return getPrice()*getQuantity();
    }
    @Override
    public double applyDiscount(){
        return calculateTotalPrice()*0.10;
    }
    @Override
    public String getDiscountDetails(){
        return "10% discount on Veg Items";
    }
}
class NonVegItem extends FoodItem implements Discountable{
    NonVegItem(String name,double price,int qty){
        super(name,price,qty);
    }
    @Override
    public double calculateTotalPrice(){
        return (getPrice()*getQuantity())+50;
    }
    @Override
    public double applyDiscount(){
        return calculateTotalPrice()*0.05;
    }
    @Override
    public String getDiscountDetails(){
        return "5% discount on Non-Veg Items";
    }
    public static void main(String[] args){
        List<FoodItem> order=new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala",250,2));
        order.add(new NonVegItem("Chicken Biryani",300,1));
        processOrder(order);
    }
    static void processOrder(List<FoodItem> order){
        for(FoodItem item:order){
            item.getItemDetails();
            double total=item.calculateTotalPrice();
            double discount=0;
            if(item instanceof Discountable){
                Discountable d=(Discountable)item;
                discount=d.applyDiscount();
                System.out.println("Discount: "+discount);
                System.out.println("Discount Info: "+d.getDiscountDetails());
            }
            System.out.println("Final Price: "+(total-discount));
            System.out.println("------------------------");
        }
    }
}
