package za.ac.cput.group3b.factory.Customer;

import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.util.Misc;

public class CustomerFactory {
    public static Customer getCustomer(String customerName){
        return new Customer.Builder()
        .customerId(Misc.generateId())
        .customerName(customerName)
        .build();
    }
}
