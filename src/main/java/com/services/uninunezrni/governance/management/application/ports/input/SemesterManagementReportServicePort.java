package com.services.uninunezrni.governance.management.application.ports.input;

import com.services.uninunezrni.governance.management.domain.model.SemesterManagementReport;

import java.util.List;

public interface SemesterManagementReportServicePort {
    SemesterManagementReport save(SemesterManagementReport semesterManagementReport);
    SemesterManagementReport findById(Long id);
    List<SemesterManagementReport> findAll();
    SemesterManagementReport update(Long id, SemesterManagementReport semesterManagementReport);
    void deleteById(Long id);
}
