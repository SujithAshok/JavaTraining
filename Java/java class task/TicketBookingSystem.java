import java.util.*;

class Event {
    String name;
    int totalSeats;
    Map<Integer, Boolean> seats;
    Queue<String> waitingList;

    public Event(String name, int totalSeats) {
        this.name = name;
        this.totalSeats = totalSeats;
        this.seats = new HashMap<>();
        for (int i = 1; i <= totalSeats; i++) {
            this.seats.put(i, true); // true indicates the seat is available
        }
        this.waitingList = new LinkedList<>();
    }
}

public class TicketBookingSystem {
    Map<String, Event> events;

    public TicketBookingSystem() {
        events = new HashMap<>();
    }

    public void addEvent(String eventName, int totalSeats) {
        if (!events.containsKey(eventName)) {
            Event event = new Event(eventName, totalSeats);
            events.put(eventName, event);
            System.out.println("Event " + eventName + " with " + totalSeats + " seats added successfully.");
        } else {
            System.out.println("Event already exists.");
        }
    }

    public void bookTicket(String eventName, String userName) {
        Event event = events.get(eventName);
        if (event == null) {
            System.out.println("Event not found.");
            return;
        }

        Integer availableSeat = event.seats.entrySet().stream()
                .filter(entry -> entry.getValue())
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        if (availableSeat != null) {
            event.seats.put(availableSeat, false); // mark seat as booked
            System.out.println("Ticket booked successfully for " + eventName + " seat number: " + availableSeat);
        } else {
            event.waitingList.add(userName);
            System.out.println("Event is fully booked. Added to waiting list.");
        }
    }

    public void cancelBooking(String eventName, int seatNumber) {
        Event event = events.get(eventName);
        if (event == null) {
            System.out.println("Event not found.");
            return;
        }

        if (event.seats.containsKey(seatNumber)) {
            event.seats.put(seatNumber, true); // mark seat as available
            System.out.println("Booking canceled for seat number: " + seatNumber);
            if (!event.waitingList.isEmpty()) {
                String userName = event.waitingList.poll();
                System.out.println("Seat assigned to waiting list user: " + userName);
            }
        } else {
            System.out.println("Invalid seat number.");
        }
    }

    public void viewAvailableSeats(String eventName) {
        Event event = events.get(eventName);
        if (event == null) {
            System.out.println("Event not found.");
            return;
        }

        System.out.println("Available seats for event " + eventName + ":");
        for (Map.Entry<Integer, Boolean> entry : event.seats.entrySet()) {
            if (entry.getValue()) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();
        bookingSystem.addEvent("Concert", 10);
        bookingSystem.addEvent("Play", 5);

        bookingSystem.bookTicket("Concert", "Alice");
        bookingSystem.bookTicket("Concert", "Bob");
        bookingSystem.bookTicket("Concert", "Charlie");
        bookingSystem.bookTicket("Concert", "Dave");
        bookingSystem.bookTicket("Concert", "Eve");
        bookingSystem.bookTicket("Concert", "Frank");
        bookingSystem.bookTicket("Concert", "Grace");
        bookingSystem.bookTicket("Concert", "Hank");
        bookingSystem.bookTicket("Concert", "Ivy");
        bookingSystem.bookTicket("Concert", "Jack");
        bookingSystem.bookTicket("Concert", "Kelly"); // Kelly should be added to waiting list

        bookingSystem.cancelBooking("Concert", 5); // Cancel Frank's booking

        bookingSystem.viewAvailableSeats("Concert");
    }
}
