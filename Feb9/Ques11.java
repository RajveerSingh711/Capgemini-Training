package Feb9;

/*1️⃣1️⃣ Read Large CSV File Efficiently
Given a large CSV file (500MB+), implement a memory-efficient way to read it in chunks.
Process only 100 lines at a time and display the count of records processed.
*/

import java.util.*;
import java.io.*;

public class Ques11 {
    private static final int BATCH_SIZE=100;
    public static void main(String[] args){
        String filePath="large_file.csv";
        int totalRecords=0;
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            br.readLine();
            String line;
            List<String> batch=new ArrayList<>(BATCH_SIZE);
            while((line=br.readLine())!=null){
                batch.add(line);
                if(batch.size()==BATCH_SIZE) {
                    processBatch(batch);
                    totalRecords+=batch.size();
                    batch.clear();
                }
            }
            if(!batch.isEmpty()){
                processBatch(batch);
                totalRecords+=batch.size();
            }
            System.out.println("Total records processed: "+totalRecords);
        }catch(IOException e){
            System.out.println("Error reading large CSV file.");
            e.printStackTrace();
        }
    }
    private static void processBatch(List<String> batch){
        System.out.println("Processed batch of size: "+batch.size());
    }
}
