package Jan18;

/*Create a Vehicle class with the following features:
Static:
○       A static variable registrationFee common for all vehicles.
○       A static method updateRegistrationFee() to modify the fee.
This:
○       Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
○       Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
○       Check if an object belongs to the Vehicle class before displaying its registration
○       details.
*/

import java.util.*;

public class Vehicle {
    static double registrationFee=1500.0;
    static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
        System.out.println("Registration fee updated to ₹"+registrationFee);
    }
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    Vehicle(String ownerName,String vehicleType,String registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    void displayDetails(Object obj){
        if(obj instanceof Vehicle){
            Vehicle v=(Vehicle) obj;
            System.out.println("Owner Name: "+v.ownerName);
            System.out.println("Vehicle Type: "+v.vehicleType);
            System.out.println("Registration Number: "+v.registrationNumber);
            System.out.println("Registration Fee: ₹"+registrationFee);
        }else{
            System.out.println("Object is not a Vehicle instance.");
        }
    }
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Rajveer Singh", "Car", "KA01AB1234");
        Vehicle v2 = new Vehicle("John Doe", "Bike", "MH12XY5678");
        Vehicle.updateRegistrationFee(2000);
        System.out.println();
        v1.displayDetails(v1);
        System.out.println();
        v2.displayDetails(v2);
    }
}
