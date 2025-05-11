package com.services.uninunezrni.governance.application.ports.output.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementReport;

import java.util.List;
import java.util.Optional;

public interface ManagementReportPersistencePort {
    ManagementReport save(ManagementReport managementReport);
    Optional<ManagementReport> findById(Long id);
    List<ManagementReport> findAll();
    void deleteById(Long id);
}
