package Jan19.MultilevelInheritance;

/*Sample Problem 1: Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
*/

import java.util.*;

class Order{
    protected int orderId;
    protected String orderDate;
    Order(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    String getOrderStatus(){
        return "Order Placed";
    }
}
class ShippedOrder extends Order{
    protected String trackingNumber;
    ShippedOrder(int orderId,String orderDate,String trackingNumber) {
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;
    DeliveredOrder(int orderId,String orderDate,String trackingNumber,String deliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    String getOrderStatus(){
        return "Order Delivered on "+deliveryDate;
    }
    public static void main(String[] args){
        Order o1=new Order(101,"2026-01-10");
        Order o2=new ShippedOrder(102,"2026-01-11","TRK12345");
        Order o3=new DeliveredOrder(103,"2026-01-12","TRK67890","2026-01-15");
        System.out.println("Order 1 Status: "+o1.getOrderStatus());
        System.out.println("Order 2 Status: "+o2.getOrderStatus());
        System.out.println("Order 3 Status: "+o3.getOrderStatus());
    }
}