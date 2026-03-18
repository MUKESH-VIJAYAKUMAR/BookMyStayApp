import java.util.HashMap;
import java.util.Map;

// RoomInventory class - Single source of truth
class RoomInventory {

    // HashMap to store room type and available count
    private Map<String, Integer> inventory;

    // ✅ Correct constructor
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single", 5);
        inventory.put("Double", 3);
        inventory.put("Suite", 2);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    public boolean bookRoom(String roomType) {
        int available = getAvailability(roomType);

        if (available > 0) {
            inventory.put(roomType, available - 1);
            return true;
        }
        return false;
    }

    public void cancelRoom(String roomType) {
        int available = getAvailability(roomType);
        inventory.put(roomType, available + 1);
    }

    public void displayInventory() {
        System.out.println("Hotel Room Inventory Status:\n");

        System.out.println("Single Room:");
        System.out.println("Beds: 1");
        System.out.println("Size: 250 sqft");
        System.out.println("Price per night: 1500.0");
        System.out.println("Available Rooms: " + getAvailability("Single"));
        System.out.println();

        System.out.println("Double Room:");
        System.out.println("Beds: 2");
        System.out.println("Size: 400 sqft");
        System.out.println("Price per night: 2500.0");
        System.out.println("Available Rooms: " + getAvailability("Double"));
        System.out.println();

        System.out.println("Suite Room:");
        System.out.println("Beds: 3");
        System.out.println("Size: 750 sqft");
        System.out.println("Price per night: 5000.0");
        System.out.println("Available Rooms: " + getAvailability("Suite"));
    }
}

// Main class
public class UseCase3RoomInventory {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        System.out.println("\nBooking a Single Room...");
        if (inventory.bookRoom("Single")) {
            System.out.println("Booking successful!");
        } else {
            System.out.println("Booking failed!");
        }

        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();

        System.out.println("\nCancelling a Single Room...");
        inventory.cancelRoom("Single");

        System.out.println("\nFinal Inventory:");
        inventory.displayInventory();
    }
}