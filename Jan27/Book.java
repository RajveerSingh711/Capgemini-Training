package Jan27;

/*Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
Add a new book at the beginning, end, or at a specific position.
Remove a book by Book ID.
Search for a book by Book Title or Author.
Update a book’s Availability Status.
Display all books in forward and reverse order.
Count the total number of books in the library.
Hint:
Use a doubly linked list with two pointers (next and prev) in each node to facilitate traversal in both directions.
Ensure that when removing a book, both the next and prev pointers are correctly updated.
Displaying in reverse order will require traversal from the last node using prev pointers.
 */

import java.util.*;

class Book {
    int bookId;
    String title;
    String author;
    String genre;
    boolean available;
    Book next;
    Book prev;
    Book(int bookId,String title,String author,String genre,boolean available){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.available=available;
        this.next=null;
        this.prev=null;
    }
}

class LibraryDoublyLinkedList{
    Book head;
    Book tail;
    void addAtBeginning(int id,String title,String author,String genre,boolean available){
        Book newNode=new Book(id,title,author,genre,available);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    void addAtEnd(int id,String title,String author,String genre,boolean available){
        Book newNode=new Book(id,title,author,genre,available);
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    void addAtPosition(int position, int id, String title,String author,String genre,boolean available){
        if(position<=0){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            addAtBeginning(id,title,author,genre,available);
            return;
        }
        Book temp=head;
        int i=1;
        while(temp!=null && i<position-1){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        Book newNode=new Book(id,title,author,genre,available);
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null) temp.next.prev=newNode;
        else tail=newNode;
        temp.next=newNode;
    }
    void removeByBookId(int id){
        if(head==null){
            System.out.println("Library is empty");
            return;
        }
        Book temp=head;
        while(temp!=null && temp.bookId!=id){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Book not found");
            return;
        }
        if(temp==head){
            head=head.next;
            if (head!=null) head.prev=null;
            else tail=null;
        }
        else if(temp==tail){
            tail=tail.prev;
            tail.next=null;
        }
        else {
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        System.out.println("Book removed successfully");
    }
    void searchByTitle(String title){
        Book temp=head;
        boolean found=false;
        while(temp!=null){
            if (temp.title.equalsIgnoreCase(title)){
                displayBook(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found) System.out.println("Book not found");
    }
    void searchByAuthor(String author){
        Book temp=head;
        boolean found=false;
        while(temp!=null){
            if(temp.author.equalsIgnoreCase(author)){
                displayBook(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found) System.out.println("No books found by this author");
    }
    void updateAvailability(int id,boolean status){
        Book temp=head;
        while(temp!=null){
            if(temp.bookId==id){
                temp.available=status;
                System.out.println("Availability updated");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Book not found");
    }
    void displayForward(){
        if(head==null){
            System.out.println("Library is empty");
            return;
        }
        Book temp=head;
        while(temp!=null){
            displayBook(temp);
            temp=temp.next;
        }
    }
    void displayReverse(){
        if(tail==null){
            System.out.println("Library is empty");
            return;
        }
        Book temp=tail;
        while(temp!=null){
            displayBook(temp);
            temp=temp.prev;
        }
    }
    int countBooks(){
        int count=0;
        Book temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    void displayBook(Book b){
        System.out.println(b.bookId+" | "+b.title+" | "+b.author+" | "+b.genre+" | "+(b.available?"Available":"Not Available"));
    }
    public static void main(String[] args){
        LibraryDoublyLinkedList lib=new LibraryDoublyLinkedList();
        lib.addAtEnd(1,"Java Basics","James","Programming",true);
        lib.addAtEnd(2,"Data Structures","Mark","CS",false);
        lib.addAtBeginning(3,"Algorithms","Cormen","CS",true);
        System.out.println("Library (Forward):");
        lib.displayForward();
        System.out.println("\nLibrary (Reverse):");
        lib.displayReverse();
        lib.searchByAuthor("Mark");
        lib.updateAvailability(2,true);
        lib.removeByBookId(1);
        System.out.println("\nTotal books: "+lib.countBooks());
    }
}
