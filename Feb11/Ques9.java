package Feb11;

/*2️⃣ Convert a list of Java objects into a JSON array.
*/

import com.fasterxml.jackson.databind.*;
import java.util.*;

class Student1{
    private String name;
    private int age;
    private String course;
    public Student1(String name,int age,String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }
}
public class Ques9 {
    public static void main(String[] args){
        try{
            List<Student1> students = Arrays.asList(
                    new Student1("Rajveer",21,"Computer Science"),
                    new Student1("Aman",23,"IT"),
                    new Student1("Priya",22,"Electronics")
            );
            ObjectMapper mapper=new ObjectMapper();
            String jsonArray=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
            System.out.println("JSON Array:");
            System.out.println(jsonArray);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
