package Reservation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    public boolean signIn(Scanner sc) {
        System.out.print("Username: ");
        String user = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();
        try {
            File file = new File("login.txt");
            Scanner fileScanner = new Scanner(file);
            boolean loginSuccessful = false;
            while (fileScanner.hasNext()) {
                String username = fileScanner.next();
                String password = fileScanner.next();
                if (user.equals(username) && pass.equals(password)) {
                    loginSuccessful = true;
                    break;
                }
            }
            fileScanner.close();
            if (loginSuccessful) {
                System.out.println("Login Successful");
                return true; // login Successful
            } else {
                System.out.println("Login Failed");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return false; // Return false to indicate failed login
    }
}
