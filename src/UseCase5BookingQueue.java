import java.util.LinkedList;
import java.util.Queue;

// Reservation class (represents a booking request)
class Reservation {
    String guestName;
    String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }
}

// Booking Request Queue
class BookingQueue {

    private Queue<Reservation> queue = new LinkedList<>();

    // Add request to queue
    public void addRequest(String guestName, String roomType) {
        queue.add(new Reservation(guestName, roomType));
    }

    // Process requests in FIFO order
    public void processRequests() {
        System.out.println("Booking Request Queue\n");

        while (!queue.isEmpty()) {
            Reservation r = queue.poll();

            System.out.println("Processing booking for Guest: "
                    + r.guestName + ", Room Type: " + r.roomType);
        }
    }
}

// Main class
public class UseCase5BookingQueue {

    public static void main(String[] args) {

        BookingQueue bookingQueue = new BookingQueue();

        // Adding booking requests (arrival order)
        bookingQueue.addRequest("Abhi", "Single");
        bookingQueue.addRequest("Subha", "Double");
        bookingQueue.addRequest("Vanmathi", "Suite");

        // Processing requests (FIFO)
        bookingQueue.processRequests();
    }
}