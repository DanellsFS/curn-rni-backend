package com.services.uninunezrni.governance.management.application.ports.output;

import com.services.uninunezrni.governance.management.domain.model.ManagementReport;

import java.util.List;
import java.util.Optional;

public interface ManagementReportPersistencePort {
    ManagementReport save(ManagementReport managementReport);
    Optional<ManagementReport> findById(Long id);
    List<ManagementReport> findAll();
    void deleteById(Long id);
}
