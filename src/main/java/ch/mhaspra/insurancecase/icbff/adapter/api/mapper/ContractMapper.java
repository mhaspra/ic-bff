package ch.mhaspra.insurancecase.icbff.adapter.api.mapper;

import ch.mhaspra.insurancecase.icbff.adapter.api.model.Contract;

import java.util.List;

public class ContractMapper {
    public static List<Contract> map(List<ch.mhaspra.insurancecase.icbff.domain.contract.Contract> contracts) {
        return contracts.stream().map(ContractMapper::map).toList();
    }

    private static Contract map(ch.mhaspra.insurancecase.icbff.domain.contract.Contract contract) {
        return new Contract()
                .id(contract.contractNumber().value())
                .title(contract.title().value());
    }
}
