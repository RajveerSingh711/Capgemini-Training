package Jan29;

/*3. Problem Statement: String Concatenation Performance
Objective:
Compare the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a million strings.
Approach:
Using String (Immutable, creates new object each time)
Using StringBuilder (Fast, mutable, thread-unsafe)
Using StringBuffer (Thread-safe, slightly slower than StringBuilder)
Comparative Analysis:
Operations Count (N)
String (O(N²))
StringBuilder (O(N))
StringBuffer (O(N))
1,000
10ms
1ms
2ms
10,000
1s
10ms
12ms
1,000,000
30m (Unusable)
50ms
60ms

Expected Result:
StringBuilder & StringBuffer are much more efficient than String.
Use StringBuilder for single-threaded operations and StringBuffer for multi-threaded.
*/

import java.util.*;

public class Ques3 {
    public static void testString(int n){
        long start=System.nanoTime();
        String str="";
        for(int i=0;i<n;i++) str+="a";
        long end=System.nanoTime();
        System.out.println("String Time: "+(end-start)/1_000_000.0+" ms");
    }
    public static void testStringBuilder(int n){
        long start=System.nanoTime();
        StringBuilder sb =new StringBuilder();
        for (int i=0;i<n;i++) sb.append("a");
        long end=System.nanoTime();
        System.out.println("StringBuilder Time: "+(end-start)/1_000_000.0+" ms");
    }
    public static void testStringBuffer(int n) {
        long start=System.nanoTime();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n;i++) sb.append("a");
        long end=System.nanoTime();
        System.out.println("StringBuffer Time: "+(end-start)/1_000_000.0+" ms");
    }
    public static void runTest(int size){
        System.out.println("\nOperations Count: "+size);
        if(size<=10000) testString(size);
        else System.out.println("String Time: Skipped (Too Slow)");
        testStringBuilder(size);
        testStringBuffer(size);
        System.out.println("--------------------------------");
    }
    public static void main(String[] args){
        int[] sizes={1000,10000,1000000};
        for(int size:sizes) runTest(size);
    }
}
