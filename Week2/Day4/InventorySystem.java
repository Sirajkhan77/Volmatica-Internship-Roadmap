package Week2.Day4;

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private Map<String, Integer> inventory;
    public InventorySystem() {
        this.inventory = new HashMap<>();
    }
    public void addStock(String productCode, int quantity) {
        if (quantity <= 0) {
            System.out.println("❌ Quantity to add must be greater than zero.");
            return;
        }
        int currentStock = inventory.getOrDefault(productCode, 0);
        inventory.put(productCode, currentStock + quantity);
        System.out.println("✅ Added " + quantity + " units to " + productCode + ". Total: " + inventory.get(productCode));
    }
    public void removeStock(String productCode, int quantity) {
        if (!inventory.containsKey(productCode)) {
            System.out.println("❌ Error: Product " + productCode + " does not exist in inventory.");
            return;
        }
        int currentStock = inventory.get(productCode);
        if (quantity > currentStock) {
            System.out.println("❌ Error: Not enough stock for " + productCode + ". Current stock: " + currentStock);
        } else {
            inventory.put(productCode, currentStock - quantity);
            System.out.println("📉 Removed " + quantity + " units of " + productCode + ". Remaining: " + inventory.get(productCode));
        }
    }

    // 3. Check stock level for a specific item
    public int checkStock(String productCode) {
        return inventory.getOrDefault(productCode, 0);
    }

    // 4. Display the entire inventory
    public void displayInventory() {
        System.out.println("\n--- Current Inventory ---");
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                System.out.println("Item Code: " + entry.getKey() + " | Quantity: " + entry.getValue());
            }
        }
        System.out.println("-------------------------\n");
    }

    // Main method to test the system
    public static void main(String[] args) {
        InventorySystem myStore = new InventorySystem();

        // Adding stock
        myStore.addStock("LAPTOP-01", 50);
        myStore.addStock("MOUSE-99", 200);

        // Increasing stock for an existing item
        myStore.addStock("LAPTOP-01", 10);

        // Removing stock (simulating a sale)
        myStore.removeStock("MOUSE-99", 5);

        // Trying to remove more stock than available
        myStore.removeStock("LAPTOP-01", 100);

        // Displaying final state
        myStore.displayInventory();
    }
}