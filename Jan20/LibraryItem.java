package Jan20;

/*5. Library Management System
Description: Develop a library management system:
Use an abstract class LibraryItem with fields like itemId, title, and author.
Add an abstract method getLoanDuration() and a concrete method getItemDetails().
Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
Implement an interface Reservable with methods reserveItem() and checkAvailability().
Apply encapsulation to secure details like the borrower’s personal data.
Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

import java.util.*;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}
public abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;
    private String borrowerName;
    LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    public int getItemId(){
        return itemId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void setBorrowerName(String borrowerName){
        this.borrowerName=borrowerName;
    }
    public abstract int getLoanDuration();
    public void getItemDetails(){
        System.out.println("Item ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
}
class Book extends LibraryItem implements Reservable{
    private boolean isAvailable=true;
    Book(int id,String title,String author){
        super(id,title,author);
    }
    @Override
    public int getLoanDuration(){
        return 21;
    }
    @Override
    public void reserveItem(){
        isAvailable=false;
        System.out.println("Book reserved successfully");
    }
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
}
class Magazine extends LibraryItem implements Reservable{
    private boolean isAvailable=true;
    Magazine(int id,String title,String author){
        super(id,title,author);
    }
    @Override
    public int getLoanDuration(){
        return 7;
    }
    @Override
    public void reserveItem(){
        isAvailable=false;
        System.out.println("Magazine reserved successfully");
    }
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
}
class DVD extends LibraryItem implements Reservable{
    private boolean isAvailable=true;
    DVD(int id,String title,String author){
        super(id,title,author);
    }
    @Override
    public int getLoanDuration(){
        return 3;
    }
    @Override
    public void reserveItem(){
        isAvailable=false;
        System.out.println("DVD reserved successfully");
    }
    @Override
    public boolean checkAvailability(){
        return isAvailable;
    }
    public static void main(String[] args){
        List<LibraryItem> items=new ArrayList<>();
        items.add(new Book(101,"Java Programming","James Gosling"));
        items.add(new Magazine(102,"Tech Monthly","Editorial Team"));
        items.add(new DVD(103,"Inception","Christopher Nolan"));
        for(LibraryItem item:items){
            item.getItemDetails();
            System.out.println("Loan Duration: "+item.getLoanDuration()+" days");
            if(item instanceof Reservable){
                Reservable r=(Reservable)item;
                System.out.println("Available: "+r.checkAvailability());
                r.reserveItem();
                System.out.println("Available after reservation: "+r.checkAvailability());
            }
            System.out.println("------------------------");
        }
    }
}