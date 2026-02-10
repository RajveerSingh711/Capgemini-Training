package Feb9;

/*4️⃣ Filter Records from CSV
Read a CSV file and filter students who have scored more than 80 marks.
Print only the qualifying records.
*/

import java.io.*;

public class Ques4 {
    public static void main(String[] args){
        String filePath="students.csv";
        String line;
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            System.out.println("Students scoring more than 80 marks:");
            System.out.println("-----------------------------------");
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                int age=Integer.parseInt(data[2]);
                double marks=Double.parseDouble(data[3]);
                if(marks>80) System.out.println("ID: "+id+", Name: "+name+", Age: "+age+", Marks: "+marks);
            }
        }catch(IOException e){
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
