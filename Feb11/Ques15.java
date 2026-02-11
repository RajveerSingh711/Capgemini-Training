package Feb11;

/*8️⃣ Generate a JSON report from database records.
*/

import com.fasterxml.jackson.databind.*;
import java.sql.*;
import java.util.*;

class Employee{
    public int id;
    public String name;
    public double salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Ques15 {
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/testdb";
        String username="root";
        String password="password";
        List<Employee> employees=new ArrayList<>();
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM employees");
            while(rs.next()){
                employees.add(new Employee(rs.getInt("id"),rs.getString("name"),rs.getDouble("salary")));
            }
            rs.close();
            stmt.close();
            conn.close();
            ObjectMapper mapper=new ObjectMapper();
            String jsonReport=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);
            System.out.println("JSON Report:");
            System.out.println(jsonReport);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
