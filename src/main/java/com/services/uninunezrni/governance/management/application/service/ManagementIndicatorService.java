package com.services.uninunezrni.governance.management.application.service;

import com.services.uninunezrni.governance.management.application.ports.input.ManagementIndicatorServicePort;
import com.services.uninunezrni.governance.management.application.ports.output.ManagementIndicatorPersistencePort;
import com.services.uninunezrni.governance.management.domain.exception.ManagementIndicatorNotFoundException;
import com.services.uninunezrni.governance.management.domain.model.ManagementIndicator;
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
                .orElseThrow(ManagementIndicatorNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new ManagementIndicatorNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
