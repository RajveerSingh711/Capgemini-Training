package Feb7.Level1;

/*Sorting a List of Objects:
Create a list of Person objects with attributes such as name, age, and salary. Sort the list
by age in ascending order using lambda expressions.
*/

import java.util.*;

class Person{
    private String name;
    private int age;
    private double salary;
    public Person(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return name+" | Age: "+age+" | Salary: "+salary;
    }
}
public class SortPersonByAge {
    public static void main(String[] args){
        List<Person> people=Arrays.asList(
                new Person("Alice",30,60000),
                new Person("Bob",25,50000),
                new Person("Charlie",35,70000),
                new Person("David",28,55000)
        );
        people.sort((p1,p2)->Integer.compare(p1.getAge(), p2.getAge()));
        people.forEach(System.out::println);
    }
}