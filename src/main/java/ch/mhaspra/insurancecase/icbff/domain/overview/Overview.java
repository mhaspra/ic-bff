package ch.mhaspra.insurancecase.icbff.domain.overview;

import ch.mhaspra.insurancecase.icbff.domain.customer.Customer;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public record Overview(List<Customer> customer) {
    public List<Customer> customer(){
        return this.customer.stream().sorted(comparing(c -> c.customerNumber().value())).toList();
    }
}
