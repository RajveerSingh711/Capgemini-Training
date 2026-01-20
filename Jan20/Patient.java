package Jan20;

/*7. Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.
*/

import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
public abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;
    Patient(int patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
    }
    public int getPatientId(){
        return patientId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setDiagnosis(String diagnosis){
        this.diagnosis=diagnosis;
    }
    public void setMedicalHistory(String medicalHistory){
        this.medicalHistory=medicalHistory;
    }
    public abstract double calculateBill();
    public void getPatientDetails(){
        System.out.println("Patient ID: "+patientId);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class InPatient extends Patient implements MedicalRecord{
    private int daysAdmitted;
    private double dailyCharge;
    private String records="";
    InPatient(int id,String name,int age,int days,double charge){
        super(id,name,age);
        this.daysAdmitted=days;
        this.dailyCharge=charge;
    }
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record){
        records+=record+"\n";
    }
    @Override
    public void viewRecords(){
        System.out.println("Medical Records:\n"+records);
    }
}
class OutPatient extends Patient implements MedicalRecord{
    private double consultationFee;
    private String records="";
    OutPatient(int id,String name,int age,double fee){
        super(id,name,age);
        this.consultationFee=fee;
    }
    @Override
    public double calculateBill(){
        return consultationFee;
    }
    @Override
    public void addRecord(String record){
        records+=record+"\n";
    }
    @Override
    public void viewRecords(){
        System.out.println("Medical Records:\n"+records);
    }
    public static void main(String[] args){
        List<Patient> patients=new ArrayList<>();
        Patient p1=new InPatient(101,"Raj",21,5,3000);
        Patient p2=new OutPatient(102,"John",30,800);
        ((MedicalRecord) p1).addRecord("Admitted for surgery");
        ((MedicalRecord) p2).addRecord("Routine check-up");
        patients.add(p1);
        patients.add(p2);
        for (Patient p:patients){
            p.getPatientDetails();
            System.out.println("Total Bill: "+p.calculateBill());
            if(p instanceof MedicalRecord){
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println("------------------------");
        }
    }
}
