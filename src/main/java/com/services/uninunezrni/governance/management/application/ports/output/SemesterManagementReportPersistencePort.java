package com.services.uninunezrni.governance.management.application.ports.output;

import com.services.uninunezrni.governance.management.domain.model.SemesterManagementReport;

import java.util.List;
import java.util.Optional;

public interface SemesterManagementReportPersistencePort {
    SemesterManagementReport save(SemesterManagementReport semesterManagementReport);
    Optional<SemesterManagementReport> findById(Long id);
    List<SemesterManagementReport> findAll();
    void deleteById(Long id);
}
