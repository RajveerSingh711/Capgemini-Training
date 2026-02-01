package Feb1;

/*Check if Two Sets Are Equal
Compare two sets and determine if they contain the same elements, regardless of order.
Example:
Set1: {1, 2, 3}, Set2: {3, 2, 1} → Output: true.
*/

import java.util.*;

public class Ques6 {
    public static void main(String[] args){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3,2,1));
        boolean isEqual=set1.equals(set2);
        System.out.println(isEqual);
    }
}
