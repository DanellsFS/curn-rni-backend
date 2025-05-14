package com.services.uninunezrni.governance.management.application.ports.input;

import com.services.uninunezrni.governance.management.domain.model.ManagementIndicator;

import java.util.List;

public interface ManagementIndicatorServicePort {
    ManagementIndicator save(ManagementIndicator managementIndicator);
    ManagementIndicator findById(Long id);
    List<ManagementIndicator> findAll();
    ManagementIndicator update(Long id, ManagementIndicator managementIndicator);
    void deleteById(Long id);

}
