package za.ac.cput.group3b.factory.Customer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.group3b.domain.Customer.Customer;

import static org.junit.Assert.*;

public class CustomerFactoryTest {

    private String testId, testName;

    @Before
    public void setUp() throws Exception {
        this.testId = "testId";
        this.testName = "testName";
    }

    @Test
    public void getCustomer() {
        Customer customer = CustomerFactory.getCustomer(this.testId, this.testName);
        Assert.assertNotNull(customer.getCustomerId());
        Assert.assertNotNull(customer);
    }
}