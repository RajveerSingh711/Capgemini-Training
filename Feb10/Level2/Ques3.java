package Feb10.Level2;

/*Create an ArrayList without generics and use @SuppressWarnings("unchecked") to hide compilation warnings.
*/

import java.util.*;

public class Ques3 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add("Java");
        list.add(10);
        list.add(3.14);
        for(Object obj:list){
            System.out.println(obj);
        }
    }
}
