package za.ac.cput.group3b.service.Inventory.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Inventory.Inventory;
import za.ac.cput.group3b.repository.Inventory.InventoryRepository;
import za.ac.cput.group3b.service.Inventory.InventoryService;

import java.util.Set;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository repository;

    @Override
    public Inventory create(Inventory inventory) { return this.repository.save(inventory); }

    @Override
    public Inventory update(Inventory inventory) {
        if (repository.existsById(inventory.getItemId()))
            return this.repository.save(inventory);
        return null;
        }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (repository.existsById(s))
            return false;
        else return true;
    }

    @Override
    public Inventory read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Set<Inventory> getAll() { return repository.getAll(); }
}
