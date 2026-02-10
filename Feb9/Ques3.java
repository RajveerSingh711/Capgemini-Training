package Feb9;

/*3️⃣ Read and Count Rows in a CSV File
Read a CSV file and count the number of records (excluding the header row).
*/

import java.io.*;

public class Ques3 {
    public static void main(String[] args){
        String filePath="employees.csv";
        int count=0;
        String line;
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            br.readLine();
            while((line=br.readLine())!=null){
                if(!line.trim().isEmpty()) count++;
            }
            System.out.println("Number of records (excluding header): "+count);
        }catch(IOException e){
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
