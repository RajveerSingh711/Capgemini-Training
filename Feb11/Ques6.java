package Feb11;

/*6️⃣ Convert a list of Java objects into a JSON array.
*/

import com.fasterxml.jackson.databind.*;
import java.util.*;

class Car1{
    private String brand;
    private String model;
    private int year;
    public Car1(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
}
public class Ques6 {
    public static void main(String[] args){
        try{
            List<Car1> cars=Arrays.asList(
                    new Car1("Toyota","Camry",2022),
                    new Car1("Honda","Civic",2021),
                    new Car1("Hyundai","i20",2023)
            );
            ObjectMapper mapper=new ObjectMapper();
            String jsonArray=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cars);
            System.out.println("JSON Array:");
            System.out.println(jsonArray);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
