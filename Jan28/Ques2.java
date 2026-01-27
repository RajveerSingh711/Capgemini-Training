package Jan28;

/*Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
*/

import java.util.*;

public class Ques2 {
    static void sortStack(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top=s.pop();
        sortStack(s);
        insertSorted(s,top);
    }
    static void insertSorted(Stack<Integer> s,int n){
        if(s.isEmpty() || s.peek()<=n){
            s.push(n);
            return;
        }
        int top=s.pop();
        insertSorted(s,n);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);
        sortStack(s);
        System.out.println(s);
    }
}
