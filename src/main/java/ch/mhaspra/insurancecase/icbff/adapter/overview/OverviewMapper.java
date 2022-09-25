package ch.mhaspra.insurancecase.icbff.adapter.overview;

import ch.mhaspra.insurancecase.icbff.adapter.overview.dto.PartnerDto;
import ch.mhaspra.insurancecase.icbff.domain.customer.Customer;
import ch.mhaspra.insurancecase.icbff.domain.customer.CustomerNumber;
import ch.mhaspra.insurancecase.icbff.domain.customer.Name;
import ch.mhaspra.insurancecase.icbff.domain.overview.Overview;

import java.util.Arrays;

public class OverviewMapper {
    public static Overview map(PartnerDto[] partner) {
        return new Overview(Arrays.stream(partner).map(OverviewMapper::map).toList());
    }

    public static Customer map(PartnerDto partnerDto){
        return new Customer(new CustomerNumber(partnerDto.partnerNr()), new Name(partnerDto.name()), ContractMapper.map(partnerDto.contracts()));
    }
}
