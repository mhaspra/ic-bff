package ch.mhaspra.insurancecase.icbff.adapter.api.mapper;

import ch.mhaspra.insurancecase.icbff.adapter.api.model.Contract;
import ch.mhaspra.insurancecase.icbff.adapter.api.model.CustomerWithContracts;
import ch.mhaspra.insurancecase.icbff.adapter.api.model.Overview;
import ch.mhaspra.insurancecase.icbff.domain.customer.Customer;

import java.util.List;

public class OverviewMapper {
    public static Overview map(ch.mhaspra.insurancecase.icbff.domain.overview.Overview overview) {
        return new Overview().customers(CustomerMapper.map(overview.customer()));
    }
}
