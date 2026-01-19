package Jan19.HybridInheritance;

/*Sample Problem 2: Vehicle Management System with Hybrid Inheritance
Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating how Java interfaces allow adding multiple behaviors.
*/

import java.util.*;

interface Refuelable{
    void refuel();
}
class Vehicle {
    protected int maxSpeed;
    protected String model;
    Vehicle(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    void displayInfo(){
        System.out.println("Model: "+model);
        System.out.println("Max Speed: "+maxSpeed+" km/h");
    }
}
class ElectricVehicle extends Vehicle{
    private int batteryCapacity;
    ElectricVehicle(int maxSpeed,String model,int batteryCapacity){
        super(maxSpeed,model);
        this.batteryCapacity=batteryCapacity;
    }
    void charge(){
        System.out.println("Charging electric vehicle ("+batteryCapacity+" kWh battery).");
    }
    void displayDetails(){
        displayInfo();
        charge();
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    private int fuelTankCapacity;
    PetrolVehicle(int maxSpeed,String model,int fuelTankCapacity){
        super(maxSpeed,model);
        this.fuelTankCapacity=fuelTankCapacity;
    }
    @Override
    public void refuel(){
        System.out.println("Refueling petrol vehicle ("+fuelTankCapacity+" liters tank).");
    }
    void displayDetails(){
        displayInfo();
        refuel();
    }
    public static void main(String[] args){
        ElectricVehicle ev=new ElectricVehicle(160,"Tesla Model 3",75);
        PetrolVehicle pv=new PetrolVehicle(180,"Honda City",40);
        ev.displayDetails();
        System.out.println();
        pv.displayDetails();
    }
}