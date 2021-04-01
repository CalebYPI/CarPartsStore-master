package za.ac.cput.group3b.domain.Customer;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Embeddable
public class Customer {
    @Id
    private String customerId;
    private String customerName;
    private String customerContactNumber;

    protected Customer() {}

    private Customer(Builder builder) {
        this.customerId = builder.customerId;
        this.customerName = builder.customerName;
        this.customerContactNumber = builder.customerContactNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerNumber() { return customerContactNumber; }

    public static class Builder {
        private String customerId, customerName;
        private String customerContactNumber;

        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerCustomerNumber(String number) {
            this.customerContactNumber = customerContactNumber;
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
                ", Customer Demography" + getCustomerNumber() +
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
