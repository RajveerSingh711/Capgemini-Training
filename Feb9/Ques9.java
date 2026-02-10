package Feb9;

/*9️⃣ Convert CSV Data into Java Objects
Read a CSV file and convert each row into a Student Java object.
Store the objects in a List<Student> and print them.
*/

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

class Student{
    private int id;
    private String name;
    private int age;
    private double marks;
    public Student(int id,String name,int age,double marks){
        this.id=id;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return "Student{"+"id="+id+", name='"+name+'\''+", age="+age+", marks="+marks+'}';
    }
}
public class Ques9 {
    public static void main(String[] args){
        String filePath="students.csv";
        try(Stream<String> lines=Files.lines(Paths.get(filePath))){
            List<Student> students=lines.skip(1) .map(line->line.split("\\s*,\\s*")).map(data->new Student(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]))).collect(Collectors.toList());
            students.forEach(System.out::println);
        }catch(IOException e){
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
