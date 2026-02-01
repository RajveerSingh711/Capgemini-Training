package Feb1;

/*Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
*/

import java.util.*;

public class Ques9 {
    public static void main(String[] args){
        Set<Integer> set=new HashSet<>(Arrays.asList(5,3,9,1));
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
