package Feb9;

/*2️⃣ Write Data to a CSV File
Create a CSV file with employee details (ID, Name, Department, Salary).
Write at least 5 records to the file.
*/

import java.io.*;

public class Ques2 {
    public static void main(String[] args){
        String filePath="employees.csv";
        try(FileWriter writer=new FileWriter(filePath)){
            writer.append("ID,Name,Department,Salary\n");
            writer.append("101,Rahul,IT,55000\n");
            writer.append("102,Priya,HR,48000\n");
            writer.append("103,Aman,Finance,60000\n");
            writer.append("104,Neha,Marketing,52000\n");
            writer.append("105,Arjun,Operations,50000\n");
            System.out.println("CSV file created and data written successfully.");
        }catch(IOException e){
            System.out.println("Error writing to the CSV file.");
            e.printStackTrace();
        }
    }
}
