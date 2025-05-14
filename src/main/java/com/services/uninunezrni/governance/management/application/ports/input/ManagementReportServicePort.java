package com.services.uninunezrni.governance.management.application.ports.input;

import com.services.uninunezrni.governance.management.domain.model.ManagementReport;

import java.util.List;

public interface ManagementReportServicePort {
    ManagementReport save(ManagementReport managementReport);
    ManagementReport findById(Long id);
    List<ManagementReport> findAll();
    ManagementReport update(Long id, ManagementReport managementReport);
    void deleteById(Long id);
}
