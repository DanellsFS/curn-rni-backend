package com.services.uninunezrni.governance.application.ports.input.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementIndicator;

import java.util.List;

public interface ManagementIndicatorServicePort {
    ManagementIndicator save(ManagementIndicator managementIndicator);
    ManagementIndicator findById(Long id);
    List<ManagementIndicator> findAll();
    ManagementIndicator update(Long id, ManagementIndicator managementIndicator);
    void deleteById(Long id);

}
