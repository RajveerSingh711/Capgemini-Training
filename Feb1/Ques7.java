package Feb1;

/*Union and Intersection of Two Sets
Given two sets, compute their union and intersection.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Union: {1, 2, 3, 4, 5}, Intersection: {3}.
 */

import java.util.*;

public class Ques7 {
    public static void main(String[] args){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,4,5));
        Set<Integer> union=new HashSet<>(set1);
        union.addAll(set2);
        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Union: "+union);
        System.out.println("Intersection: "+intersection);
    }
}
