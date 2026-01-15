package Jan15.Level1;

/*Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.
*/

import java.util.*;

public class Book {
    String title,author;
    double price;
    void display(){
        System.out.println("Book Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Book b=new Book();
        b.title=sc.nextLine();
        b.author=sc.nextLine();
        b.price=sc.nextDouble();
        b.display();
    }
}
