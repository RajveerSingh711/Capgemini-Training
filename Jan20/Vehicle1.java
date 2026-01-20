package Jan20;

/*8. Ride-Hailing Application
Description: Develop a ride-hailing application:
Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
Use an interface GPS with methods getCurrentLocation() and updateLocation().
Secure driver and vehicle details using encapsulation.
Demonstrate polymorphism by creating a method to calculate fares for different vehicle types dynamically.
*/

import java.util.*;
interface GPS{
    String getCurrentLocation();
    void updateLocation(String location);
}
public abstract class Vehicle1 {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;
    Vehicle1(String vehicleId,String driverName,double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName(){
        return driverName;
    }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Driver Name: "+driverName);
    }
}
class Car1 extends Vehicle1 implements GPS{
    private String currentLocation;
    Car1(String id,String driver,double rate){
        super(id,driver,rate);
    }
    @Override
    public double calculateFare(double distance){
        return (ratePerKm*distance)+50;
    }
    @Override
    public String getCurrentLocation(){
        return currentLocation;
    }
    @Override
    public void updateLocation(String location){
        this.currentLocation=location;
    }
}
class Bike1 extends Vehicle1 implements GPS{
    private String currentLocation;
    Bike1(String id,String driver,double rate){
        super(id,driver,rate);
    }
    @Override
    public double calculateFare(double distance){
        return ratePerKm*distance;
    }
    @Override
    public String getCurrentLocation(){
        return currentLocation;
    }
    @Override
    public void updateLocation(String location){
        this.currentLocation=location;
    }
}
class Auto extends Vehicle1 implements GPS{
    private String currentLocation;
    Auto(String id,String driver,double rate){
        super(id,driver,rate);
    }
    @Override
    public double calculateFare(double distance){
        return (ratePerKm*distance)+20;
    }
    @Override
    public String getCurrentLocation(){
        return currentLocation;
    }
    @Override
    public void updateLocation(String location){
        this.currentLocation=location;
    }
    public static void main(String[] args){
        List<Vehicle1> rides=new ArrayList<>();
        rides.add(new Car1("CAR101","Raj",15));
        rides.add(new Bike1("BIKE202","John",8));
        rides.add(new Auto("AUTO303","John2",10));
        double distance=12.5;
        calculateFares(rides,distance);
    }
    static void calculateFares(List<Vehicle1> rides,double distance){
        for(Vehicle1 v:rides){
            v.getVehicleDetails();
            double fare=v.calculateFare(distance);
            System.out.println("Distance: "+distance+" km");
            System.out.println("Fare: "+fare);
            System.out.println("------------------------");
        }
    }
}
