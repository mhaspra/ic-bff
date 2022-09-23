package ch.mhaspra.insurancecase.icbff.domain.customer;

import ch.mhaspra.insurancecase.icbff.domain.contract.Contract;

import java.util.List;

public record Customer(CustomerNumber customerNumber, Name name, List<Contract> contracts){
}
