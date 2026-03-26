import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private Map<String, Integer> inventory;

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
        System.out.println("Hotel Room Inventory Status:");
        System.out.println("Single: " + getAvailability("Single"));
        System.out.println("Double: " + getAvailability("Double"));
        System.out.println("Suite: " + getAvailability("Suite"));
    }
}

public class UseCase3RoomInventory {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        inventory.bookRoom("Single");

        inventory.displayInventory();
    }
}