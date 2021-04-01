package za.ac.cput.group3b.repository.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.group3b.domain.Transaction.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, String> {
}
