package Jan16.Level1;

/*Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
*/

import java.util.*;

public class Book {
    String title;
    String author;
    double price;
    Book(){
        System.out.println("Default constructor called!");
        title="";
        author="";
        price=0;
    }
    Book(String t,String a,double p){
        this.title=t;
        this.author=a;
        this.price=p;
    }
    void display(){
        System.out.println("Title  : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price  : ₹"+price);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Book b=new Book();
        b.display();
        String t=sc.nextLine(),a=sc.nextLine();
        double p=sc.nextDouble();
        Book b2=new Book(t,a,p);
        b2.display();
    }
}
