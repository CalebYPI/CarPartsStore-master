package za.ac.cput.group3b.repository.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Customer.Customer;

import java.util.Set;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    Set<Customer> getAll();
}
