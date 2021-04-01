package za.ac.cput.group3b.repository.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Transaction.OrderPart;

@Repository
public interface OrderPartRepository extends JpaRepository<OrderPart, String> {
}
