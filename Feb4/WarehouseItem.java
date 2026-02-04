package Feb4;

/*You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
*/

import java.util.*;

public abstract class WarehouseItem {
    private String name;
    public WarehouseItem(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void displayInfo();
}
class Electronics extends WarehouseItem{
    private int warrantyYears;
    public Electronics(String name,int warrantyYears){
        super(name);
        this.warrantyYears=warrantyYears;
    }
    @Override
    public void displayInfo() {
        System.out.println("Electronics: "+getName()+", Warranty: "+warrantyYears+" years");
    }
}
class Groceries extends WarehouseItem{
    private String expiryDate;
    public Groceries(String name,String expiryDate){
        super(name);
        this.expiryDate=expiryDate;
    }
    @Override
    public void displayInfo(){
        System.out.println("Groceries: "+getName()+", Expiry: "+expiryDate);
    }
}
class Furniture extends WarehouseItem{
    private String material;
    public Furniture(String name,String material){
        super(name);
        this.material=material;
    }
    @Override
    public void displayInfo(){
        System.out.println("Furniture: "+getName()+", Material: "+material);
    }
}
class Storage<T extends WarehouseItem>{
    private List<T> items=new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }
    public T getItem(int index){
        return items.get(index);
    }
    public List<T> getAllItems(){
        return items;
    }
}
class WarehouseUtil{
    public static void displayAllItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item:items) {
            item.displayInfo();
        }
    }
    public static void main(String[] args){
        Storage<Electronics> electronicsStorage=new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop",2));
        electronicsStorage.addItem(new Electronics("Smartphone",1));
        Storage<Groceries> groceryStorage=new Storage<>();
        groceryStorage.addItem(new Groceries("Milk","10-Feb-2026"));
        groceryStorage.addItem(new Groceries("Rice","01-Jan-2027"));
        Storage<Furniture> furnitureStorage=new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair","Wood"));
        furnitureStorage.addItem(new Furniture("Table","Steel"));
        System.out.println("=== Electronics ===");
        WarehouseUtil.displayAllItems(electronicsStorage.getAllItems());
        System.out.println("\n=== Groceries ===");
        WarehouseUtil.displayAllItems(groceryStorage.getAllItems());
        System.out.println("\n=== Furniture ===");
        WarehouseUtil.displayAllItems(furnitureStorage.getAllItems());
    }
}