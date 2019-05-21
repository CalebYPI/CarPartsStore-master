package za.ac.cput.group3b.factory.Customer;

import za.ac.cput.group3b.domain.Customer.Customer;

public class CustomerFactory {
    public static Customer getCustomer(String customerId, String customerName){
        return new Customer.Builder()
        .customerId(customerId)
        .customerName(customerName)
        .build();
    }
}
