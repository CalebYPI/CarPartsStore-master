package za.ac.cput.group3b.domain.Customer;

import java.util.Objects;

public class Customer {
    private String customerId, customerName;

    private Customer() {}

    private Customer(Builder builder) {
        this.customerId = builder.customerId;
        this.customerName = builder.customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public static class Builder {
        private String customerId, customerName;

        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customer Id:" + getCustomerId() +
                ", Customer Name: '" + getCustomerName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customer.equals(customer.customerId);
    }

    @Override
    public int hashCode() { return Objects.hash(customerId); }
}
