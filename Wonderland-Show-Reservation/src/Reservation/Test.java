package Reservation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("Choose an option:");
            System.out.println("1. Sign In");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice:  ");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    loggedIn = signIn(sc);
                    break;
                case 2:
                    signUp(sc);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option\n\n");
            }
        }

        if (loggedIn) {
            System.out.println("Welcome! You are now logged in.");
            showUserMenu(sc);
        }
    }

    public static boolean signIn(Scanner sc) {
        Login login = new Login();
        return login.signIn(sc);
    }

    public static void signUp(Scanner sc) {
        SignUp signUp = new SignUp();
        signUp.signUp(sc);
    }

    public static void showUserMenu(Scanner sc) {
        showTicket showTicket = new showTicket();

        while (true) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Available Shows");
            System.out.println("2. Upcoming Movies");
            System.out.println("3. Exit");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    AvailableShows.showAvailable();
                    showTicket.buyTicket(sc);
                    break;
                case 2:
                    ShowUpcomingShows.Upcoming();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}


