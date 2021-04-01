package za.ac.cput.group3b.repository.Inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Inventory.Inventory;

import java.util.Set;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {
    Set<Inventory> getAll();
}
