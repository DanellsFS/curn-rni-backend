package com.services.uninunezrni.governance.application.service.management;

import com.services.uninunezrni.governance.application.ports.input.management.ManagementIndicatorServicePort;
import com.services.uninunezrni.governance.application.ports.output.management.ManagementIndicatorPersistencePort;
import com.services.uninunezrni.governance.domain.exception.agreement.AgreementNotFoundException;
import com.services.uninunezrni.governance.domain.exception.management.ManagementIndicatorNotFoundException;
import com.services.uninunezrni.governance.domain.model.management.ManagementIndicator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagementIndicatorService implements ManagementIndicatorServicePort {

    private final ManagementIndicatorPersistencePort persistencePort;

    @Override
    public ManagementIndicator save(ManagementIndicator managementIndicator) {
        return persistencePort.save(managementIndicator);
    }

    @Override
    public ManagementIndicator findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(ManagementIndicatorNotFoundException::new);
    }

    @Override
    public List<ManagementIndicator> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public ManagementIndicator update(Long id, ManagementIndicator managementIndicator) {
        return persistencePort.findById(id)
                .map(savedManagementIndicator -> {
                    savedManagementIndicator.setAnnualResult(managementIndicator.getAnnualResult());
                    return persistencePort.save(savedManagementIndicator);
                })
                .orElseThrow(AgreementNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new ManagementIndicatorNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
