package Jan27;

/*Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
Add an item at the beginning, end, or at a specific position.
Remove an item based on Item ID.
Update the quantity of an item by Item ID.
Search for an item based on Item ID or Item Name.
Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
Sort the inventory based on Item Name or Price in ascending or descending order.
Hint:
Use a singly linked list where each node represents an item in the inventory.
Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
For total value calculation, traverse through the list and sum up Quantity * Price for each item.
*/

import java.util.*;

public class Item {
    int itemId;
    String itemName;
    int quantity;
    double price;
    Item next;
    Item(int itemId,String itemName,int quantity,double price){
        this.itemId=itemId;
        this.itemName=itemName;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }
}
class InventoryLinkedList{
    Item head;
    void addAtBeginning(int id,String name,int qty,double price){
        Item newNode=new Item(id,name,qty,price);
        newNode.next=head;
        head=newNode;
    }
    void addAtEnd(int id,String name,int qty,double price){
        Item newNode=new Item(id,name,qty,price);
        if(head==null){
            head=newNode;
            return;
        }
        Item temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
    }
    void addAtPosition(int position,int id,String name,int qty,double price){
        if(position<=0){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            addAtBeginning(id,name,qty,price);
            return;
        }
        Item temp=head;
        int i=1;
        while(temp!=null && i<position-1){
            temp=temp.next;
            i++;
        }
        if(temp==null){
            System.out.println("Position out of range");
            return;
        }
        Item newNode=new Item(id,name,qty,price);
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void removeById(int id){
        if(head==null){
            System.out.println("Inventory empty");
            return;
        }
        if(head.itemId==id){
            head=head.next;
            System.out.println("Item removed");
            return;
        }
        Item temp=head;
        while(temp.next!=null && temp.next.itemId!=id) temp=temp.next;
        if (temp.next==null){
            System.out.println("Item not found");
        }else{
            temp.next=temp.next.next;
            System.out.println("Item removed");
        }
    }
    void updateQuantity(int id,int newQty){
        Item temp=head;
        while(temp!=null){
            if(temp.itemId==id) {
                temp.quantity=newQty;
                System.out.println("Quantity updated");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found");
    }
    void searchById(int id){
        Item temp=head;
        while(temp!=null){
            if(temp.itemId==id){
                displayItem(temp);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Item not found");
    }
    void searchByName(String name){
        Item temp=head;
        boolean found=false;
        while(temp!=null){
            if(temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found=true;
            }
            temp=temp.next;
        }
        if(!found) System.out.println("Item not found");
    }
    double totalInventoryValue(){
        double total=0;
        Item temp=head;
        while(temp!=null){
            total+=temp.price;
            temp=temp.next;
        }
        return total;
    }
    void sortByName(boolean ascending){
        head=mergeSort(head,true,ascending);
    }
    void sortByPrice(boolean ascending){
        head=mergeSort(head,false,ascending);
    }
    private Item mergeSort(Item node,boolean sortByName,boolean ascending){
        if(node==null || node.next==null) return node;
        Item middle=getMiddle(node);
        Item nextOfMiddle=middle.next;
        middle.next=null;
        Item left=mergeSort(node,sortByName,ascending);
        Item right=mergeSort(nextOfMiddle,sortByName,ascending);
        return merge(left,right,sortByName,ascending);
    }
    private Item merge(Item a,Item b,boolean sortByName,boolean ascending){
        if(a==null) return b;
        if(b==null) return a;
        boolean condition;
        if(sortByName) condition=ascending?a.itemName.compareToIgnoreCase(b.itemName)<=0:a.itemName.compareToIgnoreCase(b.itemName)>0;
        else condition=ascending?a.price<=b.price:a.price>b.price;
        if(condition){
            a.next=merge(a.next,b,sortByName,ascending);
            return a;
        }else{
            b.next=merge(a,b.next,sortByName,ascending);
            return b;
        }
    }

    private Item getMiddle(Item head){
        if(head==null) return head;
        Item slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    void display(){
        if(head==null){
            System.out.println("Inventory empty");
            return;
        }
        Item temp=head;
        while(temp!=null){
            displayItem(temp);
            temp=temp.next;
        }
    }
    void displayItem(Item i){
        System.out.println(i.itemId+" | "+i.itemName+" | "+i.quantity+" | "+i.price);
    }
    public static void main(String[] args){
        InventoryLinkedList inv=new InventoryLinkedList();
        inv.addAtEnd(1,"Pen",100,10);
        inv.addAtEnd(2,"Notebook",50,40);
        inv.addAtBeginning(3,"Pencil",200,5);
        System.out.println("Inventory:");
        inv.display();
        System.out.println("\nTotal Value = "+inv.totalInventoryValue());
        System.out.println("\nSorted by Name (Ascending):");
        inv.sortByName(true);
        inv.display();
        System.out.println("\nSorted by Price (Descending):");
        inv.sortByPrice(false);
        inv.display();
    }
}