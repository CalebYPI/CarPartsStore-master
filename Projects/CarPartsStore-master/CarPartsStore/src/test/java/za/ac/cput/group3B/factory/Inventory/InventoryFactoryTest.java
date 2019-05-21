package za.ac.cput.group3b.factory.Inventory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.group3b.domain.Inventory.Inventory;

import static org.junit.Assert.*;

public class InventoryFactoryTest {

    private int testQuantity;
    private String testId, testName,  testDescription;
    private double testPrice;

    @Before
    public void setUp() throws Exception {
        this.testId = "testId";
        this.testName = "testName";
        this.testDescription = "testDescription";
        this.testPrice = 1.00;
        this.testQuantity = 1;
    }

    @Test
    public void getItem() {
        Inventory inventory = InventoryFactory.getItem(this.testId, this.testName, this.testDescription, this.testPrice, this.testQuantity);
        Assert.assertNotNull(inventory.getItemId());
        Assert.assertNotNull(inventory);
    }
}