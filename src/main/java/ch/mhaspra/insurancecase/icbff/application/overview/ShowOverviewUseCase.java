package ch.mhaspra.insurancecase.icbff.application.overview;

import ch.mhaspra.insurancecase.icbff.domain.contract.Contract;
import ch.mhaspra.insurancecase.icbff.domain.contract.ContractNumber;
import ch.mhaspra.insurancecase.icbff.domain.contract.Title;
import ch.mhaspra.insurancecase.icbff.domain.customer.Customer;
import ch.mhaspra.insurancecase.icbff.domain.customer.CustomerNumber;
import ch.mhaspra.insurancecase.icbff.domain.customer.Name;
import ch.mhaspra.insurancecase.icbff.domain.overview.Overview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
public class ShowOverviewUseCase {
    private final OverviewLoader overviewLoader;

    @Autowired
    public ShowOverviewUseCase(OverviewLoader overviewLoader) {
        this.overviewLoader = overviewLoader;
    }


    public Overview showOverview(){
        return overviewLoader.load();
    }

    public Flux<Customer> showOverviewReactive(){
        return overviewLoader.loadReactive();
    }
}
