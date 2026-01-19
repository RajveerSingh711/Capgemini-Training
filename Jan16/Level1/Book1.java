package Jan16.Level1;

/*Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
*/

import java.util.*;

public class Book1 {
    String title;
    String author;
    double price;
    boolean availability;
    Book1(String t,String a,double p){
        this.title=t;
        this.author=a;
        this.price=p;
        availability=true;
    }
    void borrowBook(){
        if(availability){
            availability=false;
            System.out.println("Book borrowed successfully.");
        }else System.out.println("Book is not available.");
    }
    void display(){
        System.out.println("Title: "+title+" | Author: "+author+" | Price: ₹"+price+" | Available: "+availability);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String t=sc.nextLine(),a=sc.nextLine();
        double p=sc.nextDouble();
        Book1 b=new Book1(t,a,p);
        b.borrowBook();
        b.display();
        Book1 b1=new Book1(t,a,p);
        b1.display();
    }
}
