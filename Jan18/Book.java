package Jan18;

/*Create a Book class to manage library books with the following features:
Static:
○       A static variable libraryName shared across all books.
○       A static method displayLibraryName() to print the library name.
This:
○       Use this to initialize title, author, and isbn in the constructor.
Final:
○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
○       Verify if an object is an instance of the Book class before displaying its details.
*/

import java.util.*;

public class Book {
    static String libraryName="Central City Library";
    static void displayLibraryName(){
        System.out.println("Library Name: "+libraryName);
    }
    private String title;
    private String author;
    private final String isbn;
    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    void displayDetails(Object obj){
        if(obj instanceof Book){
            Book book=(Book) obj;
            System.out.println("Library Name: "+libraryName);
            System.out.println("Title: "+book.title);
            System.out.println("Author: "+book.author);
            System.out.println("ISBN: "+book.isbn);
        }else{
            System.out.println("Object is not a Book instance.");
        }
    }
    public static void main(String[] args){
        Book b1=new Book("Clean Code","Robert C. Martin","978-0132350884");
        Book b2=new Book("Effective Java","Joshua Bloch","978-0134685991");
        Book.displayLibraryName();
        System.out.println();
        b1.displayDetails(b1);
        System.out.println();
        b2.displayDetails(b2);
        System.out.println();
    }
}
