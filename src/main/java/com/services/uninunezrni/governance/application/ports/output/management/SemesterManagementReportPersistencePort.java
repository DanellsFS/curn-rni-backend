package com.services.uninunezrni.governance.application.ports.output.management;

import com.services.uninunezrni.governance.domain.model.management.SemesterManagementReport;

import java.util.List;
import java.util.Optional;

public interface SemesterManagementReportPersistencePort {
    SemesterManagementReport save(SemesterManagementReport semesterManagementReport);
    Optional<SemesterManagementReport> findById(Long id);
    List<SemesterManagementReport> findAll();
    void deleteById(Long id);
}
