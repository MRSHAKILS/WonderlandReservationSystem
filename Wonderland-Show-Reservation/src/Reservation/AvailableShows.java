package Reservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AvailableShows {
    public static void showAvailable() {
        System.out.println("Available Shows:");
        try {
            File file = new File("availableshow.txt");
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
