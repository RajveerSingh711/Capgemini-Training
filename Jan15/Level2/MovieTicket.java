package Jan15.Level2;

/*Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.
*/

import java.util.*;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked=false;
    void bookTicket(String movieName,int seatNumber,double price){
        if(!isBooked){
            this.movieName=movieName;
            this.seatNumber=seatNumber;
            this.price=price;
            isBooked=true;
            System.out.println("Ticket booked successfully!");
        }else System.out.println("Ticket already booked.");
    }
    void display(){
        if(isBooked){
            System.out.println("Movie Name: "+movieName);
            System.out.println("Seat Number: "+seatNumber);
            System.out.println("Ticket Price: "+price);
        } else System.out.println("No ticket booked yet.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket t = new MovieTicket();
        String name=sc.nextLine();
        int seat=sc.nextInt();
        double price=sc.nextDouble();
        t.bookTicket(name,seat,price);
        t.display();
    }
}
