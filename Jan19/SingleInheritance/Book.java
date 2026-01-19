package Jan19.SingleInheritance;

/*Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/

import java.util.*;

class Book {
    protected String title;
    protected int publicationYear;
    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void displayInfo(){
        System.out.println("Book Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
}
class Author extends Book{
    private String name;
    private String bio;
    Author(String title,int publicationYear,String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name: "+name);
        System.out.println("Author Bio: "+bio);
    }
    public static void main(String[] args){
        Author a=new Author("Clean Code",2008,"Robert C. Martin","Software engineer and author known for clean coding practices.");
        a.displayInfo();
    }
}