package Feb5.Level1;

/*Create a method that processes data and throws both checked and unchecked exceptions.
Handle both types of exceptions in the main method.
*/

import java.util.*;
import java.io.*;

public class DataProcessor {
    public static void processData(String data) throws IOException{
        if(data==null || data.isEmpty()){
            throw new IllegalArgumentException("Input data cannot be null or empty");
        }
        if("IO_ERROR".equals(data)){
            throw new IOException("Simulated I/O failure while processing data");
        }
        System.out.println("Data processed successfully: "+data);
    }
    public static void main(String[] args){
        String data="IO_ERROR";
        try{
            processData(data);
        }catch(IOException e){
            System.err.println("Checked Exception occurred:");
            System.err.println(e.getMessage());
        }catch(IllegalArgumentException e){
            System.err.println("Unchecked Exception occurred:");
            System.err.println(e.getMessage());
        }
    }
}
