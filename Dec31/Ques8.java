package Dec31;

/* Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

public class Ques8 {
    public static void main(String[] args){
        int radius_of_earth_in_km=6378;
        double radius_of_earth_in_miles=radius_of_earth_in_km/1.6;
        double volume_of_earth_in_km=(4*Math.PI*Math.pow(radius_of_earth_in_km,3))/3;
        double volume_of_earth_in_miles=(4*Math.PI*Math.pow(radius_of_earth_in_miles,3))/3;
        System.out.print("The volume of earth in cubic kilometers is "+volume_of_earth_in_km+" and cubic miles is "+volume_of_earth_in_miles);
    }
}
