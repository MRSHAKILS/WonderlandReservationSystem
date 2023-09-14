package Reservation;

public class receipt {
    static void generateReceipt(String movieName, String date, String showTime, String theaterName,
                                String seatType, int seatNo, String price) {
        System.out.println("Receipt:");
        System.out.println("Show Name: " + movieName);
        System.out.println("Date: " + date);
        System.out.println("Show Time: " + showTime);
        System.out.println("Theater Name: " + theaterName);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Seat Number: " + seatNo);
        System.out.println("Price: " + price);
    }
}
