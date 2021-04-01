package za.ac.cput.group3b.service.Customer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.repository.Customer.CustomerRepository;
import za.ac.cput.group3b.service.Customer.CustomerService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl service = null;
    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer create(Customer customer) {
        return this.repository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        if (repository.existsById(customer.getCustomerId()))
            return this.repository.save(customer);
        return null;
    }

    @Override
    public boolean delete(String s) {
        this.repository.deleteById(s);
        if (repository.existsById(s))
            return false;
        else return true;
    }

    @Override
    public Customer read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public Set<Customer> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet()); }
}
