package Jan16.InstancevsClassVariablesandMethods;

/*Create a Vehicle class to manage the details of vehicles:
Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).
Methods:
An instance method displayVehicleDetails() to display owner and vehicle details.
A class method updateRegistrationFee() to change the registration fee.
*/

import java.util.*;

public class Vehicle{
    String ownerName,vehicleType;
    static double registrationFee=5000;
    Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
        System.out.println();
    }
    static void updateRegistrationFee(double updatedRegistrationFee){
        registrationFee=updatedRegistrationFee;
    }
    public static void main(String[] args){
        Vehicle v1=new Vehicle("Rajveer","SUV");
        Vehicle v2=new Vehicle("John Doe","Sedan");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
