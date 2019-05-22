package za.ac.cput.group3b.repository.Inventory;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.group3b.domain.Inventory.Inventory;
import za.ac.cput.group3b.factory.Inventory.InventoryFactory;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class InventoryRepositoryTest {
    @Autowired
    private InventoryRepository repository;
    private String itemId = null;

    @Test
    public void InventoryCreateTest() throws IOException {
        Inventory inventory = InventoryFactory.getItem("2JZGE", "Toyota Supra Engine", 12000.00, 1);
        Inventory result = repository.create(inventory);
        itemId = result.getItemId();
        Assert.assertNotNull(itemId);
    }

    @Test
    public void SiteInventoryTest() throws IOException {
        Inventory inventory = repository.read(itemId);
        Assert.assertNotNull(inventory);
    }
}
