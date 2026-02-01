package Feb1;

/*Implement a Shopping Cart
Description:
Use HashMap to store product prices.
Use LinkedHashMap to maintain the order of items added.
Use TreeMap to display items sorted by price.
*/

import java.util.*;

public class ShoppingCart {
    static class CartManager{
        private Map<String,Double> priceMap=new HashMap<>();
        private Map<String,Double> cartOrderMap=new LinkedHashMap<>();
        public void addProduct(String product,double price){
            priceMap.put(product,price);
            cartOrderMap.put(product,price);
        }
        public void displayCartOrder(){
            System.out.println("Cart items (added order):");
            cartOrderMap.forEach((product,price)->System.out.println(product+" : ₹"+price));
        }
        public void displaySortedByPrice(){
            System.out.println("Cart items (sorted by price):");
            Map<Double,List<String>> sortedMap=new TreeMap<>();
            for(Map.Entry<String,Double> entry:priceMap.entrySet()){
                sortedMap.computeIfAbsent(entry.getValue(),p->new ArrayList<>()).add(entry.getKey());
            }
            for(Map.Entry<Double, List<String>> entry:sortedMap.entrySet()) {
                for(String product:entry.getValue()) System.out.println(product+" : ₹"+entry.getKey());
            }
        }
    }
    public static void main(String[] args){
        CartManager cart=new CartManager();
        cart.addProduct("Apple",30);
        cart.addProduct("Banana",10);
        cart.addProduct("Milk",50);
        cart.addProduct("Bread",30);
        System.out.println();
        cart.displayCartOrder();
        System.out.println();
        cart.displaySortedByPrice();
    }
}
