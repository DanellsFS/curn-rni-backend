package com.services.uninunezrni.governance.application.ports.output.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementIndicator;

import java.util.List;
import java.util.Optional;

public interface ManagementIndicatorPersistencePort {
    ManagementIndicator save(ManagementIndicator managementIndicator);
    Optional<ManagementIndicator> findById(Long id);
    List<ManagementIndicator> findAll();
    void deleteById(Long id);
}
