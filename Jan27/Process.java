package Jan27;

/*Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list. Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
Add a new process at the end of the circular list.
Remove a process by Process ID after its execution.
Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
Display the list of processes in the circular queue after each round.
Calculate and display the average waiting time and turn-around time for all processes.
Hint:
Use a circular linked list to represent a queue of processes.
Each process executes for a fixed time quantum, and then control moves to the next process in the circular list.
Maintain the current node as the process being executed, and after each round, update the list to simulate execution.
 */

import java.util.*;

class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    Process next;
    Process(int pid,int burstTime,int priority){
        this.pid=pid;
        this.burstTime=burstTime;
        this.remainingTime=burstTime;
        this.priority=priority;
        this.waitingTime=0;
        this.turnAroundTime=0;
        this.next=null;
    }
}
class RoundRobinScheduler{
    Process head;
    void addProcess(int pid,int burstTime,int priority){
        Process newNode=new Process(pid,burstTime,priority);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Process temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }
    void removeByPid(int pid){
        if(head==null) return;
        if(head.pid==pid && head.next==head){
            head=null;
            return;
        }
        if(head.pid==pid){
            Process temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
            return;
        }
        Process temp=head;
        while(temp.next!=head){
            if(temp.next.pid==pid){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }
    void displayQueue(){
        if(head==null){
            System.out.println("No processes in queue");
            return;
        }
        Process temp=head;
        do{
            System.out.println("PID:"+temp.pid+" BT:"+temp.remainingTime+" P:"+temp.priority);
            temp=temp.next;
        }while(temp!=head);
    }
    void simulate(int timeQuantum){
        if(head==null) return;
        Process current=head;
        int time=0;
        int completed=0;
        int totalWT=0;
        int totalTAT=0;
        while(head!=null){
            if(current.remainingTime>0){
                int exec=Math.min(timeQuantum,current.remainingTime);
                current.remainingTime-=exec;
                time+=exec;
                Process temp=head;
                do{
                    if(temp!=current && temp.remainingTime>0){
                        temp.waitingTime+=exec;
                    }
                    temp=temp.next;
                }while(temp!=head);
                System.out.println("\nAfter time "+time+":");
                displayQueue();
                if(current.remainingTime==0){
                    current.turnAroundTime=time;
                    totalWT+=current.waitingTime;
                    totalTAT+=current.turnAroundTime;
                    int pid=current.pid;
                    current=current.next;
                    removeByPid(pid);
                    completed++;
                    continue;
                }
            }
            current=current.next;
        }
        System.out.println("\nAverage Waiting Time: "+(double)totalWT/completed);
        System.out.println("Average Turn Around Time: "+(double)totalTAT/completed);
    }

    public static void main(String[] args){
        RoundRobinScheduler rr=new RoundRobinScheduler();
        rr.addProcess(1,10,1);
        rr.addProcess(2,5,2);
        rr.addProcess(3,8,1);
        int timeQuantum=3;
        rr.simulate(timeQuantum);
    }
}
