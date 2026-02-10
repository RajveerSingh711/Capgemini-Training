package Feb9;

/*1️⃣4️⃣ Convert JSON to CSV and Vice Versa
Read a JSON file containing a list of students.
Convert it into CSV format and save it.
Implement another method to read CSV and convert it back to JSON.
*/

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

class Student{
    public int id;
    public String name;
    public int age;
    public int marks;
    public Student() {}
    public Student(int id,String name,int age,int marks){
        this.id=id;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
}
class JsonToCsv{
    public static void convertJsonToCsv(String jsonFile,String csvFile) throws IOException{
        ObjectMapper mapper=new ObjectMapper();
        List<Student> students=mapper.readValue(jsonFile,new TypeReference<List<Student>>(){});
        try(FileWriter writer=new FileWriter(csvFile)){
            writer.write("ID,Name,Age,Marks\n");
            for(Student s:students) writer.write(s.id+","+s.name+","+s.age+","+s.marks+"\n");
        }
    }
}
class CsvToJson{
    public static void convertCsvToJson(String csvFile,String jsonFile) throws IOException{
        List<Student> students=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(csvFile))){
            br.readLine();
            String line;
            while((line=br.readLine())!=null){
                String[] data=line.split("\\s*,\\s*");
                students.add(new Student(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3])));
            }
        }
        ObjectMapper mapper=new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new java.io.File(jsonFile),students);
    }
}
public class Ques14 {
    public static void main(String[] args) throws Exception{
        String jsonInput="students.json";
        String csvFile="students.csv";
        String jsonOutput="students_converted.json";
        JsonToCsv.convertJsonToCsv(jsonInput,csvFile);
        System.out.println("JSON ➜ CSV conversion done.");
        CsvToJson.convertCsvToJson(csvFile,jsonOutput);
        System.out.println("CSV ➜ JSON conversion done.");
    }
}
