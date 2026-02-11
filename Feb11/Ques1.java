package Feb11;

/*1️⃣ Create a JSON object for a Student with fields: name, age, and subjects (array).
*/

import java.util.*;
import com.fasterxml.jackson.databind.*;

class Student{
    private String name;
    private int age;
    private List<String> subjects;
    public Student(String name,int age,List<String> subjects){
        this.name=name;
        this.age=age;
        this.subjects=subjects;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public List<String> getSubjects(){
        return subjects;
    }
}
public class Ques1 {
    public static void main(String[] args) throws Exception{
        Student student=new Student("Rajveer Singh",21,Arrays.asList("Data Structures","OS","DBMS","Java"));
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(json);
    }
}
