package Jan27;

/*Problem Statement: Create a task scheduler using a circular linked list. Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
Add a task at the beginning, end, or at a specific position in the circular list.
Remove a task by Task ID.
View the current task and move to the next task in the circular list.
Display all tasks in the list starting from the head node.
Search for a task by Priority.
Hint:
Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.
*/

import java.util.*;

public class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;
    Task(int taskId,String taskName,int priority,String dueDate){
        this.taskId=taskId;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate=dueDate;
        this.next=null;
    }
}
class TaskScheduler{
    Task head;
    void addAtBeginning(int taskId,String taskName,int priority,String dueDate){
        Task newNode=new Task(taskId,taskName,priority,dueDate);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Task temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        head=newNode;
    }
    void addAtEnd(int taskId,String taskName,int priority,String dueDate){
        Task newNode=new Task(taskId,taskName,priority,dueDate);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Task temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }
    void addAtPosition(int position,int taskId,String taskName,int priority,String dueDate){
        if(position<=0){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            addAtBeginning(taskId,taskName,priority,dueDate);
            return;
        }
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Task temp=head;
        int i=1;
        while(temp.next!=head && i!=position-1){
            temp=temp.next;
            i++;
        }
        Task newNode=new Task(taskId,taskName,priority,dueDate);
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void removeByTaskId(int id){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.taskId==id && head.next==head){
            head=null;
            System.out.println("Task removed successfully");
            return;
        }
        if(head.taskId==id){
            Task temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
            System.out.println("Task removed successfully");
            return;
        }
        Task temp=head;
        while(temp.next!=head){
            if(temp.next.taskId==id){
                temp.next=temp.next.next;
                System.out.println("Task removed successfully");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Task not found");
    }
    void viewAndMoveNext(){
        if(head==null){
            System.out.println("No tasks available");
            return;
        }
        System.out.println("Current Task:");
        displayTask(head);
        head=head.next;
    }
    void searchByPriority(int priority) {
        if(head==null){
            System.out.println("No tasks available");
            return;
        }
        Task temp=head;
        boolean found=false;
        while(true){
            if(temp.priority==priority){
                displayTask(temp);
                found=true;
            }
            temp=temp.next;
            if(temp==head) break;
        }
        if(!found){
            System.out.println("No task found with priority "+priority);
        }
    }

    void displayAll(){
        if(head==null){
            System.out.println("No tasks available");
            return;
        }
        Task temp=head;
        do{
            displayTask(temp);
            temp=temp.next;
        }while (temp!=head);
    }
    void displayTask(Task t){
        System.out.println(t.taskId+" | "+t.taskName+" | "+t.priority+" | "+t.dueDate);
    }
    public static void main(String[] args){
        TaskScheduler scheduler=new TaskScheduler();
        scheduler.addAtEnd(1,"Assignment",1,"2026-02-01");
        scheduler.addAtEnd(2,"Project",2,"2026-02-10");
        scheduler.addAtBeginning(3,"Exam Prep",1,"2026-01-30");
        System.out.println("All Tasks:");
        scheduler.displayAll();
        scheduler.viewAndMoveNext();
        scheduler.viewAndMoveNext();
        System.out.println("\nSearch by priority 1:");
        scheduler.searchByPriority(1);
        scheduler.removeByTaskId(2);
        System.out.println("\nAfter deletion:");
        scheduler.displayAll();
    }
}