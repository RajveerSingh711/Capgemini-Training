package Feb9;

/*1️⃣ Read a CSV File and Print Data
Read a CSV file containing student details (ID, Name, Age, Marks).
Print each record in a structured format.
*/

import java.io.*;

public class Ques1 {
    public static void main(String[] args) {
        String filePath="students.csv";
        String line;
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            br.readLine();
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                int age=Integer.parseInt(data[2]);
                double marks=Double.parseDouble(data[3]);
                System.out.println("Student ID   : "+id);
                System.out.println("Name         : "+name);
                System.out.println("Age          : "+age);
                System.out.println("Marks        : "+marks);
                System.out.println("---------------------------");
            }
        }catch(IOException e){
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
