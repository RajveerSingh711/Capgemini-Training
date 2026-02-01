package Feb1;

/*Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
*/

import java.util.*;

public class Ques4 {
    static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
    public static void main(String[] args){
        List<Integer> input=Arrays.asList(3,1,2,2,3,4);
        List<Integer> result=removeDuplicates(input);
        System.out.println(result);
    }
}
