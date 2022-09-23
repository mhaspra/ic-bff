package ch.mhaspra.insurancecase.icbff.adapter.overview;

import ch.mhaspra.insurancecase.icbff.adapter.overview.dto.ContractDto;
import ch.mhaspra.insurancecase.icbff.domain.contract.Contract;
import ch.mhaspra.insurancecase.icbff.domain.contract.ContractNumber;
import ch.mhaspra.insurancecase.icbff.domain.contract.Title;

import java.util.List;

public class ContractMapper {
    public static List<Contract> map(List<ContractDto> contracts) {
        return contracts.stream().map(ContractMapper::map).toList();
    }

    private static Contract map(ContractDto contractDto){
        return new Contract(new ContractNumber(contractDto.contractNr()), new Title(contractDto.title()));
    }
}
