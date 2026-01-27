package Jan27;

/*Problem Statement: Implement a movie management system using a doubly linked list. Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating. Implement the following functionalities:
Add a movie record at the beginning, end, or at a specific position.
Remove a movie record by Movie Title.
Search for a movie record by Director or Rating.
Display all movie records in both forward and reverse order.
Update a movie's Rating based on the Movie Title.
Hint:
Use a doubly linked list where each node has two pointers: one pointing to the next node and the other to the previous node.
Maintain pointers to both the head and tail for easier insertion and deletion at both ends.
For reverse display, start from the tail and traverse backward using the prev pointers.
*/

import java.util.*;

public class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;
    Movie(String title,String director,int year,double rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
}
class MovieLinkedList{
    Movie head,tail;
    void addAtBeginning(String title,String director,int year,double rating){
        Movie newNode=new Movie(title,director,year,rating);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    void addAtEnd(String title,String director,int year,double rating){
        Movie newNode=new Movie(title,director,year,rating);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    void addAtPosition(int position,String title,String director,int year,double rating){
        if(head==null && position!=1){
            System.out.println("Invalid position");
            return;
        }
        if(position<=0){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            addAtBeginning(title,director,year,rating);
            return;
        }
        Movie temp=head;
        int i=1;
        while(temp!=null && i!=position-1){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        Movie newNode=new Movie(title,director,year,rating);
        newNode.next=temp.next;
        newNode.prev=temp;
        if(temp.next!=null) temp.next.prev=newNode;
        else tail=newNode;
        temp.next=newNode;
    }
    void removeByTitle(String title){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Movie temp=head;
        while(temp!=null && !temp.title.equalsIgnoreCase(title)){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Movie not found");
            return;
        }
        if(temp==head){
            head=head.next;
            if(head!=null) head.prev=null;
            else tail=null;
        }else if(temp==tail){
            tail=temp.prev;
            tail.next=null;
        }else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            temp.next=null;
            temp.prev=null;
        }
        System.out.println("Movie removed successfully");
    }
    void searchByDirector(String director){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Movie temp=head;
        while(temp!=null){
            if(temp.director.equalsIgnoreCase(director)){
                System.out.println(temp.title+" | "+temp.director+" | "+temp.year+" | "+temp.rating);
                return;
            }
            temp=temp.next;
        }
        System.out.println("No movies found with this director");
    }
    void searchByRating(double rating){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Movie temp=head;
        while(temp!=null){
            if(temp.rating==rating){
                System.out.println(temp.title+" | "+temp.director+" | "+temp.year+" | "+temp.rating);
                return;
            }
            temp=temp.next;
        }
        System.out.println("No movies found with this rating");
    }
    void displayForward(){
        if(head==null){
            System.out.println("No movie records available");
            return;
        }
        Movie temp=head;
        while(temp!=null){
            System.out.println(temp.title+" | "+temp.director+" | "+temp.year+" | "+temp.rating);
            temp=temp.next;
        }
    }
    void displayReverse(){
        if(tail==null){
            System.out.println("No movie records available");
            return;
        }
        Movie temp=tail;
        while(temp!=null){
            System.out.println(temp.title+" | "+temp.director+" | "+temp.year+" | "+temp.rating);
            temp=temp.prev;
        }
    }
    void updateRating(String title,double newRating){
        if(head==null){
            System.out.println("No movie records available");
            return;
        }
        Movie temp=head;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(title)){
                temp.rating=newRating;
                System.out.println("Rating updated successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Movie not found");
    }
    public static void main(String[] args) {
        MovieLinkedList list = new MovieLinkedList();
        list.addAtBeginning("Inception","Nolan",2010,8.8);
        list.addAtEnd("Interstellar","Nolan",2014,8.6);
        list.addAtPosition(2,"Avatar","Cameron",2009,7.8);
        System.out.println("Forward Display:");
        list.displayForward();
        System.out.println("\nReverse Display:");
        list.displayReverse();
        list.searchByDirector("Nolan");
        list.updateRating("Avatar",8.0);
        list.removeByTitle("Inception");
        System.out.println("\nAfter Updates:");
        list.displayForward();
    }
}
