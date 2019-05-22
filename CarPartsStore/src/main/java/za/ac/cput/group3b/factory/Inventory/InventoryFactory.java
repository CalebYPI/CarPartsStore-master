package za.ac.cput.group3b.factory.Inventory;

import za.ac.cput.group3b.domain.Inventory.Inventory;
import za.ac.cput.group3b.util.Misc;

public class InventoryFactory {
    public static Inventory getItem(String itemName, String itemDescription, double itemPrice, int itemQuantity) {
        return new Inventory.Builder()
                .itemId(Misc.generateId())
                .itemName(itemName)
                .itemDescription(itemDescription)
                .itemPrice(itemPrice)
                .itemQuantity(itemQuantity)
                .build();
    }
}
