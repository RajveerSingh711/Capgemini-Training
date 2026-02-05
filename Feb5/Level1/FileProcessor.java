package Feb5.Level1;

/*You are tasked with reading data from multiple files and processing them. Ensure that each file
is closed properly after processing, even if an exception occurs. Implement the following:
1. Create a class FileProcessor with a method processFiles(List<String>
filePaths) that reads the contents of each file from the provided list of file paths. Use
BufferedReader to read the file contents.
2. Handle exceptions: Catch and handle IOException during file reading. Ensure that all
resources (file readers) are properly closed using the try-with-resources statement.
 */

import java.util.*;
import java.io.*;

public class FileProcessor {
    public void processFiles(List<String> filePaths){
        for (String path:filePaths){
            System.out.println("Reading file: "+path);
            try(BufferedReader reader=new BufferedReader(new FileReader(path))){
                String line;
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
            }catch(IOException e){
                System.err.println("Error reading file: "+path);
                System.err.println(e.getMessage());
            }
            System.out.println("Finished processing: "+path);
            System.out.println("----------------------------------");
        }
    }
    public static void main(String[] args) {
        FileProcessor processor=new FileProcessor();
        List<String> files=Arrays.asList("file1.txt","file2.txt","file3.txt");
        processor.processFiles(files);
    }
}
