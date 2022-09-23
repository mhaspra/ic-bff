package ch.mhaspra.insurancecase.icbff.adapter.overview.dto;

import java.util.List;

public record PartnerDto(Long partnerNr, String name, List<ContractDto> contracts) {
}
