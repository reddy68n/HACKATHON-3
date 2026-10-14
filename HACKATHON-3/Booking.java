class CinemaTicketBooking {
    String customerName;
    String movieName;
    double ticketPrice;
    int numberOfTickets;
    public CinemaTicketBooking(String name, String movie, double price, int count) {
        this.customerName = name;
        this.movieName = movie;
        this.ticketPrice = price;
        this.numberOfTickets = count;
    }
    public CinemaTicketBooking(String name, String movie, int count) {
        this.customerName = name;
        this.movieName = movie;
        this.ticketPrice = 200.0;
        this.numberOfTickets = count;
    }
    public void printSummary(boolean showTicketPrice) {
        double total = ticketPrice * numberOfTickets;
        double discount = 0;
        if (numberOfTickets >= 5) {
            discount = total * 0.10;
        }
        double finalAmount = total - discount;
        System.out.println("Customer Name : " + customerName);
        System.out.println("Movie Name : " + movieName);
        if (showTicketPrice) {
            System.out.println("Ticket Price : Rs. " + ticketPrice);
        }
        System.out.println("Number of Tickets : " + numberOfTickets);
        System.out.println("Booking Status : Booking Successful");
        System.out.println("Total Amount : Rs. " + total);
        System.out.println("Discount : Rs. " + discount);
        System.out.println("Final Amount : Rs. " + finalAmount);
        System.out.println();
    }
}
public class Booking{
    public static void main(String[] args) {
        CinemaTicketBooking booking1 = new CinemaTicketBooking("Sneha", "Avatar", 200.0, 5);
        booking1.printSummary(true);
        CinemaTicketBooking booking2 = new CinemaTicketBooking("Arjun", "Avatar", 2);
        booking2.printSummary(false);
    }
}