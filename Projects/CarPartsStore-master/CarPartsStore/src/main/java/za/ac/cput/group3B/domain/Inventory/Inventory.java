package za.ac.cput.group3b.domain.Inventory;

import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.domain.Part.Part;

import java.util.Objects;
import java.util.Set;

public class Inventory {

    private int itemQuantity;
    private String itemId, itemName, itemDescription;
    private double itemPrice;
    private Set<Part> parts;

    private Inventory() {}

    private Inventory(Builder builder) {
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
        this.itemDescription = builder.itemDescription;
        this.itemPrice = builder.itemPrice;
        this.itemQuantity = builder.itemQuantity;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public static class Builder {
        private int itemQuantity;
        private String itemId, itemName, itemDescription;
        private double itemPrice;
        private Set<Part> parts;

        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder itemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public Builder itemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
            return this;
        }

        public Builder itemPrice(double itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }

        public Builder itemQuantity(int itemQuantity) {
            this.itemQuantity = itemQuantity;
            return this;
        }

        public Inventory build() {
            return new Inventory(this);
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "Item Id: " + getItemId() +
                ", Item Name: '" + getItemName() + '\'' +
                ", Item Description: '" + getItemDescription() + '\'' +
                ", Item Price: R" + getItemPrice()+
                ", Item Quantity: " + getItemQuantity() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return itemId.equals(inventory.itemId);
    }

    @Override
    public int hashCode() { return Objects.hash(itemId); }
}
