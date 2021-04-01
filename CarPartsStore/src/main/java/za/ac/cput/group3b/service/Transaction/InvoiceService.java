package za.ac.cput.group3b.service.Transaction;

import za.ac.cput.group3b.domain.Transaction.Invoice;
import za.ac.cput.group3b.service.IService;

import java.util.Set;

public interface InvoiceService extends IService<Invoice, String> {
    Set<Invoice> getAll();
}
