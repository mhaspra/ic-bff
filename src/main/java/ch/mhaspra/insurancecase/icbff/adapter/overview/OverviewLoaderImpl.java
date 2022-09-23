package ch.mhaspra.insurancecase.icbff.adapter.overview;

import ch.mhaspra.insurancecase.icbff.adapter.overview.dto.PartnerDto;
import ch.mhaspra.insurancecase.icbff.application.overview.OverviewLoader;
import ch.mhaspra.insurancecase.icbff.domain.overview.Overview;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OverviewLoaderImpl implements OverviewLoader {


    @Override
    public Overview load() {
        RestTemplate restTemplate = new RestTemplate();
        PartnerDto[] partner = restTemplate.getForObject("http://ic-overview-service.insurance-kafka.svc.cluster.local:8080/overview", PartnerDto[].class);

        return OverviewMapper.map(partner);
    }
}
