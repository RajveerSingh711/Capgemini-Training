package Jan30;

/*Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
Approach:
Initialize two StringBuffer and StringBuilder objects.
Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
Measure the time taken to complete the concatenation using System.nanoTime() for both StringBuffer and StringBuilder.
Output the time taken by both classes for comparison.
*/

public class Ques4 {
    public static void main(String[] args){
        int iteration=1_000_000;
        StringBuffer sbu=new StringBuffer();
        long bufferStart=System.nanoTime();
        for(int i=0;i<iteration;i++) sbu.append("hello");
        long bufferEnd=System.nanoTime();
        long bufferTime=bufferEnd-bufferStart;
        StringBuilder sbi=new StringBuilder();
        long builderStart=System.nanoTime();
        for(int i=0;i<iteration;i++) sbi.append("hello");
        long builderEnd=System.nanoTime();
        long builderTime= builderEnd-builderStart;
        System.out.println("StringBuffer Time: " + (bufferTime / 1_000_000) + " ms");
        System.out.println("StringBuilder Time: " + (builderTime / 1_000_000) + " ms");
    }
}
