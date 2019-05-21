package za.ac.cput.group3b.factory.Inventory;

import za.ac.cput.group3b.domain.Inventory.Inventory;

public class InventoryFactory {
    public static Inventory getItem(String itemId, String itemName, String itemDescription, double itemPrice, int itemQuantity) {
        return new Inventory.Builder()
                .itemId(itemId)
                .itemName(itemName)
                .itemDescription(itemDescription)
                .itemPrice(itemPrice)
                .itemQuantity(itemQuantity)
                .build();
    }
}
