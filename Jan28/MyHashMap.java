package Jan28;

/*Implement a Custom Hash Map
Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
Hint: Use an array of linked lists to handle collisions using separate chaining.
*/

import java.util.*;

public class MyHashMap {
    private class Node {
        int key;
        int value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private int capacity=10;
    private Node[] buckets=new Node[capacity];
    private int getIndex(int key){
        return key%capacity;
    }
    public void put(int key,int value){
        int index=getIndex(key);
        Node head=buckets[index];
        Node curr=head;
        while(curr!=null){
            if(curr.key==key) {
                curr.value=value;
                return;
            }
            curr=curr.next;
        }
        Node newNode=new Node(key,value);
        newNode.next=head;
        buckets[index]=newNode;
    }
    public Integer get(int key){
        int index=getIndex(key);
        Node curr=buckets[index];
        while(curr!=null){
            if(curr.key==key) return curr.value;
            curr=curr.next;
        }
        return null;
    }
    public void remove(int key){
        int index=getIndex(key);
        Node curr=buckets[index];
        Node prev=null;
        while(curr!=null){
            if(curr.key==key){
                if(prev==null) buckets[index]=curr.next;
                else prev.next=curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }
}