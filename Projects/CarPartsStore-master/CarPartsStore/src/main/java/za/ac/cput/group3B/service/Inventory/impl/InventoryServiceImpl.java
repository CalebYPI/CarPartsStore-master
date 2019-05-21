package za.ac.cput.group3b.service.Inventory.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Inventory.Inventory;
import za.ac.cput.group3b.repository.Inventory.InventoryRepository;
import za.ac.cput.group3b.service.Inventory.InventoryService;

import java.util.Set;

@Service("ServiceImpl")
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    @Qualifier("InMemory")
    private InventoryRepository repository;

    @Override
    public Inventory create(Inventory inventory) { return repository.create(inventory); }

    @Override
    public Inventory update(Inventory inventory) { return repository.update(inventory); }

    @Override
    public void delete(String s) { repository.delete(s); }

    @Override
    public Inventory read(String s) { return repository.read(s); }

    @Override
    public Set<Inventory> getAll() { return repository.getAll(); }
}
