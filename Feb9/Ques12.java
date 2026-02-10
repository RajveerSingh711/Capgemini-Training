package Feb9;

/*1️⃣2️⃣ Detect Duplicates in a CSV File
Read a CSV file and detect duplicate entries based on the ID column.
Print all duplicate records.
*/

import java.io.*;
import java.util.*;

public class Ques12 {
    public static void main(String[] args){
        String filePath="students.csv";
        Set<String> seenIds=new HashSet<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            br.readLine();
            System.out.println("Duplicate Records:");
            System.out.println("------------------");
            while((line=br.readLine())!=null){
                String[] data=line.split("\\s*,\\s*");
                String id=data[0];
                if(!seenIds.add(id)) System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
