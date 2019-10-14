package za.ac.cput.group3b.service.Inventory;

import za.ac.cput.group3b.domain.Inventory.Inventory;
import za.ac.cput.group3b.service.IService;

import java.util.Set;

public interface InventoryService extends IService<Inventory, String> {
    Set<Inventory> getAll();
}
