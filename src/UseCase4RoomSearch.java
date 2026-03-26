import java.util.*;

// Room Domain Model (ONLY details, no availability logic)
class Room {
    String type;
    int beds;
    int size;
    double price;

    public Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void display(int availability) {
        System.out.println(type + " Room:");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + price);
        System.out.println("Available: " + availability);
        System.out.println();
    }
}

// ✅ Search Service (READ ONLY)
class SearchService {

    private RoomInventory inventory;
    private List<Room> rooms;

    public SearchService(RoomInventory inventory) {
        this.inventory = inventory;

        // Room details (domain data)
        rooms = new ArrayList<>();
        rooms.add(new Room("Single", 1, 250, 1500.0));
        rooms.add(new Room("Double", 2, 400, 2500.0));
        rooms.add(new Room("Suite", 3, 750, 5000.0));
    }

    // Read-only search
    public void searchAvailableRooms() {
        System.out.println("Room Search\n");

        for (Room room : rooms) {
            int available = inventory.getAvailability(room.type);

            // Show only available rooms
            if (available > 0) {
                room.display(available);
            }
        }
    }
}

// Main class
public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Using RoomInventory from UC3 (not creating again)
        RoomInventory inventory = new RoomInventory();

        SearchService search = new SearchService(inventory);

        search.searchAvailableRooms();
    }
}