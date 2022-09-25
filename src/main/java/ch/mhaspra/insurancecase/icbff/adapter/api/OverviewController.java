package ch.mhaspra.insurancecase.icbff.adapter.api;

import ch.mhaspra.insurancecase.icbff.adapter.api.mapper.CustomerMapper;
import ch.mhaspra.insurancecase.icbff.adapter.api.mapper.OverviewMapper;
import ch.mhaspra.insurancecase.icbff.adapter.api.model.CustomerWithContracts;
import ch.mhaspra.insurancecase.icbff.adapter.api.model.Overview;
import ch.mhaspra.insurancecase.icbff.application.overview.ShowOverviewUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class OverviewController implements OverviewApi{
    private final ShowOverviewUseCase showOverviewUseCase;

    @Autowired
    public OverviewController(ShowOverviewUseCase showOverviewUseCase) {
        this.showOverviewUseCase = showOverviewUseCase;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/v1/overview")
    public ResponseEntity<Overview> overview(){
        var overview = showOverviewUseCase.showOverview();
        return new ResponseEntity<>(OverviewMapper.map(overview), HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/v1/overview-reactive")
    public Flux<CustomerWithContracts> overviewReactive(){
        var overview = showOverviewUseCase.showOverviewReactive();
        return overview.map(CustomerMapper::map);
    }

}
