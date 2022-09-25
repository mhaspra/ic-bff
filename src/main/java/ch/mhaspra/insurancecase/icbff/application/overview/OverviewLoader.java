package ch.mhaspra.insurancecase.icbff.application.overview;

import ch.mhaspra.insurancecase.icbff.domain.customer.Customer;
import ch.mhaspra.insurancecase.icbff.domain.overview.Overview;
import reactor.core.publisher.Flux;

public interface OverviewLoader {
    Overview load();
    Flux<Customer> loadReactive();
}
