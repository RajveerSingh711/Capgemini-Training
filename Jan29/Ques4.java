package Jan29;

/*4. Problem Statement: Large File Reading Efficiency
Objective:
Compare FileReader (Character Stream) and InputStreamReader (Byte Stream) when reading a large file (500MB).
Approach:
FileReader: Reads character by character (slower for binary files).
InputStreamReader: Reads bytes and converts to characters (more efficient).
Comparative Analysis:
File Size
FileReader Time
InputStreamReader Time
1MB
50ms
30ms
100MB
3s
1.5s
500MB
10s
5s

Expected Result:
InputStreamReader is more efficient for large files.
FileReader is preferable for text-based data.
*/

import java.util.*;
import java.io.*;

public class Ques4 {
    public static void readUsingFileReader(String path){
        long start=System.nanoTime();
        try(FileReader fr=new FileReader(path);
             BufferedReader br=new BufferedReader(fr)){
            while(br.readLine() != null){

            }
        }catch(IOException e){
            e.printStackTrace();
        }
        long end=System.nanoTime();
        System.out.println("FileReader Time: "+(end-start)/1_000_000_000.0+" seconds");
    }
    public static void readUsingInputStreamReader(String path){
        long start=System.nanoTime();
        try(InputStreamReader isr=new InputStreamReader(new FileInputStream(path));
             BufferedReader br=new BufferedReader(isr)){
            while(br.readLine()!= null){
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        long end=System.nanoTime();
        System.out.println("InputStreamReader Time: "+(end-start)/1_000_000_000.0+" seconds");
    }
    public static void main(String[] args) {
        String filePath="C:\\Users\\rajve\\IdeaProjects\\Sample Program Day 1\\src\\Jan29\\Ques4file.txt";
        File file=new File(filePath);
        if(!file.exists()){
            System.out.println("File not found. Please provide a valid file path.");
            return;
        }
        double fileSizeMB=file.length()/(1024.0*1024.0);
        System.out.println("File Size: "+fileSizeMB+" MB\n");
        readUsingFileReader(filePath);
        readUsingInputStreamReader(filePath);
    }
}
