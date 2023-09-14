package Reservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ShowUpcomingShows {
    public static void Upcoming() {
        System.out.println("Upcoming Shows:");
        try {
            File file = new File("upcoming.txt");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}