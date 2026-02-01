package Feb1;

/*Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].
 */

import java.util.*;

public class Ques1 {
    static void reverseArrayList(ArrayList<Integer> arr){
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list){
        LinkedList<Integer> reverse=new LinkedList<>();
        while(!list.isEmpty()) reverse.add(list.removeLast());
        return reverse;
    }
    public static void main(String[] args){
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: "+arrayList);
        LinkedList<Integer> linkedList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> reversedLinkedList=reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: "+reversedLinkedList);
    }
}
