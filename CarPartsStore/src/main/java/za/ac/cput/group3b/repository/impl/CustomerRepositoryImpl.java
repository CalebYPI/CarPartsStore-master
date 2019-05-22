package za.ac.cput.group3b.repository.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.repository.CustomerRepository;

import java.util.*;

@Repository("InMemory")
public class CustomerRepositoryImpl implements CustomerRepository {
    private static CustomerRepositoryImpl repository = null;
    private Map<String, Customer>  customers;

    private CustomerRepositoryImpl() { this.customers = new HashMap<>(); }

    public static CustomerRepository getRepository() {
        if (repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }

    public Customer create(Customer customer) {
        this.customers.put(customer.getCustomerId(), customer);
        return this.customers.get(customer.getCustomerId());
    }

    public Customer update(Customer customer) {
        this.customers.replace(customer.getCustomerId(), customer);
        return this.customers.get(customer.getCustomerId());
    }

    public void delete(String customerId) { this.customers.remove(customerId); }

    public Customer read(String customerId) { return this.customers.get(customerId); }

    public Set<Customer> getAll() {
        Collection<Customer> customers = this.customers.values();
        Set<Customer> set = new HashSet<>();
        set.addAll(customers);
        return set;
    }
}
