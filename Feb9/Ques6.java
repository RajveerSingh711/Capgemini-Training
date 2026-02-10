package Feb9;

/*6️⃣ Modify a CSV File (Update a Value)
Read a CSV file and increase the salary of employees from the "IT" department by 10%.
Save the updated records back to a new CSV file.
*/

import java.io.*;

public class Ques6 {
    public static void main(String[] args){
        String inputFile="employees.csv";
        String outputFile="employees_updated.csv";
        try(
                BufferedReader br=new BufferedReader(new FileReader(inputFile));
                FileWriter writer=new FileWriter(outputFile)
        ){
            String line;
            writer.write(br.readLine()+"\n");
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0]);
                String name=data[1];
                String department=data[2];
                double salary=Double.parseDouble(data[3]);
                if(department.equalsIgnoreCase("IT")) salary=salary*1.10;
                writer.write(id+","+name+","+department+","+salary+"\n");
            }
            System.out.println("CSV file updated successfully!");
        }catch(IOException e){
            System.out.println("Error processing CSV file.");
            e.printStackTrace();
        }
    }
}
