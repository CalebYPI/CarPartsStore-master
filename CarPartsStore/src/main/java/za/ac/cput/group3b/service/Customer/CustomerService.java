package za.ac.cput.group3b.service.Customer;

import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.service.IService;

import java.util.Set;

public interface CustomerService extends IService<Customer, String> {
    Set<Customer> getAll();
}
