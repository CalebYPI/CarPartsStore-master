package za.ac.cput.group3b.factory.Customer;

import za.ac.cput.group3b.domain.Customer.Customer;
import za.ac.cput.group3b.util.Misc;

public class CustomerFactory {
    public static Customer createCustomer(String customerName, String customerContactNumber){
        return new Customer.Builder()
        .customerId(Misc.generateId())
        .customerName(customerName)
        .customerCustomerNumber(customerContactNumber)
        .build();
    }
}
