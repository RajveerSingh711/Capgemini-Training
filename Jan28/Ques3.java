package Jan28;

/*Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order.
*/

import java.util.*;

public class Ques3 {
    static int[] calculateSpan(int[] price){
        int n=price.length;
        int span[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && price[s.peek()]<=price[i]) s.pop();
            span[i]=s.isEmpty()?i+1:i-s.peek();
            s.push(i);
        }
        return span;
    }
    public static void main(String[] args){
        int[] price={100,80,60,70,60,75,85};
        int[] span=calculateSpan(price);
        for(int s:span) System.out.print(s+" ");
    }
}
