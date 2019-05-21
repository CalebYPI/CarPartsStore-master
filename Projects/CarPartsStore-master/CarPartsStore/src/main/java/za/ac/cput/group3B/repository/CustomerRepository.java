package za.ac.cput.group3b.repository;

import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.repository.IRepository;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer, String> {
    Set<Customer> getAll();
}
