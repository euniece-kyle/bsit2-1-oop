import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() { items = new ArrayList<>(); }

    public void addItem(Borrowable item) { items.add(item); }

    public void displayAllItems() {
        System.out.println("=== DISPLAYING ALL ITEMS ===");
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem) b;
            System.out.println(li.getItemInfo());
        }
    }

    public Borrowable findItemById(String itemId) {
        for (Borrowable b : items) {
            if (((LibraryItem)b).itemId.equals(itemId)) return b;
        }
        return null;
    }

    public boolean borrowItem(String itemId, String borrowerName) {
        Borrowable b = findItemById(itemId);
        if (b == null || !b.isAvailable()) return false;
        b.borrowItem(borrowerName);
        return true;
    }

    public boolean returnItem(String itemId) {
        Borrowable b = findItemById(itemId);
        if (b == null || b.isAvailable()) return false;
        b.returnItem();
        return true;
    }

    public void displayAvailableItems() {
        System.out.println("=== DISPLAYING AVAILABLE ITEMS ===");
        for (Borrowable b : items) {
            if (b.isAvailable()) {
                LibraryItem li = (LibraryItem)b;
                System.out.println(li.getItemInfo());
            }
        }
    }

    public double calculateTotalLateFees(int daysLate) {
        double total = 0;
        for (Borrowable b : items) {
            LibraryItem li = (LibraryItem)b;
            total += li.calculateLateFee(daysLate);
        }
        return total;
    }
}
