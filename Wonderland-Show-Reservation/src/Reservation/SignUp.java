package Reservation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignUp {
    public void signUp(Scanner sc) {
        System.out.print("Username: ");
        String user = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();
        try {
            File file = new File("login.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write(user + " " + pass + "\n");
            fw.close();
            System.out.println("Sign Up Successful");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
