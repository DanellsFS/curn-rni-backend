package com.services.uninunezrni.governance.management.application.service;

import com.services.uninunezrni.governance.management.application.ports.input.SemesterManagementReportServicePort;
import com.services.uninunezrni.governance.management.application.ports.output.SemesterManagementReportPersistencePort;
import com.services.uninunezrni.governance.management.domain.exception.SemesterManagementReportNotFoundException;
import com.services.uninunezrni.governance.management.domain.model.SemesterManagementReport;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SemesterManagementReportService implements SemesterManagementReportServicePort {

    private final SemesterManagementReportPersistencePort persistencePort;

    @Override
    public SemesterManagementReport save(SemesterManagementReport semesterManagementReport) {
        return persistencePort.save(semesterManagementReport);
    }

    @Override
    public SemesterManagementReport findById(Long id) {
        return persistencePort.findById(id)
                .orElseThrow(SemesterManagementReportNotFoundException::new);
    }

    @Override
    public List<SemesterManagementReport> findAll() {
        return persistencePort.findAll();
    }

    @Override
    public SemesterManagementReport update(Long id, SemesterManagementReport semesterManagementReport) {
        return persistencePort.findById(id)
                .map(savedSemesterManagementReport -> {
                    savedSemesterManagementReport.setFormat(semesterManagementReport.getFormat());
                    return persistencePort.save(savedSemesterManagementReport);
                })
                .orElseThrow(SemesterManagementReportNotFoundException::new);
    }

    @Override
    public void deleteById(Long id) {
        if (persistencePort.findById(id).isEmpty()) {
            throw new SemesterManagementReportNotFoundException();
        }
        persistencePort.deleteById(id);
    }
}
