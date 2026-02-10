package Feb10.Level1;

/*Write a program to create an instance of a Student class dynamically using Reflection without using the new keyword.
*/

class Student{
    private String name;
    private int rollNo;
    public Student(){
        name="Unknown";
        rollNo=0;
    }
    public void display(){
        System.out.println("Name: "+name+", Roll No: "+rollNo);
    }
}
public class Ques4 {
    public static void main(String[] args){
        try{
            Class<?> cls=Class.forName("Student");
            Object obj=cls.getDeclaredConstructor().newInstance();
            Student s=(Student) obj;
            s.display();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
