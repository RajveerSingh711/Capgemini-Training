package Feb1;

/*Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
 */

import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        Set<Integer> set1=new HashSet<>(Arrays.asList(2,3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(1,2,3,4));
        boolean isSubset=set2.containsAll(set1);
        System.out.println(isSubset);
    }
}
