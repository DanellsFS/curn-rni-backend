package com.services.uninunezrni.governance.application.ports.input.management;

import com.services.uninunezrni.governance.domain.model.management.SemesterManagementReport;

import java.util.List;

public interface SemesterManagementReportServicePort {
    SemesterManagementReport save(SemesterManagementReport semesterManagementReport);
    SemesterManagementReport findById(Long id);
    List<SemesterManagementReport> findAll();
    SemesterManagementReport update(Long id, SemesterManagementReport semesterManagementReport);
    void deleteById(Long id);
}
