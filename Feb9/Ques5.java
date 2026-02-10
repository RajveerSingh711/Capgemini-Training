package Feb9;

/*5️⃣ Search for a Record in CSV
Read an employees.csv file and search for an employee by name.
Print their department and salary.
*/

import java.io.*;
import java.util.*;

public class Ques5 {
    public static void main(String[] args){
        String filePath="employees.csv";
        String searchName;
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        searchName=sc.nextLine();
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] data=line.split(",");
                String name=data[1];
                if(name.equalsIgnoreCase(searchName)){
                    String department=data[2];
                    double salary=Double.parseDouble(data[3]);
                    System.out.println("Employee Found!");
                    System.out.println("Department : "+department);
                    System.out.println("Salary     : "+salary);
                    found=true;
                    break;
                }
            }
            if(!found) System.out.println("Employee not found.");
        }catch(IOException e){
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
        sc.close();
    }
}
