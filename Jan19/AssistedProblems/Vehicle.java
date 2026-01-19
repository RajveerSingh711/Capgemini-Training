package Jan19.AssistedProblems;

/*Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.
 */

import java.util.*;

class Vehicle{
    protected int maxSpeed;
    protected String fuelType;
    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed: "+maxSpeed +" km/h");
        System.out.println("Fuel Type: "+fuelType);
    }
}
class Car extends Vehicle{
    private int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity) {
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        System.out.println("Vehicle Type: Car");
        super.displayInfo();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}
class Truck extends Vehicle{
    private double loadCapacity;
    Truck(int maxSpeed,String fuelType,double loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    void displayInfo(){
        System.out.println("Vehicle Type: Truck");
        super.displayInfo();
        System.out.println("Load Capacity: "+loadCapacity+" tons");
    }
}
class Motorcycle extends Vehicle{
    private boolean hasGear;
    Motorcycle(int maxSpeed,String fuelType,boolean hasGear){
        super(maxSpeed,fuelType);
        this.hasGear=hasGear;
    }
    @Override
    void displayInfo(){
        System.out.println("Vehicle Type: Motorcycle");
        super.displayInfo();
        System.out.println("Has Gear: "+hasGear);
    }
    public static void main(String[] args){
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car(180,"Petrol",5);
        vehicles[1]=new Truck(120,"Diesel",12.5);
        vehicles[2]=new Motorcycle(150,"Petrol",true);
        for(Vehicle v:vehicles){
            v.displayInfo();
            System.out.println();
        }
    }
}