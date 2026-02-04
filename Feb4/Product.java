package Feb4;

/*Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
*/

import java.util.*;

interface Category{
    String getCategoryName();
}
class BookCategory implements Category{
    public String getCategoryName(){
        return "Books";
    }
}
class ClothingCategory implements Category{
    public String getCategoryName(){
        return "Clothing";
    }
}
class GadgetCategory implements Category{
    public String getCategoryName(){
        return "Gadgets";
    }
}
public class Product<T extends Category>{
    private String name;
    private double price;
    private T category;
    public Product(String name,double price,T category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void display() {
        System.out.println("Product: "+name+", Category: "+category.getCategoryName()+", Price: ₹"+price);
    }
}
class DiscountUtil{
    public static <T extends Product<?>> void applyDiscount(T product,double percentage){
        double discountedPrice=product.getPrice()-(product.getPrice()*percentage/100);
        product.setPrice(discountedPrice);
    }
}
class ProductCatalog{
    private List<Product<?>> catalog=new ArrayList<>();
    public void addProduct(Product<?> product){
        catalog.add(product);
    }
    public void showCatalog(){
        for(Product<?> product:catalog) product.display();
    }
    public static void main(String[] args){
        Product<BookCategory> book=new Product<>("Java Guide",500,new BookCategory());
        Product<ClothingCategory> shirt=new Product<>("T-Shirt",1200,new ClothingCategory());
        Product<GadgetCategory> phone=new Product<>("Smartphone",25000,new GadgetCategory());
        ProductCatalog catalog=new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);
        DiscountUtil.applyDiscount(book,10);
        DiscountUtil.applyDiscount(phone,5);
        catalog.showCatalog();
    }
}
