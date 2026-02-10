package Feb9;

/*1️⃣3️⃣ Generate a CSV Report from Database
Fetch employee records from a database and write them into a CSV file.
Include headers: Employee ID, Name, Department, Salary.
*/

import java.io.*;
import java.sql.*;

public class Ques13 {
    private static final String DB_URL="jdbc:mysql://localhost:3306/companydb";
    private static final String DB_USER="root";
    private static final String DB_PASSWORD="password";
    private static final String OUTPUT_FILE="employee_report.csv";
    public static void main(String[] args){
        String query="SELECT id, name, department, salary FROM employees";
        try(
                Connection conn=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery(query);
                FileWriter writer=new FileWriter(OUTPUT_FILE)
        ){
            writer.write("Employee ID,Name,Department,Salary\n");
            int count=0;
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String dept=rs.getString("department");
                double salary=rs.getDouble("salary");
                writer.write(id+","+name+","+dept+","+salary+"\n");
                count++;
            }
            System.out.println("CSV Report generated successfully!");
            System.out.println("Total records written: "+count);
        }catch (SQLException|IOException e){
            e.printStackTrace();
        }
    }
}
