package za.ac.cput.group3b.factory.Customer;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.group3b.domain.Customer.Customer;

public class CustomerFactoryTest {
    @Test
    public void createCustomer() {
        Customer customer = new CustomerFactory.createCustomer("","");
        Assert.assertNotNull(customer);
    }
}