package Feb1;

/*Merge Two Maps
Merge two maps such that if a key exists in both, sum their values.
Example:
Map1: {A=1, B=2}, Map2: {B=3, C=4} → Output: {A=1, B=5, C=4}.
*/

import java.util.*;

public class Ques19 {
    public static Map<String, Integer> mergeMaps(Map<String,Integer> map1,Map<String,Integer> map2){
        Map<String,Integer> result=new HashMap<>(map1);
        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            result.put(entry.getKey(),result.getOrDefault(entry.getKey(),0)+entry.getValue());
        }
        return result;
    }
    public static void main(String[] args){
        Map<String,Integer> map1=new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String,Integer> map2=new HashMap<>();
        map2.put("B",3);
        map2.put("C",4);
        System.out.println(mergeMaps(map1,map2));
    }
}
