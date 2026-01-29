package Jan29;

/*6. Problem Statement: Comparing Different Data Structures for Searching
Objective:
Compare Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)) for searching elements.
Approach:
Array: Linear search (O(N)).
HashSet: Uses hashing (O(1) on average).
TreeSet: Balanced BST (O(log N)).
Comparative Analysis:
Dataset Size (N)
Array Search (O(N))
HashSet Search (O(1))
TreeSet Search (O(log N))
1,000
1ms
0.01ms
0.1ms
100,000
100ms
0.01ms
10ms
1,000,000
1s
0.01ms
20ms

Expected Result:
HashSet is fastest for lookups but requires extra memory.
TreeSet maintains order but is slightly slower than HashSet.
*/

import java.util.*;

public class Ques6 {
    public static void runTest(int size) {
        System.out.println("\nDataset Size: " + size);
        Random rand = new Random();
        int[] array=new int[size];
        HashSet<Integer> hashSet=new HashSet<>();
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i=0;i<size;i++){
            int value=rand.nextInt(size*10);
            array[i]=value;
            hashSet.add(value);
            treeSet.add(value);
        }
        int target=array[size/2];
        long start=System.nanoTime();
        boolean found=false;
        for(int num:array){
            if(num==target){
                found = true;
                break;
            }
        }
        long end=System.nanoTime();
        System.out.println("Array Search Time: "+(end-start)/1_000_000.0+" ms");
        start=System.nanoTime();
        hashSet.contains(target);
        end=System.nanoTime();
        System.out.println("HashSet Search Time: "+(end-start)/1_000_000.0+" ms");
        start=System.nanoTime();
        treeSet.contains(target);
        end=System.nanoTime();
        System.out.println("TreeSet Search Time: "+(end-start)/1_000_000.0+" ms");
        System.out.println("--------------------------------");
    }
    public static void main(String[] args){
        int[] sizes={1000,10000,1000000};
        for (int size:sizes) runTest(size);
    }
}
