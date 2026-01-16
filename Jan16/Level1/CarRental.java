package Jan16.Level1;

/*Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
 */

import java.util.*;

public class CarRental {
    String customerName,carModel;
    int rentalDays;
    int costPerDay;
    int total;
    CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        this.costPerDay=6000;
    }
    int calculateTotalCost(){
        total=rentalDays*costPerDay;
        return total;
    }
    void display() {
        System.out.println(customerName+" | "+carModel+" | Rental Days: "+rentalDays+" | Total Cost: ₹"+calculateTotalCost());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String model=sc.nextLine();
        int days=sc.nextInt();
        CarRental c=new CarRental(name,model,days);
        c.display();
    }
}
