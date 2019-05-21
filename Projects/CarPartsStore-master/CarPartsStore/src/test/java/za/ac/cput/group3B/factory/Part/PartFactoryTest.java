package za.ac.cput.group3b.factory.Part;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.group3b.domain.Part.Part;

import static org.junit.Assert.*;

public class PartFactoryTest {

    private String testId, testName;
    private double testPrice;

    @Before
    public void setUp() throws Exception {
        this.testId = "testId";
        this.testName = "testName";
        this.testPrice = 1.00;
    }

    @Test
    public void getPart() {
        Part part = PartFactory.getPart(this.testId, this.testName, this.testPrice);
        Assert.assertNotNull(part.getPartId());
        Assert.assertNotNull(part);
    }
}