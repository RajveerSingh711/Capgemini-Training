package Jan16.Level1;

/*Create a Person class with a copy constructor that clones another person's attributes.
*/

import java.util.*;

public class Person {
    String name;
    int age;
    Person(String n,int a){
        this.name=n;
        this.age=a;
    }
    Person(Person p){
        this.name=p.name;
        this.age=p.age;
    }
    void display() {
        System.out.println("Name: " +name+ ", Age: "+age);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int a=sc.nextInt();
        Person p=new Person(name,a);
        p.display();
        Person p1=new Person(p);
        p1.display();
    }
}
