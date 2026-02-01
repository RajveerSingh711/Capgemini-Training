package Feb1;

/*Find the Nth Element from the End
Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.
Example:
Input: [A, B, C, D, E], N=2 → Output: D.
*/

import java.util.*;

public class Ques5 {
    static String findNthFromEnd(LinkedList<String> list,int n){
        if(n<=0 || list.isEmpty()) return null;
        Iterator<String> fast=list.iterator();
        Iterator<String> slow=list.iterator();
        for(int i=0;i<n;i++){
            if(!fast.hasNext()) return null;
            fast.next();
        }
        String result=null;
        while(fast.hasNext()){
            fast.next();
            result=slow.next();
        }
        return slow.next();
    }
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n=2;
        System.out.println(findNthFromEnd(list,n));
    }
}
