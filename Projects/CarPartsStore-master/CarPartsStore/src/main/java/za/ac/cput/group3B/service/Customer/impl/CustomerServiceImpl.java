package za.ac.cput.group3b.service.Customer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.repository.CustomerRepository;
import za.ac.cput.group3b.service.Customer.CustomerService;

import java.util.Set;

@Service("ServiceImpl")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    @Qualifier("InMemory")
    private CustomerRepository repository;

    @Override
    public Customer create(Customer customer) { return repository.create(customer); }

    @Override
    public Customer update(Customer customer) { return repository.update(customer); }

    @Override
    public void delete(String s) { repository.delete(s); }

    @Override
    public Customer read(String s) { return repository.read(s); }

    @Override
    public Set<Customer> getAll() { return repository.getAll(); }
}
