package Jan20;

/*3. Vehicle Rental System
Description: Design a system to manage vehicle rentals:
Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
Add an abstract method calculateRentalCost(int days).
Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
*/

import java.util.*;

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;
    Vehicle(String vehicleNumber,String type,double rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public abstract double calculateRentalCost(int days);
    public void displayDetails(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Type: "+type);
    }
}
class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    Car(String number,double rate,String policyNo){
        super(number,"Car",rate);
        this.insurancePolicyNumber=policyNo;
    }
    @Override
    public double calculateRentalCost(int days){
        return rentalRate*days;
    }
    @Override
    public double calculateInsurance(){
        return rentalRate*0.10;
    }
    @Override
    public String getInsuranceDetails(){
        return "Car Insurance (Policy Hidden)";
    }
}
class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    Bike(String number,double rate,String policyNo){
        super(number,"Bike",rate);
        this.insurancePolicyNumber=policyNo;
    }
    @Override
    public double calculateRentalCost(int days){
        return rentalRate*days;
    }
    @Override
    public double calculateInsurance(){
        return rentalRate*0.05;
    }
    @Override
    public String getInsuranceDetails(){
        return "Bike Insurance (Policy Hidden)";
    }
}
class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    Truck(String number,double rate,String policyNo){
        super(number,"Truck",rate);
        this.insurancePolicyNumber=policyNo;
    }
    @Override
    public double calculateRentalCost(int days){
        return rentalRate*days+1000;
    }
    @Override
    public double calculateInsurance(){
        return rentalRate*0.15;
    }
    @Override
    public String getInsuranceDetails(){
        return "Truck Insurance (Policy Hidden)";
    }
    public static void main(String[] args) {
        List<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Car("CAR101",2000,"C-INS-01"));
        vehicles.add(new Bike("BIKE202",500,"B-INS-02"));
        vehicles.add(new Truck("TRK303",4000,"T-INS-03"));
        int days=3;
        for(Vehicle v:vehicles){
            double rentalCost=v.calculateRentalCost(days);
            double insuranceCost=0;
            if(v instanceof Insurable){
                insuranceCost=((Insurable)v).calculateInsurance();
            }
            v.displayDetails();
            System.out.println("Rental Cost for "+days+" days: "+rentalCost);
            System.out.println("Insurance Cost: "+insuranceCost);
            System.out.println("Total Cost: "+(rentalCost+insuranceCost));
            System.out.println("------------------------");
        }
    }
}