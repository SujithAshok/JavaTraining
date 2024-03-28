import java.util.Scanner;

class Train {
    private int totalSeats;
    private int bookedSeats;

    public Train(int totalSeats) {
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public boolean bookTicket(int numSeats) {
        if (numSeats > 0 && numSeats <= totalSeats - bookedSeats) {
            bookedSeats += numSeats;
            System.out.println("Booking Successful! " + numSeats + " seat(s) booked.");
            return true;
        } else {
            System.out.println("Sorry, not enough seats available.");
            return false;
        }
    }

    public boolean cancelTicket(int numSeats) {
        if (numSeats > 0 && numSeats <= bookedSeats) {
            bookedSeats -= numSeats;
            System.out.println("Cancellation Successful! " + numSeats + " seat(s) cancelled.");
            return true;
        } else {
            System.out.println("Invalid number of seats to cancel.");
            return false;
        }
    }

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }
}

public class RailwayReservation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Railway Reservation System");

        System.out.print("Enter total number of seats in the train: ");
        int totalSeats = scanner.nextInt();
        Train train = new Train(totalSeats);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of seats to book: ");
                    int bookSeats = scanner.nextInt();
                    train.bookTicket(bookSeats);
                    break;
                case 2:
                    System.out.print("Enter number of seats to cancel: ");
                    int cancelSeats = scanner.nextInt();
                    train.cancelTicket(cancelSeats);
                    break;
                case 3:
                    System.out.println("Available Seats: " + train.getAvailableSeats());
                    break;
                case 4:
                    System.out.println("Thank you for using Railway Reservation System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
