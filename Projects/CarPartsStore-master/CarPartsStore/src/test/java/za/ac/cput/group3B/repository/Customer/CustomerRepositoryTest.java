package za.ac.cput.group3b.repository.Customer;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.factory.Customer.CustomerFactory;
import za.ac.cput.group3b.repository.CustomerRepository;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository repository;
    private String customerId = null;

    @Test
    public void CustomerCreateTest() throws IOException {
        Customer customer = CustomerFactory.getCustomer("Steve");
        Customer result = repository.create(customer);
        customerId = result.getCustomerId();
        Assert.assertNotNull(customerId);
    }

    @Test
    public void SiteCustomerTest() throws IOException {
        Customer customer = repository.read(customerId);
        Assert.assertNotNull(customer);
    }
}
