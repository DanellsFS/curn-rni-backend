package com.services.uninunezrni.governance.management.application.ports.output;

import com.services.uninunezrni.governance.management.domain.model.ManagementIndicator;

import java.util.List;
import java.util.Optional;

public interface ManagementIndicatorPersistencePort {
    ManagementIndicator save(ManagementIndicator managementIndicator);
    Optional<ManagementIndicator> findById(Long id);
    List<ManagementIndicator> findAll();
    void deleteById(Long id);
}
