package za.ac.cput.group3b.domain.Transaction;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Invoice {
    @Id
    private String orderNumber;

    protected Invoice() {}
}
