package Jan27;

/*Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked list. Each node represents a state of the text content (e.g., after typing a word or performing a command). Implement the following:
Add a new text state at the end of the list every time the user types or performs an action.
Implement the undo functionality (revert to the previous state).
Implement the redo functionality (revert back to the next state after undo).
Display the current state of the text.
Limit the undo/redo history to a fixed size (e.g., last 10 states).
Hint:
Use a doubly linked list where each node represents a state of the text.
The next pointer will represent the forward history (redo), and the prev pointer will represent the backward history (undo).
Keep track of the current state and adjust the next and prev pointers for undo/redo operations.
*/

import java.util.*;

public class TextState {
    String content;
    TextState next;
    TextState prev;
    TextState(String content){
        this.content=content;
        this.next=null;
        this.prev=null;
    }
}
class TextEditor{
    TextState head;
    TextState tail;
    TextState curr;
    int size;
    int limit=10;
    void addState(String text){
        TextState newNode=new TextState(text);
        if(head==null){
            head=tail=curr=newNode;
            size=1;
            return;
        }
        if(curr.next!=null){
            curr.next.prev=null;
            curr.next=null;
            tail=curr;
        }
        newNode.prev=curr;
        curr.next=newNode;
        curr=newNode;
        tail=newNode;
        size++;
        if(size>limit){
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    void undo(){
        if(curr==null || curr.prev==null){
            System.out.println("Nothing to undo");
            return;
        }
        curr=curr.prev;
    }
    void redo(){
        if(curr==null || curr.next==null){
            System.out.println("Nothing to redo");
            return;
        }
        curr=curr.next;
    }
    void displayCurrent(){
        if(curr==null){
            System.out.println("No text available");
            return;
        }
        System.out.println("Current Text: "+curr.content);
    }
    public static void main(String[] args){
        TextEditor editor=new TextEditor();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrent();
        editor.undo();
        editor.displayCurrent();
        editor.undo();
        editor.displayCurrent();
        editor.redo();
        editor.displayCurrent();
        editor.addState("Hello Java");
        editor.displayCurrent();
    }
}