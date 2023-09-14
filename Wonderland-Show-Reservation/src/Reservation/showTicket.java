package Reservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class showTicket {

    public void buyTicket(Scanner sc) {
        String Show = null;
//        int n = sc.nextInt();
        System.out.println("Choose a show: from 1 to 10 as per the list");
        try {
            int n = sc.nextInt();
            File file = new File("availableshow.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String show = fileScanner.nextLine();

                if (show.startsWith(String.valueOf(n))) {
                    System.out.println("Selected show: " + show);
                    Show = show;

                }
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println(Show);

        sc.close();


        System.out.println("Choose a seat: 1: Front Seats, 2: Middle Seats, 3: VIP Seats");
        int showOption = sc.nextInt();

        String seatType = "";
        String theaterName = "";
        String Price = "";
        switch (showOption) {
            case 1:
                seatType = "Front Seats";
                theaterName = "Cineplex";
                Price = "1000";
                break;
            case 2:
                seatType = "Middle Seats";
                theaterName = "BlockBuster";
                Price = "800";
                break;
            case 3:
                seatType = "VIP Seats";
                theaterName = "Iris";
                Price = "1500";
                break;
            default:
                System.out.println("Invalid seat option");
                return;
        }

        System.out.println("Select seat number:");
        int seatNo = sc.nextInt();

        if (seatType.equals("VIP Seats") && (seatNo == 1 || seatNo == 2)) {
            System.out.println("Error: VIP seats 1 and 2 cannot be bought.");
        } else {
            receipt.generateReceipt("Show", "09/06/2023", "6:00 PM", theaterName, seatType, seatNo, Price);
        }

        }
    }




