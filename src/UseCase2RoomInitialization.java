
public class UseCase2RoomInitialization {

    /**
     * Abstract Room Class
     * Defines common structure for all room types.
     * @version 2.0
     */
    static abstract class Room {
        private int beds;
        private double size;
        private double price;

        public Room(int beds, double size, double price) {
            this.beds = beds;
            this.size = size;
            this.price = price;
        }

        public int getBeds() {
            return beds;
        }

        public double getSize() {
            return size;
        }

        public double getPrice() {
            return price;
        }

        public abstract void displayDetails();
    }

    /**
     * Single Room Class
     * @version 2.0
     */
    static class SingleRoom extends Room {
        public SingleRoom() {
            super(1, 250, 1500.0);
        }

        @Override
        public void displayDetails() {
            System.out.println("Single Room:");
            System.out.println("Beds: " + getBeds());
            System.out.println("Size: " + getSize() + " sqft");
            System.out.println("Price per night: " + getPrice());
        }
    }

    /**
     * Double Room Class
     * @version 2.0
     */
    static class DoubleRoom extends Room {
        public DoubleRoom() {
            super(2, 400, 2500.0);
        }

        @Override
        public void displayDetails() {
            System.out.println("Double Room:");
            System.out.println("Beds: " + getBeds());
            System.out.println("Size: " + getSize() + " sqft");
            System.out.println("Price per night: " + getPrice());
        }
    }

    /**
     * Suite Room Class
     * @version 2.0
     */
    static class SuiteRoom extends Room {
        public SuiteRoom() {
            super(3, 750, 5000.0);
        }

        @Override
        public void displayDetails() {
            System.out.println("Suite Room:");
            System.out.println("Beds: " + getBeds());
            System.out.println("Size: " + getSize() + " sqft");
            System.out.println("Price per night: " + getPrice());
        }
    }

    /**
     * Application Entry Point
     */
    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        // Create Room Objects (Polymorphism)
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static Availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display Output (matches your format)

        single.displayDetails();
        System.out.println("Available: " + singleAvailable + "\n");

        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailable + "\n");

        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}