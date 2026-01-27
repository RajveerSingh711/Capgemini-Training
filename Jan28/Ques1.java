package Jan28;

/*Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.
*/

import java.util.*;

class QueueUsingStacks{
    Stack<Integer> inStack=new Stack<>();
    Stack<Integer> outStack=new Stack<>();
    void enqueue(int n){
        inStack.push(n);
    }
    int dequeue(){
        if(inStack.isEmpty() && outStack.isEmpty()) throw new RuntimeException("Queue is empty");
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
    int peek(){
        if(inStack.isEmpty() && outStack.isEmpty()) throw new RuntimeException("Queue is empty");
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }
    boolean isEmpty(){
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
public class Ques1 {
    public static void main(String[] args){
        QueueUsingStacks q=new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
