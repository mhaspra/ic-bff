package ch.mhaspra.insurancecase.icbff.adapter.api.mapper;

import ch.mhaspra.insurancecase.icbff.adapter.api.model.CustomerWithContracts;
import ch.mhaspra.insurancecase.icbff.domain.customer.Customer;

import java.util.List;

public class CustomerMapper {
    public static List<CustomerWithContracts> map(List<Customer> customer) {
        return customer.stream().map(CustomerMapper::map).toList();
    }

    public static CustomerWithContracts map(Customer customer) {
        return new CustomerWithContracts()
                .id(customer.customerNumber().value())
                .name(customer.name().value())
                .contracts(ContractMapper.map(customer.contracts()));
    }
}
