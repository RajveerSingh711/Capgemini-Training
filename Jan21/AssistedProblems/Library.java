package Jan21.AssistedProblems;

/*Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
*/

import java.util.*;

class Book{
    private String author,title;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void displayBook(){
        System.out.println("Title: "+title+", Author: "+author);
    }
}
public class Library {
    private String libraryName;
    ArrayList<Book> books;
    public Library(String libraryName){
        this.libraryName=libraryName;
        this.books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        System.out.println("Library: "+libraryName);
        for(Book book:books){
            book.displayBook();
        }
    }
    public static void main(String[] args){
        Book b1=new Book("Clean Code","Robert C. Martin");
        Book b2=new Book("Effective Java","Joshua Bloch");
        Library lib1=new Library("City Library");
        Library lib2=new Library("College Library");
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib1.displayBooks();
        System.out.println();
        lib2.displayBooks();
    }
}
