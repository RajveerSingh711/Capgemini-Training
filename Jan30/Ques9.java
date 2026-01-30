package Jan30;

/*Write a program that:
Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
Approach:
StringBuilder and StringBuffer:
Create a list of strings (e.g., "hello").
Concatenate the strings 1,000,000 times using both StringBuilder and StringBuffer.
Measure and compare the time taken for each.
FileReader and InputStreamReader:
Read a large text file (100MB) using FileReader and InputStreamReader.
Count the number of words by splitting the text on whitespace characters.
Print the word count and compare the time taken for reading the file.
*/

import java.util.*;
import java.io.*;
import java.nio.charset.*;

public class Ques9 {
    private static final int ITERATIONS=1_000_000;
    public static void main(String[] args){
        testStringPerformance();
        System.out.println("\n-----------------------------\n");
        String filePath = "largeFile.txt";
        testFileReading(filePath);
    }
    private static void testStringPerformance() {
        String text = "hello";
        StringBuilder builder=new StringBuilder(ITERATIONS*text.length());
        long builderStart=System.nanoTime();
        for(int i=0;i<ITERATIONS; i++){
            builder.append(text);
        }
        long builderTime=System.nanoTime()-builderStart;
        StringBuffer buffer=new StringBuffer(ITERATIONS*text.length());
        long bufferStart = System.nanoTime();
        for(int i=0;i<ITERATIONS;i++){
            buffer.append(text);
        }
        long bufferTime=System.nanoTime()-bufferStart;
        System.out.println("StringBuilder Time: "+(builderTime/1_000_000)+" ms");
        System.out.println("StringBuffer Time: "+(bufferTime/1_000_000)+" ms");
    }
    private static void testFileReading(String filePath){
        long startTime=System.nanoTime();
        long wordCount=0;
        try (
                FileInputStream fis=new FileInputStream(filePath);
                InputStreamReader isr=new InputStreamReader(fis,StandardCharsets.UTF_8);
                BufferedReader br=new BufferedReader(isr,1024*1024);
        ) {
            String line;
            while((line=br.readLine())!=null){
                if(!line.isEmpty()){
                    String[] words=line.trim().split("\\s+");
                    wordCount+=words.length;
                }
            }
            long endTime=System.nanoTime();
            System.out.println("Total Words: "+wordCount);
            System.out.println("File Reading Time: "+((endTime-startTime)/1_000_000)+" ms");
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
    }
}
