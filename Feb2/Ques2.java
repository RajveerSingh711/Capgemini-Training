package Feb2;

/*Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams (BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.
Requirements:
Read and write in chunks of 4 KB (4096 bytes).
Use System.nanoTime() to measure execution time.
Compare execution time with unbuffered streams.
*/

import java.util.*;
import java.io.*;

public class Ques2 {
    private static final int BUFFER_SIZE=4096;
    public static void main(String[] args){
        String source="largefile.dat";
        String unbufferedDest="copy_unbuffered.dat";
        String bufferedDest="copy_buffered.dat";
        long unbufferedTime=copyUsingUnbufferedStreams(source,unbufferedDest);
        long bufferedTime=copyUsingBufferedStreams(source,bufferedDest);
        System.out.println("\n--- Performance Comparison ---");
        System.out.println("Unbuffered Streams Time : "+unbufferedTime+" ms");
        System.out.println("Buffered Streams Time   : "+bufferedTime+" ms");
    }
    private static long copyUsingUnbufferedStreams(String src,String dest){
        long startTime=System.nanoTime();
        try(
                FileInputStream fis=new FileInputStream(src);
                FileOutputStream fos=new FileOutputStream(dest)
        ){
            byte[] buffer=new byte[BUFFER_SIZE];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
        }catch(IOException e){
            System.out.println("Error copying file (Unbuffered)");
            e.printStackTrace();
        }
        long endTime=System.nanoTime();
        return (endTime-startTime)/1_000_000;
    }
    private static long copyUsingBufferedStreams(String src,String dest) {
        long startTime = System.nanoTime();
        try(
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dest))
        ){
            byte[] buffer=new byte[BUFFER_SIZE];
            int bytesRead;
            while((bytesRead=bis.read(buffer))!=-1){
                bos.write(buffer,0,bytesRead);
            }
        }catch(IOException e){
            System.out.println("Error copying file (Buffered)");
            e.printStackTrace();
        }
        long endTime=System.nanoTime();
        return (endTime-startTime)/1_000_000;
    }
}
