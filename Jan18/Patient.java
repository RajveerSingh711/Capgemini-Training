package Jan18;

/*Create a Patient class with the following features:
Static:
○       A static variable hospitalName shared among all patients.
○       A static method getTotalPatients() to count the total patients admitted.
This:
○       Use this to initialize name, age, and ailment in the constructor.
Final:
○       Use a final variable patientID to uniquely identify each patient.
Instanceof:
○       Check if an object is an instance of the Patient class before displaying its details.
 */

import java.util.*;

public class Patient {
    static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: "+totalPatients);
    }
    private String name;
    private int age;
    private String ailment;
    private final int patientID;
    Patient(String name,int age,String ailment,int patientID){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientID=patientID;
        totalPatients++;
    }
    void displayDetails(Object obj){
        if(obj instanceof Patient){
            Patient p=(Patient) obj;
            System.out.println("Hospital Name: "+hospitalName);
            System.out.println("Patient ID: "+p.patientID);
            System.out.println("Name: "+p.name);
            System.out.println("Age: "+p.age);
            System.out.println("Ailment: "+p.ailment);
        }else{
            System.out.println("Object is not a Patient instance.");
        }
    }
    public static void main(String[] args) {
        Patient p1=new Patient("Rajveer Singh", 22, "Fever", 301);
        Patient p2=new Patient("John Doe", 30, "Migraine", 302);
        p1.displayDetails(p1);
        System.out.println();
        p2.displayDetails(p2);
        System.out.println();
        Patient.getTotalPatients();
    }
}
