package Jan27;

/*Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.

Hint:
Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
When removing a ticket, update the circular pointers accordingly.
For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.
*/

public class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNo;
    String bookingTime;
    Ticket next;
    Ticket(int ticketId,String customerName,String movieName,String seatNo,String bookingTime){
        this.ticketId=ticketId;
        this.customerName=customerName;
        this.movieName=movieName;
        this.seatNo=seatNo;
        this.bookingTime=bookingTime;
        this.next=null;
    }
}
class TicketReservationSystem{
    Ticket head;
    void addTicket(int id,String customer,String movie,String seat,String time){
        Ticket newNode=new Ticket(id,customer,movie,seat,time);
        if(head==null){
            newNode.next=newNode;
            head=newNode;
            return;
        }
        Ticket temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }
    void removeByTicketId(int id){
        if(head==null){
            System.out.println("No tickets booked");
            return;
        }
        if(head.ticketId==id && head.next==head){
            head=null;
            System.out.println("Ticket cancelled");
            return;
        }
        if(head.ticketId==id){
            Ticket temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
            System.out.println("Ticket cancelled");
            return;
        }
        Ticket temp=head;
        while(temp.next!=head){
            if(temp.next.ticketId==id){
                temp.next=temp.next.next;
                System.out.println("Ticket cancelled");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Ticket not found");
    }
    void displayTickets(){
        if(head==null){
            System.out.println("No tickets booked");
            return;
        }
        Ticket temp=head;
        do{
            displayTicket(temp);
            temp=temp.next;
        }while(temp!=head);
    }
    void searchByCustomer(String name){
        if(head==null){
            System.out.println("No tickets booked");
            return;
        }
        Ticket temp=head;
        boolean found=false;
        do{
            if(temp.customerName.equalsIgnoreCase(name)){
                displayTicket(temp);
                found=true;
            }
            temp=temp.next;
        }while(temp!=head);
        if(!found) System.out.println("Ticket not found");
    }
    void searchByMovie(String movie){
        if(head==null){
            System.out.println("No tickets booked");
            return;
        }
        Ticket temp=head;
        boolean found=false;
        do{
            if(temp.movieName.equalsIgnoreCase(movie)){
                displayTicket(temp);
                found=true;
            }
            temp=temp.next;
        }while(temp!=head);
        if(!found) System.out.println("Ticket not found");
    }
    int countTickets(){
        if(head==null) return 0;
        int count=0;
        Ticket temp=head;
        do{
            count++;
            temp=temp.next;
        }while(temp!=head);
        return count;
    }
    void displayTicket(Ticket t){
        System.out.println(t.ticketId+" | "+t.customerName+" | "+t.movieName+" | "+t.seatNo+" | "+t.bookingTime);
    }
    public static void main(String[] args){
        TicketReservationSystem trs=new TicketReservationSystem();
        trs.addTicket(1,"Raj","Inception","A1","10:00 AM");
        trs.addTicket(2,"Aman","Inception","A2","10:05 AM");
        trs.addTicket(3,"Neha","Avatar","B1","10:10 AM");
        System.out.println("All Tickets:");
        trs.displayTickets();
        System.out.println("\nSearch by Movie:");
        trs.searchByMovie("Inception");
        trs.removeByTicketId(2);
        System.out.println("\nAfter Cancellation:");
        trs.displayTickets();
        System.out.println("\nTotal Tickets: "+trs.countTickets());
    }
}