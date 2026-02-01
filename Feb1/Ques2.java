package Feb1;

/*Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
*/

import java.util.*;

public class Ques2 {
    static Map<String,Integer> countFrequency(List<String> list){
        Map<String,Integer> map=new HashMap<>();
        for(String s:list) map.put(s,map.getOrDefault(s,0)+1);
        return map;
    }
    public static void main(String[] args){
        List<String> input=Arrays.asList("apple","banana","apple","orange");
        Map<String, Integer> result=countFrequency(input);
        System.out.println(result);
    }
}
