package Jan16.AccessModifiers;

/*
Problem 2: Book Library System
Design a Book class with:
ISBN (public)
title (protected)
author (private)
Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title
and demonstrate access modifiers.
*/

import java.util.*;

class Book {
    public String ISBN;
    protected String title;
    private String author;
    Book(String ISBN,String title,String author){
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}
class EBook extends Book {
    private double fileSize;
    EBook(String ISBN,String title,String author,double fileSize){
        super(ISBN,title,author);
        this.fileSize=fileSize;
    }
    void displayDetails() {
        System.out.println("ISBN: "+ISBN);
        System.out.println("Title: "+title);
        System.out.println("Author: "+getAuthor());
        System.out.println("File Size: "+fileSize+" MB");
    }
    public static void main(String[] args){
        EBook eb=new EBook("978-0134685991","Effective Java","Joshua Bloch",5.2);
        eb.setAuthor("J. Bloch");
        eb.displayDetails();
    }
}
