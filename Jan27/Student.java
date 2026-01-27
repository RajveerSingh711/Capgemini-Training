package Jan27;


/*Problem Statement: Create a program to manage student records using a singly linked list. Each node will store information about a student, including their Roll Number, Name, Age, and Grade. Implement the following operations:
Add a new student record at the beginning, end, or at a specific position.
Delete a student record by Roll Number.
Search for a student record by Roll Number.
Display all student records.
Update a student's grade based on their Roll Number.
Hint:
Use a singly linked list where each node contains student information and a pointer to the next node.
The head of the list will represent the first student, and the last node’s next pointer will be null.
Update the next pointers when inserting or deleting nodes.
*/

import java.util.*;

public class Student{
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;
    Student(int rollNumber,String name,int age,char grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
class StudentLinkedList{
    Student head;
    void addAtBeginning(int rollNumber,String name,int age,char grade){
        Student newNode=new Student(rollNumber,name,age,grade);
        newNode.next=head;
        head=newNode;
    }
    void addAtEnd(int rollNumber,String name,int age,char grade){
        Student newNode=new Student(rollNumber,name,age,grade);
        if(head==null){
            head=newNode;
            return;
        }
        Student temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void addAtPosition(int rollNumber,String name,int age,char grade,int position){
        if(position<=0){
            System.out.println("Invalid position");
            return;
        }
        if(head==null){
            System.out.println("List is empty. Cannot insert at position "+position);
            return;
        }
        if(position==1){
            addAtBeginning(rollNumber,name,age,grade);
            return;
        }
        Student newNode=new Student(rollNumber,name,age,grade);
        Student temp=head;
        int i=1;
        while(temp!=null && i!=position-1){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void deleteByRollNo(int rollNumber){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.rollNumber==rollNumber){
            head=head.next;
            return;
        }
        Student temp=head;
        while(temp!=null && temp.next.rollNumber!=rollNumber){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Student not found");
        }else{
            temp.next=temp.next.next;
            System.out.println("Student record deleted");
        }
    }
    void searchByRollNo(int rollNumber){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Student temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollNumber){
                System.out.println("Student Found:");
                System.out.println(temp.rollNumber+" "+temp.name+" "+temp.age+" "+temp.grade);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }
    void display(){
        if(head==null){
            System.out.println("No student records available");
            return;
        }
        Student temp=head;
        while(temp!=null){
            System.out.println(temp.rollNumber+" | "+temp.name+" | "+temp.age+" | "+temp.grade);
            temp=temp.next;
        }
    }
    void updateGrade(int rollNo,char newGrade){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Student temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollNo){
                temp.grade=newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student not found");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentLinkedList list=new StudentLinkedList();
        list.addAtBeginning(1,"Raj",20,'A');
        list.addAtEnd(2,"Aman",21,'B');
        list.addAtPosition(3,"Neha",19,'A',2);
        list.display();
        list.searchByRollNo(2);
        list.updateGrade(2, 'A');
        list.deleteByRollNo(1);
        System.out.println("\nAfter updates:");
        list.display();
    }
}
