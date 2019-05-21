package za.ac.cput.group3b.repository.Inventory.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Inventory.Inventory;
import za.ac.cput.group3b.repository.Inventory.InventoryRepository;

import java.util.*;

@Repository("InMemory")
public class InventoryRepositoryImpl implements InventoryRepository {
    private static InventoryRepositoryImpl repository = null;
    private Map<String, Inventory> items;

    private InventoryRepositoryImpl() { this.items = new HashMap<>(); }

    public static InventoryRepository getRepository() {
        if (repository == null) repository = new InventoryRepositoryImpl();
        return repository;
    }

    public Inventory create(Inventory inventory) {
        this.items.put(inventory.getItemId(), inventory);
        return this.items.get(inventory.getItemId());
    }

    public Inventory update(Inventory inventory) {
        this.items.replace(inventory.getItemId(), inventory);
        return this.items.get(inventory.getItemId());
    }

    public void delete(String s) { this.items.remove(s); }

    public Inventory read(String s) { return this.items.get(s); }

    public Set<Inventory> getAll() {
        Collection<Inventory> items = this.items.values();
        Set<Inventory> set = new HashSet<>();
        set.addAll(items);
        return set;
    }
}
