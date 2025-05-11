package com.services.uninunezrni.governance.application.ports.input.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementReport;

import java.util.List;

public interface ManagementReportServicePort {
    ManagementReport save(ManagementReport managementReport);
    ManagementReport findById(Long id);
    List<ManagementReport> findAll();
    ManagementReport update(Long id, ManagementReport managementReport);
    void deleteById(Long id);
}
