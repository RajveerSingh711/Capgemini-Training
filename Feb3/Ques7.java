package Feb2;

/*Write a Java program that stores student details (roll number, name, GPA) in a binary file and retrieves it later.
Requirements:
Use DataOutputStream to write primitive data.
Use DataInputStream to read data.
Ensure proper closing of resources.
*/

import java.util.*;
import java.io.*;

public class Ques7 {
    public static void main(String[] args){
        String fileName="students.dat";
        try(
                DataOutputStream dos=new DataOutputStream(new FileOutputStream(fileName))
        ){
            dos.writeInt(101);
            dos.writeUTF("Raj");
            dos.writeDouble(8.75);
            dos.writeInt(102);
            dos.writeUTF("Anita");
            dos.writeDouble(9.10);
            System.out.println("Student data written successfully.");
        }catch(IOException e){
            System.out.println("Error writing student data.");
            e.printStackTrace();
        }
        try(
                DataInputStream dis=new DataInputStream(new FileInputStream(fileName))
        ){
            System.out.println("\nStudent details read from file:");
            while(dis.available()>0){
                int roll=dis.readInt();
                String name=dis.readUTF();
                double gpa=dis.readDouble();
                System.out.println("Roll: "+roll+", Name: "+name+", GPA: "+gpa);
            }
        }catch(IOException e){
            System.out.println("Error reading student data.");
            e.printStackTrace();
        }
    }
}
