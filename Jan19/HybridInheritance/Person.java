package Jan19.HybridInheritance;

/*Sample Problem 1: Restaurant Management System with Hybrid Inheritance
Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.
*/

import java.util.*;

interface Worker {
    void performDuties();
}
class Person {
    protected String name;
    protected int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
class Chef extends Person implements Worker{
    private String specialization;
    Chef(String name,int id,String specialization){
        super(name,id);
        this.specialization=specialization;
    }
    @Override
    public void performDuties(){
        System.out.println("Chef Duties: Preparing "+specialization+" dishes.");
    }
    void displayDetails(){
        displayInfo();
        performDuties();
    }
}
class Waiter extends Person implements Worker{
    private int tableCount;
    Waiter(String name,int id,int tableCount){
        super(name,id);
        this.tableCount=tableCount;
    }
    @Override
    public void performDuties(){
        System.out.println("Waiter Duties: Serving "+tableCount+" tables.");
    }
    void displayDetails(){
        displayInfo();
        performDuties();
    }
    public static void main(String[] args){
        Chef c=new Chef("Rajveer Singh",101,"Indian");
        Waiter w=new Waiter("John Doe",102,8);
        c.displayDetails();
        System.out.println();
        w.displayDetails();
    }
}