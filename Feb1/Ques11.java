package Feb1;

/*Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
*/

import java.util.*;

public class Ques11 {
    static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty()) return;
        int front=q.poll();
        reverseQueue(q);
        q.add(front);
    }
    public static void main(String[] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverseQueue(queue);
        System.out.println(queue);
    }
}
