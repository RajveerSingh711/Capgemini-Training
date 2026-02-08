package Feb7.Level2;

/*Problem Statement: You have a list of Sale objects with the following fields: productId,
quantity, and price. Write a method to perform the following operations:
1. Filter: Select sales where the quantity sold is greater than 10.
2. Transform: Create a new list of ProductSales objects containing productId and the
total revenue (quantity * price) for each product.
3. Sort: Sort the products by total revenue in descending order.
4. Top N: Retrieve the top 5 products by total revenue.
 */

import java.util.*;
import java.util.stream.*;

public class Sale {
    private int productId;
    private int quantity;
    private double price;
    public Sale(int productId,int quantity,double price){
        this.productId=productId;
        this.quantity=quantity;
        this.price=price;
    }
    public int getProductId(){
        return productId;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    static class ProductSales{
        private int productId;
        private double totalRevenue;
        public ProductSales(int productId,double totalRevenue){
            this.productId=productId;
            this.totalRevenue=totalRevenue;
        }
        public int getProductId(){
            return productId;
        }
        public double getTotalRevenue(){
            return totalRevenue;
        }
        @Override
        public String toString(){
            return "ProductId: "+productId+", TotalRevenue: "+totalRevenue;
        }
    }
    public static void main(String[] args){
        List<Sale> sales=Arrays.asList(
                new Sale(101,15,100.0),
                new Sale(102,8,200.0),
                new Sale(103,20,50.0),
                new Sale(104,30,10.0),
                new Sale(105,12,300.0),
                new Sale(106,25,80.0),
                new Sale(107,18,120.0)
        );
        List<ProductSales> topProducts=sales.stream().filter(s->s.getQuantity()>10).map(s->new ProductSales(s.getProductId(),s.getQuantity()*s.getPrice())).sorted(Comparator.comparingDouble(ProductSales::getTotalRevenue).reversed()).limit(5).collect(Collectors.toList());
        topProducts.forEach(System.out::println);
    }
}
