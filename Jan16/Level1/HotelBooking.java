package Jan16.Level1;

/*Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
*/

import java.util.*;

public class HotelBooking{
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        System.out.println("Default called!");
        guestName="John Doe";
        roomType="Standard";
        nights=1;
    }
    HotelBooking(String g,String r,int n){
        this.guestName=g;
        this.roomType=r;
        this.nights=n;
    }
    HotelBooking(HotelBooking hb){
        System.out.println("Copy constructor called!");
        this.guestName=hb.guestName;
        this.roomType=hb.roomType;
        this.nights=hb.nights;
    }
    void display(){
        System.out.println(guestName+" | "+roomType+" | Nights: "+nights);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();
        String r=sc.nextLine();
        int n=sc.nextInt();
        HotelBooking h=new HotelBooking();
        h.display();
        HotelBooking h1=new HotelBooking(g,r,n);
        h1.display();
        HotelBooking h2=new HotelBooking(h1);
        h2.display();
    }
}
