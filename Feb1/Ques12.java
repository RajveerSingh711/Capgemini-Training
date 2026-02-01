package Feb1;

/*Generate Binary Numbers Using a Queue
Generate the first N binary numbers (as strings) using a queue.
Example:
N=5 → Output: ["1", "10", "11", "100", "101"].
*/

import java.util.*;

public class Ques12 {
    static List<String> generateBinaryNumbers(int n){
        List<String> result=new ArrayList<>();
        if(n<=0) return result;
        Queue<String> queue=new LinkedList<>();
        queue.add("1");
        for(int i=0;i<n;i++){
            String current=queue.remove();
            result.add(current);
            queue.add(current+"0");
            queue.add(current+"1");
        }
        return result;
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(generateBinaryNumbers(n));
    }
}
