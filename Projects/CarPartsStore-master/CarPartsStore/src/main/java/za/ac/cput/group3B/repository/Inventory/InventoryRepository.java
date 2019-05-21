package za.ac.cput.group3b.repository.Inventory;

import za.ac.cput.group3b.repository.IRepository;
import za.ac.cput.group3b.domain.Inventory.Inventory;

import java.util.Set;

public interface InventoryRepository extends IRepository<Inventory, String> {
    Set<Inventory> getAll();
}
