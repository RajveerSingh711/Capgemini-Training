package Feb9;

/*7️⃣ Sort CSV Records by a Column
Read a CSV file and sort the records by Salary in descending order.
Print the top 5 highest-paid employees.
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class Ques7 {
    public static void main(String[] args){
        String filePath="employees.csv";
        try(Stream<String> lines=Files.lines(Paths.get(filePath))){
            List<String[]> employees=lines.skip(1).map(line -> line.split("\\s*,\\s*")).collect(Collectors.toList());
            System.out.println("Top 5 Highest-Paid Employees:");
            System.out.println("--------------------------------");
            employees.stream().sorted(Comparator.comparingDouble((String[] emp)->Double.parseDouble(emp[3])
                    ).reversed()).limit(5).forEach(emp->{
                        System.out.println("ID: "+emp[0]+", Name: "+emp[1]+", Department: "+emp[2]+", Salary: "+emp[3]);
                    });
        }catch(IOException e){
            System.out.println("Error reading the CSV file.");
            e.printStackTrace();
        }
    }
}
