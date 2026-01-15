package Jan15.Level1;

/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.
*/

import java.util.*;

public class MobilePhone{
    String brand,model;
    double price;
    void display(){
        System.out.println("Mobile Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MobilePhone m=new MobilePhone();
        m.brand=sc.nextLine();
        m.model=sc.nextLine();
        m.price=sc.nextDouble();
        m.display();
    }
}
