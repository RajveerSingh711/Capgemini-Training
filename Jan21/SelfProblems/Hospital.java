package Jan21.SelfProblems;

/*Problem 3: Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations. A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication, which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
*/

import java.util.*;

class Patient{
    private String name;
    Patient(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
class Doctor{
    private String name;
    ArrayList<Patient> patients=new ArrayList<>();
    Doctor(String name){
        this.name=name;
    }
    void consult(Patient patient){
        patients.add(patient);
        System.out.println("Doctor "+name+" is consulting Patient "+patient.getName());
    }
    void showPatients(){
        System.out.println("Doctor: "+name);
        for (Patient p:patients){
            System.out.println("  Patient: "+p.getName());
        }
    }
    String getName(){
        return name;
    }
}
public class Hospital{
    private String hospitalName;
    ArrayList<Doctor> doctors=new ArrayList<>();
    ArrayList<Patient> patients=new ArrayList<>();
    Hospital(String hospitalName){
        this.hospitalName=hospitalName;
    }
    void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    void addPatient(Patient patient){
        patients.add(patient);
    }
    void showHospitalDetails(){
        System.out.println("Hospital: "+hospitalName);
        System.out.println("Doctors:");
        for (Doctor d:doctors){
            System.out.println("  "+d.getName());
        }
        System.out.println("Patients:");
        for(Patient p:patients){
            System.out.println("  "+p.getName());
        }
    }
    public static void main(String[] args){
        Hospital hospital=new Hospital("City Hospital");
        Doctor d1=new Doctor("Dr. Kumar");
        Doctor d2=new Doctor("Dr. Singh");
        Patient p1=new Patient("Rahul");
        Patient p2=new Patient("Anita");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
        System.out.println();
        d1.showPatients();
        System.out.println();
        d2.showPatients();
    }
}