package za.ac.cput.group3b.service.Transaction;

import za.ac.cput.group3b.domain.Transaction.OrderPart;
import za.ac.cput.group3b.service.IService;

import java.util.Set;

public interface OrderPartService extends IService<OrderPart, String> {
    Set<OrderPart> getAll();
}
